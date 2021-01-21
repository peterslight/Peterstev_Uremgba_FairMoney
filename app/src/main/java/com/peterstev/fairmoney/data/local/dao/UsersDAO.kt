package com.peterstev.fairmoney.data.local.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.peterstev.fairmoney.models.Data
import io.reactivex.Completable
import io.reactivex.Flowable

@Dao
interface UsersDAO {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun insertUsers(data: Data): Completable

    @Query("SELECT * FROM ${Data.USERS_TABLE_NAME}")
    fun getAllUsers(): Flowable<List<Data>>


    @Query("SELECT * FROM ${Data.USERS_TABLE_NAME} LIMIT 1")
    fun getUser(): Flowable<Data>

    @Query("DELETE FROM ${Data.USERS_TABLE_NAME}")
    fun deleteUsers(): Completable
}