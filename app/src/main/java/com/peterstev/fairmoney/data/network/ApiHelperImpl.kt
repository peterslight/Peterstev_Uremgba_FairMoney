package com.peterstev.fairmoney.data.network

import javax.inject.Inject

class ApiHelperImpl @Inject constructor(private val apiService: ApiService) : ApiHelper {
    override fun getUsers() = apiService.getUsers()
    override fun getUserDetail(userId: String) = apiService.getUserDetail(userId)
}