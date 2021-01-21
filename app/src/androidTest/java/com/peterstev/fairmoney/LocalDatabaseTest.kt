package com.peterstev.fairmoney

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.room.Room
import androidx.test.core.app.ApplicationProvider
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.peterstev.fairmoney.data.local.database.LocalDatabase
import com.peterstev.fairmoney.models.Data
import org.junit.After
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class LocalDatabaseTest {

    @get:Rule
    val testExecutorRule: InstantTaskExecutorRule = InstantTaskExecutorRule()

    private val id = "0F8JIqi4zwvb77FGz6Wt"
    private val email = "heinz-georg.fiedler@example.com"
    private val lastName = "Fiedler"
    private val firstName = "Heinz-Georg"
    private val picture = "https://randomuser.me/api/portraits/men/81.jpg"
    private val title = "mr"

    private lateinit var userData: Data
    private lateinit var database: LocalDatabase

    @Before
    fun initDb() {
        userData = Data(id, email, firstName, lastName, picture, title)
        database = Room.inMemoryDatabaseBuilder(
            ApplicationProvider.getApplicationContext(),
            LocalDatabase::class.java
        ).allowMainThreadQueries().build()
    }

    @Test
    fun assert_result_empty_when_no_user_exists() {
        database.usersDao().getUser().test().assertNoValues()
    }

    @Test
    fun assert_insertion_success() {
        database.usersDao().insertUsers(userData).blockingAwait()
        database.usersDao().getUser().test().assertValue {
            it.lastName.equals(lastName)
        }
    }

    @Test
    fun assert_result_correct_when_user_exists() {
        database.usersDao().insertUsers(userData).blockingAwait()
        database.usersDao().getUser().test().assertValue(userData)
    }

    @Test
    fun assert_no_result_when_all_users_deleted() {
        database.usersDao().insertUsers(userData).blockingAwait()
        database.usersDao().getUser().test().assertValue(userData)
        database.usersDao().deleteUsers().test().assertNoValues()
    }

    @After
    fun closeDb() {
        database.close()
    }

}