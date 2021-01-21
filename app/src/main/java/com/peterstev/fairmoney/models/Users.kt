package com.peterstev.fairmoney.models

import com.google.gson.annotations.SerializedName


data class Users(
    @SerializedName("data")
    val `data`: List<Data>,
    @SerializedName("limit")
    val limit: Int,
    @SerializedName("offset")
    val offset: Int,
    @SerializedName("page")
    val page: Int,
    @SerializedName("total")
    val total: Int
)