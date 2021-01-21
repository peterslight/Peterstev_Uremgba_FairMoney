package com.peterstev.fairmoney.repository

import com.peterstev.fairmoney.data.network.ApiHelper
import javax.inject.Inject

class DetailRepository @Inject constructor(private val apiHelper: ApiHelper) {
    fun getUserDetails(userId: String) = apiHelper.getUserDetail(userId)
}