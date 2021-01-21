package com.peterstev.fairmoney.data.network

import com.peterstev.fairmoney.models.UserDetail
import com.peterstev.fairmoney.models.Users
import io.reactivex.Flowable
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiService {
    @GET("user?limit=25")
    fun getUsers(): Flowable<Users>

    @GET("user/{id}")
    fun getUserDetail(@Path("id") userId: String): Flowable<UserDetail>
}