package com.peterstev.fairmoney.viewmodels

import android.annotation.SuppressLint
import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.peterstev.fairmoney.models.Data
import com.peterstev.fairmoney.repository.HomeRepository
import com.peterstev.fairmoney.utilities.Resource
import com.peterstev.fairmoney.utilities.logInfo
import com.peterstev.fairmoney.utilities.observeOnce
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers
import timber.log.Timber


@SuppressLint("CheckResult")
class HomeViewModel @ViewModelInject constructor(
    private val repository: HomeRepository
) :
    ViewModel() {
    private val compositeDisposable = CompositeDisposable()


    private val liveData = MutableLiveData<Resource<List<Data>>>()
    private val selectedUser = MutableLiveData<String>()


    fun getLiveData(): LiveData<Resource<List<Data>>> = liveData
    fun getSelectedUserId(): String = selectedUser.value!!
    fun setSelectedUser(userId: String) = selectedUser.postValue(userId)

    fun fetchUsers() {
        /*since we access a static API for data, we do no need to constantly request for data since we already have it in our livedata*/
        if (!liveData.value?.data.isNullOrEmpty()) return


        if (liveData.value?.data.isNullOrEmpty()) {
            liveData.postValue(Resource.loading(null))
        }

        logInfo("fetch from api")
        repository.getUsers().subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe({ users ->
                liveData.postValue(Resource.success(users.data))
            }, { error ->
                logInfo(error.message!!)
                liveData.postValue(Resource.error(error.message!!, null))
            }).also {
                saveUsersToDb()
            }
    }

    private fun saveUsersToDb() {
        liveData.observeOnce { resource ->
            resource.data!!.forEach { data ->
                repository.insertUsersToDb(data)
                    .subscribeOn(Schedulers.io())
                    .observeOn(Schedulers.io())
                    .subscribe({ }, {
                        Timber.i(it)
                    }).let {
                        compositeDisposable.add(it)
                    }
            }
        }
    }

    private fun deleteUsers() {
        liveData.postValue(Resource.loading(null))
        repository.deleteUsers().subscribeOn(Schedulers.io())
            .observeOn(Schedulers.io())
            .subscribe({
                liveData.postValue(Resource.success(null))
            }, {
                liveData.postValue(Resource.error(it.message!!, null))
                Timber.i(it)
            }).let { compositeDisposable.add(it) }
    }

    fun fetchUsersLocally() {
        /*since we access a static API for data, we do no need to constantly request for data since we already have it in our livedata*/
        if (!liveData.value?.data.isNullOrEmpty()) return

        logInfo("fetching locally")
        liveData.postValue(Resource.loading(null))
        repository.getLocalUsers().subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe({ users ->
                if (users.isNotEmpty())
                    liveData.postValue(Resource.success(users))
                else {
                    liveData.postValue(Resource.success(null))
                }
            }, { error ->
                liveData.postValue(Resource.error(error.message!!, null))
            })
            .let { compositeDisposable.add(it) }
    }

    override fun onCleared() {
        compositeDisposable.dispose()
        compositeDisposable.clear()
        super.onCleared()
    }
}