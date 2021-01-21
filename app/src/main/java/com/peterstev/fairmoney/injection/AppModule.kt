package com.peterstev.fairmoney.injection

import android.app.Application
import android.content.Context
import com.bumptech.glide.Glide
import com.bumptech.glide.RequestManager
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.bumptech.glide.request.RequestOptions
import com.peterstev.fairmoney.R
import com.peterstev.fairmoney.data.local.dao.UsersDAO
import com.peterstev.fairmoney.data.local.database.LocalDatabase
import com.peterstev.fairmoney.data.local.impl.UsersDaoHelper
import com.peterstev.fairmoney.data.local.impl.UsersDaoHelperImpl
import com.peterstev.fairmoney.data.network.ApiHelper
import com.peterstev.fairmoney.data.network.ApiHelperImpl
import com.peterstev.fairmoney.data.network.ApiService
import com.peterstev.fairmoney.repository.DetailRepository
import com.peterstev.fairmoney.repository.HomeRepository
import com.peterstev.fairmoney.viewmodels.DetailViewModel
import com.peterstev.fairmoney.viewmodels.HomeViewModel
import com.readystatesoftware.chuck.ChuckInterceptor
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import dagger.hilt.android.qualifiers.ApplicationContext
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(ApplicationComponent::class)
class AppModule {

    @Provides
    @Singleton
    fun providesOkHTTPClient(application: Application): OkHttpClient {
        return OkHttpClient.Builder()
            .addInterceptor(
                ChuckInterceptor(application)
                    .showNotification(true)
                    .retainDataFor(ChuckInterceptor.Period.ONE_DAY)
            ).addInterceptor(
                Interceptor { chain ->
                    val builder = chain.request().newBuilder()
                    builder.addHeader(
                        application.getString(R.string.API_HEADER_KEY),
                        application.getString(R.string.API_KEY)
                    )
                    return@Interceptor chain.proceed(builder.build())
                }
            )
            .build()
    }

    @Provides
    @Singleton
    fun providesRetrofit(client: OkHttpClient, @ApplicationContext context: Context): Retrofit {
        return Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .client(client)
            .baseUrl(context.getString(R.string.BASE_URL))
            .build()
    }

    @Provides
    fun providesRequestOptions(): RequestOptions {
        return RequestOptions().diskCacheStrategy(DiskCacheStrategy.AUTOMATIC)
    }

    @Provides
    fun providesGlide(
        application: Application,
        requestOptions: RequestOptions
    ): RequestManager {
        return Glide.with(application).setDefaultRequestOptions(requestOptions)
    }

    @Provides
    @Singleton
    fun providesApiService(retrofit: Retrofit): ApiService = retrofit.create(ApiService::class.java)


    @Provides
    @Singleton
    fun providesApiHelper(apiHelperImpl: ApiHelperImpl): ApiHelper = apiHelperImpl

    @Provides
    @Singleton
    fun providesUserDAO(database: LocalDatabase): UsersDAO = database.usersDao()

    @Provides
    @Singleton
    fun providesDatabase(@ApplicationContext context: Context) = LocalDatabase.getInstance(context)

    @Provides
    @Singleton
    fun providesUserDaoHelper(usersDaoHelperImpl: UsersDaoHelperImpl): UsersDaoHelper =
        usersDaoHelperImpl

    @Provides
    fun providesHomeViewModel(
        repository: HomeRepository
    ): HomeViewModel {
        return HomeViewModel(repository)
    }

    @Provides
    fun providesDetailViewModel(
        repository: DetailRepository
    ): DetailViewModel {
        return DetailViewModel(repository)
    }
}