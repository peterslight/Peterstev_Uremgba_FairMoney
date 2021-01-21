package com.peterstev.fairmoney.viewmodels

import android.annotation.SuppressLint
import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.peterstev.fairmoney.models.UserDetail
import com.peterstev.fairmoney.repository.DetailRepository
import com.peterstev.fairmoney.utilities.Resource
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

@SuppressLint("CheckResult")
class DetailViewModel @ViewModelInject constructor(private val repository: DetailRepository) :
    ViewModel() {
    private val liveData = MutableLiveData<Resource<UserDetail>>()

    fun getLiveData(): LiveData<Resource<UserDetail>> = liveData

    fun fetchUser(userId: String) {
        liveData.postValue(Resource.loading(null))
        repository.getUserDetails(userId).subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe({ user ->
                liveData.postValue(Resource.success(user))
            }, { error ->
                liveData.postValue(Resource.error(error.message!!, null))
            })
    }
}