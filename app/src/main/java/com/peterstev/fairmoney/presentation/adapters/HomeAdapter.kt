package com.peterstev.fairmoney.presentation.adapters

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.AppCompatTextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.RequestManager
import com.peterstev.fairmoney.R
import com.peterstev.fairmoney.databinding.FragmentHomeItemBinding
import com.peterstev.fairmoney.models.Data
import com.peterstev.fairmoney.utilities.capitalizeFirstCharacter
import de.hdodenhof.circleimageview.CircleImageView

@SuppressLint("SetTextI18n")
class HomeAdapter(
    private val itemList: MutableList<Data>,
    private val glide: RequestManager,
    private val listener: OnClickListener
) : RecyclerView.Adapter<HomeAdapter.HomeViewHolder>() {

    lateinit var binding: FragmentHomeItemBinding

    override
    fun onCreateViewHolder(parent: ViewGroup, viewType: Int):
            HomeViewHolder {
        binding =
            FragmentHomeItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return HomeViewHolder(binding.root, binding)
    }


    override fun getItemCount(): Int = itemList.size
    override fun onBindViewHolder(holder: HomeViewHolder, position: Int) =
        holder.bindViews(itemList[position], glide, listener)

    fun updateList(list: List<Data>?) {
        itemList.clear()
        itemList.addAll(list ?: emptyList())
        notifyDataSetChanged()
    }

    class HomeViewHolder(itemView: View, binding: FragmentHomeItemBinding) :
        RecyclerView.ViewHolder(itemView) {

        private val avatar: CircleImageView = binding.homeImgUserAvatar
        private val name: AppCompatTextView = binding.homeTvUserName
        private val email: AppCompatTextView = binding.homeTvUserEmail


        fun bindViews(userItem: Data, glide: RequestManager, listener: OnClickListener) {
            if (userItem.picture != null) {
                glide.load(userItem.picture)
                    .placeholder(R.color.black).into(avatar)
            }

            name.text = "${userItem.title!!.capitalizeFirstCharacter()}. ${userItem.firstName} ${userItem.lastName} "
            email.text = userItem.email

            itemView.setOnClickListener {
                listener.onUserClick(userItem.id)
            }
        }
    }
}