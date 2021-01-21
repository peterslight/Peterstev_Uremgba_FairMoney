package com.peterstev.fairmoney.data.network;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tH\u0016J\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/peterstev/fairmoney/data/network/ApiHelperImpl;", "Lcom/peterstev/fairmoney/data/network/ApiHelper;", "apiService", "Lcom/peterstev/fairmoney/data/network/ApiService;", "(Lcom/peterstev/fairmoney/data/network/ApiService;)V", "getUserDetail", "Lio/reactivex/Flowable;", "Lcom/peterstev/fairmoney/models/UserDetail;", "userId", "", "getUsers", "Lcom/peterstev/fairmoney/models/Users;", "app_debug"})
public final class ApiHelperImpl implements com.peterstev.fairmoney.data.network.ApiHelper {
    private final com.peterstev.fairmoney.data.network.ApiService apiService = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Flowable<com.peterstev.fairmoney.models.Users> getUsers() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Flowable<com.peterstev.fairmoney.models.UserDetail> getUserDetail(@org.jetbrains.annotations.NotNull()
    java.lang.String userId) {
        return null;
    }
    
    @javax.inject.Inject()
    public ApiHelperImpl(@org.jetbrains.annotations.NotNull()
    com.peterstev.fairmoney.data.network.ApiService apiService) {
        super();
    }
}