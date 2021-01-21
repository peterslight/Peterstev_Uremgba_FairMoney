package com.peterstev.fairmoney.repository

import com.peterstev.fairmoney.data.local.impl.UsersDaoHelperImpl
import com.peterstev.fairmoney.data.network.ApiHelper
import com.peterstev.fairmoney.models.Data
import io.reactivex.Completable
import io.reactivex.Flowable
import javax.inject.Inject

class HomeRepository @Inject constructor(
    private val apiHelper: ApiHelper,
    private val usersDaoHelperImpl: UsersDaoHelperImpl
) {
    fun getUsers() = apiHelper.getUsers()
    fun getLocalUsers(): Flowable<List<Data>> = usersDaoHelperImpl.getUsers()
    fun insertUsersToDb(data: Data): Completable = usersDaoHelperImpl.insertUsers(data)
    fun deleteUsers(): Completable = usersDaoHelperImpl.deleteUsers()

}