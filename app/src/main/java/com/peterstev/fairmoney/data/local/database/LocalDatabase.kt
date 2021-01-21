package com.peterstev.fairmoney.data.local.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.peterstev.fairmoney.data.local.dao.UsersDAO
import com.peterstev.fairmoney.models.Data

const val DB_VERSION = 1

const val DB_NAME = "fairmoney.db"

@Database(entities = [Data::class], version = DB_VERSION)
abstract class LocalDatabase : RoomDatabase() {

    abstract fun usersDao(): UsersDAO

    companion object {
        @Volatile
        private var instance: LocalDatabase? = null

        fun getInstance(context: Context): LocalDatabase =
            instance ?: synchronized(this) {
                instance ?: createInstance(context).also {
                    instance = it
                }
            }

        private fun createInstance(context: Context) =
            Room.databaseBuilder(context, LocalDatabase::class.java, DB_NAME)
                .fallbackToDestructiveMigration().build()
    }
}