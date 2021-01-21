package com.peterstev.fairmoney.viewmodels;

import java.lang.System;

@android.annotation.SuppressLint(value = {"CheckResult"})
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u000e\u001a\u00020\u000fJ\u0006\u0010\u0010\u001a\u00020\u000fJ\u0006\u0010\u0011\u001a\u00020\u000fJ\u0018\u0010\u0012\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t0\u0013J\u0006\u0010\u0014\u001a\u00020\rJ\b\u0010\u0015\u001a\u00020\u000fH\u0014J\b\u0010\u0016\u001a\u00020\u000fH\u0002J\u000e\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\rR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lcom/peterstev/fairmoney/viewmodels/HomeViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/peterstev/fairmoney/repository/HomeRepository;", "(Lcom/peterstev/fairmoney/repository/HomeRepository;)V", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "liveData", "Landroidx/lifecycle/MutableLiveData;", "Lcom/peterstev/fairmoney/utilities/Resource;", "", "Lcom/peterstev/fairmoney/models/Data;", "selectedUser", "", "deleteUsers", "", "fetchUsers", "fetchUsersLocally", "getLiveData", "Landroidx/lifecycle/LiveData;", "getSelectedUserId", "onCleared", "saveUsersToDb", "setSelectedUser", "userId", "app_debug"})
public final class HomeViewModel extends androidx.lifecycle.ViewModel {
    private final io.reactivex.disposables.CompositeDisposable compositeDisposable = null;
    private final androidx.lifecycle.MutableLiveData<com.peterstev.fairmoney.utilities.Resource<java.util.List<com.peterstev.fairmoney.models.Data>>> liveData = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.String> selectedUser = null;
    private final com.peterstev.fairmoney.repository.HomeRepository repository = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.peterstev.fairmoney.utilities.Resource<java.util.List<com.peterstev.fairmoney.models.Data>>> getLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSelectedUserId() {
        return null;
    }
    
    public final void setSelectedUser(@org.jetbrains.annotations.NotNull()
    java.lang.String userId) {
    }
    
    public final void fetchUsers() {
    }
    
    private final void saveUsersToDb() {
    }
    
    public final void deleteUsers() {
    }
    
    public final void fetchUsersLocally() {
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
    
    @androidx.hilt.lifecycle.ViewModelInject()
    public HomeViewModel(@org.jetbrains.annotations.NotNull()
    com.peterstev.fairmoney.repository.HomeRepository repository) {
        super();
    }
}