package com.peterstev.fairmoney.presentation.fragments;

import java.lang.System;

@android.annotation.SuppressLint(value = {"SetTextI18n"})
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u001a\u001a\u00020\u001bH\u0002J\b\u0010\u001c\u001a\u00020\u001bH\u0002J$\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"2\b\u0010#\u001a\u0004\u0018\u00010$H\u0016J\b\u0010%\u001a\u00020\u001bH\u0016J\u001a\u0010&\u001a\u00020\u001b2\u0006\u0010\'\u001a\u00020\u001e2\b\u0010#\u001a\u0004\u0018\u00010$H\u0016J\b\u0010(\u001a\u00020\u001bH\u0002J\u0010\u0010)\u001a\u00020\u001b2\u0006\u0010*\u001a\u00020+H\u0002J\b\u0010,\u001a\u00020\u001bH\u0002J\u0010\u0010-\u001a\u00020\u001b2\u0006\u0010.\u001a\u00020/H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0007\u001a\u00020\b8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001b\u0010\r\u001a\u00020\u000e8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0015\u001a\u00020\u00168BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0019\u0010\u0012\u001a\u0004\b\u0017\u0010\u0018\u00a8\u00060"}, d2 = {"Lcom/peterstev/fairmoney/presentation/fragments/DetailFragment;", "Landroidx/fragment/app/Fragment;", "()V", "binding", "Lcom/peterstev/fairmoney/databinding/FragmentDetailBinding;", "connectionDisposable", "Lio/reactivex/disposables/Disposable;", "glide", "Lcom/bumptech/glide/RequestManager;", "getGlide", "()Lcom/bumptech/glide/RequestManager;", "setGlide", "(Lcom/bumptech/glide/RequestManager;)V", "homeViewModel", "Lcom/peterstev/fairmoney/viewmodels/HomeViewModel;", "getHomeViewModel", "()Lcom/peterstev/fairmoney/viewmodels/HomeViewModel;", "homeViewModel$delegate", "Lkotlin/Lazy;", "progress", "Landroid/widget/ProgressBar;", "viewModel", "Lcom/peterstev/fairmoney/viewmodels/DetailViewModel;", "getViewModel", "()Lcom/peterstev/fairmoney/viewmodels/DetailViewModel;", "viewModel$delegate", "hideViews", "", "init", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onViewCreated", "view", "setupObserver", "showToast", "message", "", "showViews", "updateUi", "user", "Lcom/peterstev/fairmoney/models/UserDetail;", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class DetailFragment extends androidx.fragment.app.Fragment {
    private com.peterstev.fairmoney.databinding.FragmentDetailBinding binding;
    private final kotlin.Lazy viewModel$delegate = null;
    private final kotlin.Lazy homeViewModel$delegate = null;
    private io.reactivex.disposables.Disposable connectionDisposable;
    @javax.inject.Inject()
    public com.bumptech.glide.RequestManager glide;
    private android.widget.ProgressBar progress;
    private java.util.HashMap _$_findViewCache;
    
    private final com.peterstev.fairmoney.viewmodels.DetailViewModel getViewModel() {
        return null;
    }
    
    private final com.peterstev.fairmoney.viewmodels.HomeViewModel getHomeViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.bumptech.glide.RequestManager getGlide() {
        return null;
    }
    
    public final void setGlide(@org.jetbrains.annotations.NotNull()
    com.bumptech.glide.RequestManager p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void init() {
    }
    
    private final void hideViews() {
    }
    
    private final void showViews() {
    }
    
    private final void updateUi(com.peterstev.fairmoney.models.UserDetail user) {
    }
    
    private final void setupObserver() {
    }
    
    @java.lang.Override()
    public void onDestroy() {
    }
    
    private final void showToast(java.lang.String message) {
    }
    
    public DetailFragment() {
        super();
    }
}