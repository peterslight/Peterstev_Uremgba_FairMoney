package com.peterstev.fairmoney

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import com.google.common.truth.Truth.assertThat
import com.peterstev.fairmoney.repository.HomeRepository
import com.peterstev.fairmoney.utilities.observeOnce
import com.peterstev.fairmoney.viewmodels.HomeViewModel
import dagger.hilt.android.testing.HiltAndroidRule
import dagger.hilt.android.testing.HiltAndroidTest
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import kotlinx.coroutines.ExperimentalCoroutinesApi
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.rules.TestRule
import javax.inject.Inject

@HiltAndroidTest
@ExperimentalCoroutinesApi
class HomeViewModelTest {

    @get:Rule
    var hiltRule = HiltAndroidRule(this)

    @get:Rule
    val testExecutorRule: TestRule = InstantTaskExecutorRule()

    @get:Rule
    val coroutineRule = TestCoroutineRule()

    @Inject
    lateinit var viewModel: HomeViewModel

    @Inject
    lateinit var repository: HomeRepository

    @Before
    fun initialize() {
        hiltRule.inject()
        viewModel.fetchUsersLocally()
    }


    @Test
    fun assert_repo_is_injected() {
        assertThat(repository).isNotNull()
    }

    @Test
    fun assert_viewmodel_is_injected() {
        assertThat(viewModel).isNotNull()
    }


    @Test
    fun assert_livedata_is_not_null() {
        coroutineRule.runBlockingTest {
            val liveData = viewModel.getLiveData()
            assertThat(liveData).isNotNull()
        }
    }

    @Test
    fun assert_livedata_is_not_empty() {
        coroutineRule.runBlockingTest {
            val liveData = viewModel.getLiveData()
            liveData.observeOnce {
                assertThat(liveData.value!!.data).isNotEmpty()
            }
        }
    }

    @Test
    fun assert_livedata_is_populated() {
        coroutineRule.runBlockingTest {
            val liveData = viewModel.getLiveData()
            liveData.observeOnce {
                assertThat(liveData.value!!.data).hasSize(25)
            }
        }
    }

    @Test
    fun assert_userlivedata_is_updated() {
        coroutineRule.runBlockingTest {
            viewModel.setSelectedUser("FairMoneyUser")
            val user = viewModel.getSelectedUserId()
            assertThat(user).isNotEqualTo("FairMoney")
            assertThat(user).isEqualTo("FairMoneyUser")
        }
    }


    @Test
    fun assert_database_is_populated() {
        coroutineRule.runBlockingTest {
            val users = repository.getLocalUsers()
            users.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe({ userList ->
                    assert(userList.isNotEmpty())
                }, { error -> throw error })
        }
    }

    @Test
    fun assert_database_values_count() {
        coroutineRule.runBlockingTest {
            val users = repository.getLocalUsers()
            users.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe({ userList ->
                    assertThat(userList).hasSize(25)
                }, { error -> throw error })
        }
    }
}