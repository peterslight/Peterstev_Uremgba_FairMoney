package com.peterstev.fairmoney.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/peterstev/fairmoney/repository/DetailRepository;", "", "apiHelper", "Lcom/peterstev/fairmoney/data/network/ApiHelper;", "(Lcom/peterstev/fairmoney/data/network/ApiHelper;)V", "getUserDetails", "Lio/reactivex/Flowable;", "Lcom/peterstev/fairmoney/models/UserDetail;", "userId", "", "app_debug"})
public final class DetailRepository {
    private final com.peterstev.fairmoney.data.network.ApiHelper apiHelper = null;
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Flowable<com.peterstev.fairmoney.models.UserDetail> getUserDetails(@org.jetbrains.annotations.NotNull()
    java.lang.String userId) {
        return null;
    }
    
    @javax.inject.Inject()
    public DetailRepository(@org.jetbrains.annotations.NotNull()
    com.peterstev.fairmoney.data.network.ApiHelper apiHelper) {
        super();
    }
}