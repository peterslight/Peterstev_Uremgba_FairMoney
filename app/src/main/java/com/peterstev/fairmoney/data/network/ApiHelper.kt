package com.peterstev.fairmoney.data.network

import com.peterstev.fairmoney.models.UserDetail
import com.peterstev.fairmoney.models.Users
import io.reactivex.Flowable

interface ApiHelper {
    fun getUsers() : Flowable<Users>
    fun getUserDetail(userId: String): Flowable<UserDetail>
}