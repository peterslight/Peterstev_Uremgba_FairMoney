package com.peterstev.fairmoney.data.local.impl;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0014\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0005H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0007H&\u00a8\u0006\n"}, d2 = {"Lcom/peterstev/fairmoney/data/local/impl/UsersDaoHelper;", "", "deleteUsers", "Lio/reactivex/Completable;", "getUsers", "Lio/reactivex/Flowable;", "", "Lcom/peterstev/fairmoney/models/Data;", "insertUsers", "data", "app_debug"})
public abstract interface UsersDaoHelper {
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Flowable<java.util.List<com.peterstev.fairmoney.models.Data>> getUsers();
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Completable insertUsers(@org.jetbrains.annotations.NotNull()
    com.peterstev.fairmoney.models.Data data);
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Completable deleteUsers();
}