package com.peterstev.fairmoney.data.local.impl

import com.peterstev.fairmoney.models.Data
import io.reactivex.Completable
import io.reactivex.Flowable

interface UsersDaoHelper {
    fun getUsers(): Flowable<List<Data>>
    fun insertUsers(data: Data): Completable
    fun deleteUsers(): Completable
}