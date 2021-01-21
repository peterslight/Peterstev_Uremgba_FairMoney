package com.peterstev.fairmoney.presentation.fragments

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ProgressBar
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import com.blongho.country_data.World
import com.bumptech.glide.RequestManager
import com.github.pwittchen.reactivenetwork.library.rx2.ReactiveNetwork
import com.peterstev.fairmoney.R
import com.peterstev.fairmoney.databinding.FragmentDetailBinding
import com.peterstev.fairmoney.models.UserDetail
import com.peterstev.fairmoney.utilities.Status
import com.peterstev.fairmoney.utilities.capitalizeFirstCharacter
import com.peterstev.fairmoney.utilities.formatDate
import com.peterstev.fairmoney.viewmodels.DetailViewModel
import com.peterstev.fairmoney.viewmodels.HomeViewModel
import dagger.hilt.android.AndroidEntryPoint
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.Disposable
import io.reactivex.schedulers.Schedulers
import timber.log.Timber
import javax.inject.Inject

@SuppressLint("SetTextI18n")
@AndroidEntryPoint
class DetailFragment : Fragment() {

    private lateinit var binding: FragmentDetailBinding
    private val viewModel: DetailViewModel by activityViewModels()
    private val homeViewModel: HomeViewModel by activityViewModels()
    private lateinit var connectionDisposable: Disposable

    @Inject
    lateinit var glide: RequestManager
    private lateinit var progress: ProgressBar

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentDetailBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        init()
        hideViews()
        setupObserver()
    }

    private fun init() {
        World.init(requireContext())
        progress = binding.detailProgress
        connectionDisposable = ReactiveNetwork.observeNetworkConnectivity(requireContext())
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe({ connection ->
                if (connection.available() && connection.detailedState().name == getString(R.string.NETWORK_CONNECTED)) {
                    val userId = homeViewModel.getSelectedUserId()
                    viewModel.fetchUser(userId)
                } else {
                    showToast("unable to fetch data, check your internet connection!!")
                }
            }, {
                showToast(it.message!!)
            })
    }

    private fun hideViews() {
        binding.detailTvUserName.visibility = View.GONE
        binding.detailTvUserLocation.visibility = View.GONE
        binding.detailTvUserState.visibility = View.GONE
        binding.detailUserImgFlag.visibility = View.GONE
        binding.detailTvUserEmail.visibility = View.GONE
        binding.detailTvUserDob.visibility = View.GONE
        binding.detailTvUserPhone.visibility = View.GONE
        progress.visibility = View.VISIBLE
    }

    private fun showViews() {
        binding.detailTvUserName.visibility = View.VISIBLE
        binding.detailTvUserLocation.visibility = View.VISIBLE
        binding.detailTvUserState.visibility = View.VISIBLE
        binding.detailUserImgFlag.visibility = View.VISIBLE
        binding.detailTvUserEmail.visibility = View.VISIBLE
        binding.detailTvUserDob.visibility = View.VISIBLE
        binding.detailTvUserPhone.visibility = View.VISIBLE
        progress.visibility = View.GONE
    }

    private fun updateUi(user: UserDetail) {
        glide.load(user.picture)
            .placeholder(R.color.black).into(binding.detailImgUserAvatar)
        binding.detailTvUserName.text =
            "${user.title.capitalizeFirstCharacter()}. ${user.firstName} ${user.lastName}"
        binding.detailTvUserLocation.text = "${user.location.street}  ${user.location.city}"
        binding.detailTvUserState.text = "${user.location.state}  ${user.location.country}"
        val flag = World.getFlagOf(user.location.country)
        binding.detailUserImgFlag.setImageResource(flag)
        binding.detailTvUserEmail.text = user.email
        binding.detailTvUserDob.text = user.dateOfBirth.formatDate()
        binding.detailTvUserPhone.text = user.phone
    }

    private fun setupObserver() {
        viewModel.getLiveData().observe(viewLifecycleOwner, {
            when (it.status) {
                Status.SUCCESS -> {
                    showViews()
                    updateUi(it.data!!)
                }
                Status.LOADING -> {
                    hideViews()
                }
                Status.ERROR -> {
                    hideViews()
                    progress.visibility = View.GONE
                    showToast(it.message!!)
                    Timber.i(it.message)
                }
            }
        })
    }

    override fun onDestroy() {
        connectionDisposable.dispose()
        viewModel.getLiveData().removeObservers(this)
        super.onDestroy()
    }

    private fun showToast(message: String) {
        Toast.makeText(requireContext(), message, Toast.LENGTH_LONG).show()
        Timber.i(message)
    }
}