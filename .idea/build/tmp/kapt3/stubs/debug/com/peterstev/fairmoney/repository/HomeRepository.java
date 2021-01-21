package com.peterstev.fairmoney.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010\u0007\u001a\u00020\bJ\u0012\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\nJ\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\nJ\u000e\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/peterstev/fairmoney/repository/HomeRepository;", "", "apiHelper", "Lcom/peterstev/fairmoney/data/network/ApiHelper;", "usersDaoHelperImpl", "Lcom/peterstev/fairmoney/data/local/impl/UsersDaoHelperImpl;", "(Lcom/peterstev/fairmoney/data/network/ApiHelper;Lcom/peterstev/fairmoney/data/local/impl/UsersDaoHelperImpl;)V", "deleteUsers", "Lio/reactivex/Completable;", "getLocalUsers", "Lio/reactivex/Flowable;", "", "Lcom/peterstev/fairmoney/models/Data;", "getUsers", "Lcom/peterstev/fairmoney/models/Users;", "insertUsersToDb", "data", "app_debug"})
public final class HomeRepository {
    private final com.peterstev.fairmoney.data.network.ApiHelper apiHelper = null;
    private final com.peterstev.fairmoney.data.local.impl.UsersDaoHelperImpl usersDaoHelperImpl = null;
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Flowable<com.peterstev.fairmoney.models.Users> getUsers() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Flowable<java.util.List<com.peterstev.fairmoney.models.Data>> getLocalUsers() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Completable insertUsersToDb(@org.jetbrains.annotations.NotNull()
    com.peterstev.fairmoney.models.Data data) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Completable deleteUsers() {
        return null;
    }
    
    @javax.inject.Inject()
    public HomeRepository(@org.jetbrains.annotations.NotNull()
    com.peterstev.fairmoney.data.network.ApiHelper apiHelper, @org.jetbrains.annotations.NotNull()
    com.peterstev.fairmoney.data.local.impl.UsersDaoHelperImpl usersDaoHelperImpl) {
        super();
    }
}