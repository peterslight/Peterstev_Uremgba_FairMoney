package com.peterstev.fairmoney.injection;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.android.components.ApplicationComponent.class})
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007J\u0012\u0010\u000b\u001a\u00020\f2\b\b\u0001\u0010\r\u001a\u00020\u000eH\u0007J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0007J\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0007J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0011\u001a\u00020\u001bH\u0007J\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0015\u001a\u00020\u0016H\u0007J\b\u0010\u001e\u001a\u00020\u0018H\u0007J\u001a\u0010\u001f\u001a\u00020\n2\u0006\u0010 \u001a\u00020\u001d2\b\b\u0001\u0010\r\u001a\u00020\u000eH\u0007J\u0010\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\fH\u0007J\u0010\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\'H\u0007\u00a8\u0006("}, d2 = {"Lcom/peterstev/fairmoney/injection/AppModule;", "", "()V", "providesApiHelper", "Lcom/peterstev/fairmoney/data/network/ApiHelper;", "apiHelperImpl", "Lcom/peterstev/fairmoney/data/network/ApiHelperImpl;", "providesApiService", "Lcom/peterstev/fairmoney/data/network/ApiService;", "retrofit", "Lretrofit2/Retrofit;", "providesDatabase", "Lcom/peterstev/fairmoney/data/local/database/LocalDatabase;", "context", "Landroid/content/Context;", "providesDetailViewModel", "Lcom/peterstev/fairmoney/viewmodels/DetailViewModel;", "repository", "Lcom/peterstev/fairmoney/repository/DetailRepository;", "providesGlide", "Lcom/bumptech/glide/RequestManager;", "application", "Landroid/app/Application;", "requestOptions", "Lcom/bumptech/glide/request/RequestOptions;", "providesHomeViewModel", "Lcom/peterstev/fairmoney/viewmodels/HomeViewModel;", "Lcom/peterstev/fairmoney/repository/HomeRepository;", "providesOkHTTPClient", "Lokhttp3/OkHttpClient;", "providesRequestOptions", "providesRetrofit", "client", "providesUserDAO", "Lcom/peterstev/fairmoney/data/local/dao/UsersDAO;", "database", "providesUserDaoHelper", "Lcom/peterstev/fairmoney/data/local/impl/UsersDaoHelper;", "usersDaoHelperImpl", "Lcom/peterstev/fairmoney/data/local/impl/UsersDaoHelperImpl;", "app_debug"})
@dagger.Module()
public final class AppModule {
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final okhttp3.OkHttpClient providesOkHTTPClient(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final retrofit2.Retrofit providesRetrofit(@org.jetbrains.annotations.NotNull()
    okhttp3.OkHttpClient client, @org.jetbrains.annotations.NotNull()
    @dagger.hilt.android.qualifiers.ApplicationContext()
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.bumptech.glide.request.RequestOptions providesRequestOptions() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.bumptech.glide.RequestManager providesGlide(@org.jetbrains.annotations.NotNull()
    android.app.Application application, @org.jetbrains.annotations.NotNull()
    com.bumptech.glide.request.RequestOptions requestOptions) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.peterstev.fairmoney.data.network.ApiService providesApiService(@org.jetbrains.annotations.NotNull()
    retrofit2.Retrofit retrofit) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.peterstev.fairmoney.data.network.ApiHelper providesApiHelper(@org.jetbrains.annotations.NotNull()
    com.peterstev.fairmoney.data.network.ApiHelperImpl apiHelperImpl) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.peterstev.fairmoney.data.local.dao.UsersDAO providesUserDAO(@org.jetbrains.annotations.NotNull()
    com.peterstev.fairmoney.data.local.database.LocalDatabase database) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.peterstev.fairmoney.data.local.database.LocalDatabase providesDatabase(@org.jetbrains.annotations.NotNull()
    @dagger.hilt.android.qualifiers.ApplicationContext()
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.peterstev.fairmoney.data.local.impl.UsersDaoHelper providesUserDaoHelper(@org.jetbrains.annotations.NotNull()
    com.peterstev.fairmoney.data.local.impl.UsersDaoHelperImpl usersDaoHelperImpl) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.peterstev.fairmoney.viewmodels.HomeViewModel providesHomeViewModel(@org.jetbrains.annotations.NotNull()
    com.peterstev.fairmoney.repository.HomeRepository repository) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.peterstev.fairmoney.viewmodels.DetailViewModel providesDetailViewModel(@org.jetbrains.annotations.NotNull()
    com.peterstev.fairmoney.repository.DetailRepository repository) {
        return null;
    }
    
    public AppModule() {
        super();
    }
}