package com.peterstev.fairmoney.viewmodels;

import java.lang.System;

@android.annotation.SuppressLint(value = {"CheckResult"})
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u0012\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u000eR\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/peterstev/fairmoney/viewmodels/DetailViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/peterstev/fairmoney/repository/DetailRepository;", "(Lcom/peterstev/fairmoney/repository/DetailRepository;)V", "liveData", "Landroidx/lifecycle/MutableLiveData;", "Lcom/peterstev/fairmoney/utilities/Resource;", "Lcom/peterstev/fairmoney/models/UserDetail;", "fetchUser", "", "userId", "", "getLiveData", "Landroidx/lifecycle/LiveData;", "app_debug"})
public final class DetailViewModel extends androidx.lifecycle.ViewModel {
    private final androidx.lifecycle.MutableLiveData<com.peterstev.fairmoney.utilities.Resource<com.peterstev.fairmoney.models.UserDetail>> liveData = null;
    private final com.peterstev.fairmoney.repository.DetailRepository repository = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.peterstev.fairmoney.utilities.Resource<com.peterstev.fairmoney.models.UserDetail>> getLiveData() {
        return null;
    }
    
    public final void fetchUser(@org.jetbrains.annotations.NotNull()
    java.lang.String userId) {
    }
    
    @androidx.hilt.lifecycle.ViewModelInject()
    public DetailViewModel(@org.jetbrains.annotations.NotNull()
    com.peterstev.fairmoney.repository.DetailRepository repository) {
        super();
    }
}