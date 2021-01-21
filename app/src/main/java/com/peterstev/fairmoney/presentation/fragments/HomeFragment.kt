package com.peterstev.fairmoney.presentation.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ProgressBar
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.NavController
import androidx.navigation.Navigation.findNavController
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.RequestManager
import com.github.pwittchen.reactivenetwork.library.rx2.ReactiveNetwork
import com.peterstev.fairmoney.R
import com.peterstev.fairmoney.databinding.FragmentHomeBinding
import com.peterstev.fairmoney.models.Data
import com.peterstev.fairmoney.presentation.adapters.HomeAdapter
import com.peterstev.fairmoney.presentation.adapters.OnClickListener
import com.peterstev.fairmoney.utilities.Status
import com.peterstev.fairmoney.viewmodels.HomeViewModel
import dagger.hilt.android.AndroidEntryPoint
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.Disposable
import io.reactivex.schedulers.Schedulers
import timber.log.Timber
import javax.inject.Inject

@AndroidEntryPoint
class HomeFragment : Fragment(), OnClickListener {

    private lateinit var navController: NavController
    private lateinit var progress: ProgressBar
    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: HomeAdapter
    private lateinit var binding: FragmentHomeBinding
    private val viewModel: HomeViewModel by activityViewModels()
    private lateinit var connectionDisposable: Disposable

    @Inject
    lateinit var glide: RequestManager

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setUpViews()
        setupObserver()
    }

    private fun setUpViews() {
        navController = findNavController(requireActivity(), R.id.nav_host_fragment)

        recyclerView = binding.homeRecyclerView
        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        recyclerView.setHasFixedSize(true)
        adapter = HomeAdapter(mutableListOf(), glide, this)
        recyclerView.adapter = adapter

        progress = binding.homeProgress

        /*check for internet connection, then fetch data else pull from local db*/
        connectionDisposable = ReactiveNetwork.observeNetworkConnectivity(requireContext())
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe({ connection ->
                if (connection.available() && connection.detailedState().name == getString(R.string.NETWORK_CONNECTED)) {
                    viewModel.fetchUsers()
                } else {
                    viewModel.fetchUsersLocally().also {
                        showToast("showing offline data")
                    }
                }
            }, {
                showToast(it.message!!)
            })
    }

    private fun setupObserver() {
        viewModel.getLiveData().observe(viewLifecycleOwner, {
            when (it.status) {
                Status.SUCCESS -> {
                    if (it.data.isNullOrEmpty()) showToast("no available data, check your connection")
                    refreshList(it.data)
                    Timber.i(it.message)
                    progress.visibility = View.GONE
                }
                Status.LOADING -> {
                    progress.visibility = View.VISIBLE
                }
                Status.ERROR -> {
                    progress.visibility = View.GONE
                    showToast(it.message!!)
                    Timber.i(it.message)
                }
            }
        })
    }


    private fun refreshList(users: List<Data>?) {
        adapter.updateList(users)
    }

    private fun showToast(message: String) {
        Timber.i(message)
        Toast.makeText(requireContext(), message, Toast.LENGTH_SHORT).show()
    }

    override fun onUserClick(userId: String) {
        viewModel.setSelectedUser(userId)
        findNavController().navigate(HomeFragmentDirections.actionHomefragmentToDetailfragment())
    }

    override fun onDestroy() {
        viewModel.getLiveData().removeObservers(this)
        connectionDisposable.dispose()
        super.onDestroy()
    }

}