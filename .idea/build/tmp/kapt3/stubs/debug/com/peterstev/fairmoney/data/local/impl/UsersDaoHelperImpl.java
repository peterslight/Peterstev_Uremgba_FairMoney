package com.peterstev.fairmoney.data.local.impl;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\u0014\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bH\u0016J\u0010\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/peterstev/fairmoney/data/local/impl/UsersDaoHelperImpl;", "Lcom/peterstev/fairmoney/data/local/impl/UsersDaoHelper;", "usersDao", "Lcom/peterstev/fairmoney/data/local/dao/UsersDAO;", "(Lcom/peterstev/fairmoney/data/local/dao/UsersDAO;)V", "deleteUsers", "Lio/reactivex/Completable;", "getUsers", "Lio/reactivex/Flowable;", "", "Lcom/peterstev/fairmoney/models/Data;", "insertUsers", "data", "app_debug"})
public final class UsersDaoHelperImpl implements com.peterstev.fairmoney.data.local.impl.UsersDaoHelper {
    private final com.peterstev.fairmoney.data.local.dao.UsersDAO usersDao = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Completable insertUsers(@org.jetbrains.annotations.NotNull()
    com.peterstev.fairmoney.models.Data data) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Flowable<java.util.List<com.peterstev.fairmoney.models.Data>> getUsers() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Completable deleteUsers() {
        return null;
    }
    
    @javax.inject.Inject()
    public UsersDaoHelperImpl(@org.jetbrains.annotations.NotNull()
    com.peterstev.fairmoney.data.local.dao.UsersDAO usersDao) {
        super();
    }
}