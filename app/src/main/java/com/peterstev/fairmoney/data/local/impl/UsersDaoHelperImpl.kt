package com.peterstev.fairmoney.data.local.impl

import com.peterstev.fairmoney.data.local.dao.UsersDAO
import com.peterstev.fairmoney.models.Data
import io.reactivex.Completable
import io.reactivex.Flowable
import javax.inject.Inject

class UsersDaoHelperImpl @Inject constructor(private val usersDao: UsersDAO) :
    UsersDaoHelper {
    override fun insertUsers(data: Data): Completable = usersDao.insertUsers(data)
    override fun getUsers(): Flowable<List<Data>> = usersDao.getAllUsers()
    override fun deleteUsers(): Completable = usersDao.deleteUsers()
}