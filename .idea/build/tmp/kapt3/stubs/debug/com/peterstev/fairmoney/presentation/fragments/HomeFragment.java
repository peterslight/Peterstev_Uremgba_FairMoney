package com.peterstev.fairmoney.presentation.fragments;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J$\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\b\u0010$\u001a\u00020%H\u0016J\u0010\u0010&\u001a\u00020%2\u0006\u0010\'\u001a\u00020(H\u0016J\u001a\u0010)\u001a\u00020%2\u0006\u0010*\u001a\u00020\u001d2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\u0018\u0010+\u001a\u00020%2\u000e\u0010,\u001a\n\u0012\u0004\u0012\u00020.\u0018\u00010-H\u0002J\b\u0010/\u001a\u00020%H\u0002J\b\u00100\u001a\u00020%H\u0002J\u0010\u00101\u001a\u00020%2\u0006\u00102\u001a\u00020(H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0016\u001a\u00020\u00178BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0018\u0010\u0019\u00a8\u00063"}, d2 = {"Lcom/peterstev/fairmoney/presentation/fragments/HomeFragment;", "Landroidx/fragment/app/Fragment;", "Lcom/peterstev/fairmoney/presentation/adapters/OnClickListener;", "()V", "adapter", "Lcom/peterstev/fairmoney/presentation/adapters/HomeAdapter;", "binding", "Lcom/peterstev/fairmoney/databinding/FragmentHomeBinding;", "connectionDisposable", "Lio/reactivex/disposables/Disposable;", "glide", "Lcom/bumptech/glide/RequestManager;", "getGlide", "()Lcom/bumptech/glide/RequestManager;", "setGlide", "(Lcom/bumptech/glide/RequestManager;)V", "navController", "Landroidx/navigation/NavController;", "progress", "Landroid/widget/ProgressBar;", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "viewModel", "Lcom/peterstev/fairmoney/viewmodels/HomeViewModel;", "getViewModel", "()Lcom/peterstev/fairmoney/viewmodels/HomeViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "", "onUserClick", "userId", "", "onViewCreated", "view", "refreshList", "users", "", "Lcom/peterstev/fairmoney/models/Data;", "setUpViews", "setupObserver", "showToast", "message", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class HomeFragment extends androidx.fragment.app.Fragment implements com.peterstev.fairmoney.presentation.adapters.OnClickListener {
    private androidx.navigation.NavController navController;
    private android.widget.ProgressBar progress;
    private androidx.recyclerview.widget.RecyclerView recyclerView;
    private com.peterstev.fairmoney.presentation.adapters.HomeAdapter adapter;
    private com.peterstev.fairmoney.databinding.FragmentHomeBinding binding;
    private final kotlin.Lazy viewModel$delegate = null;
    private io.reactivex.disposables.Disposable connectionDisposable;
    @javax.inject.Inject()
    public com.bumptech.glide.RequestManager glide;
    private java.util.HashMap _$_findViewCache;
    
    private final com.peterstev.fairmoney.viewmodels.HomeViewModel getViewModel() {
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
    
    private final void setUpViews() {
    }
    
    private final void setupObserver() {
    }
    
    @java.lang.Override()
    public void onDestroy() {
    }
    
    private final void refreshList(java.util.List<com.peterstev.fairmoney.models.Data> users) {
    }
    
    private final void showToast(java.lang.String message) {
    }
    
    @java.lang.Override()
    public void onUserClick(@org.jetbrains.annotations.NotNull()
    java.lang.String userId) {
    }
    
    public HomeFragment() {
        super();
    }
}