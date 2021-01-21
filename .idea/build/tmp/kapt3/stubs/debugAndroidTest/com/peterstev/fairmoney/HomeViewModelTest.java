package com.peterstev.fairmoney;

import java.lang.System;

@kotlinx.coroutines.ExperimentalCoroutinesApi()
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0017\u001a\u00020\u0018H\u0007J\b\u0010\u0019\u001a\u00020\u0018H\u0007J\b\u0010\u001a\u001a\u00020\u0018H\u0007J\b\u0010\u001b\u001a\u00020\u0018H\u0007J\b\u0010\u001c\u001a\u00020\u0018H\u0007J\b\u0010\u001d\u001a\u00020\u0018H\u0007R\u0013\u0010\u0003\u001a\u00020\u00048G\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\u0007\u001a\u00020\b8GX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0013\u0010\r\u001a\u00020\u000e8G\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0011\u001a\u00020\u00128\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016\u00a8\u0006\u001e"}, d2 = {"Lcom/peterstev/fairmoney/HomeViewModelTest;", "", "()V", "coroutineRule", "Lcom/peterstev/fairmoney/TestCoroutineRule;", "getCoroutineRule", "()Lcom/peterstev/fairmoney/TestCoroutineRule;", "hiltRule", "Ldagger/hilt/android/testing/HiltAndroidRule;", "getHiltRule", "()Ldagger/hilt/android/testing/HiltAndroidRule;", "setHiltRule", "(Ldagger/hilt/android/testing/HiltAndroidRule;)V", "testExecutorRule", "Lorg/junit/rules/TestRule;", "getTestExecutorRule", "()Lorg/junit/rules/TestRule;", "viewModel", "Lcom/peterstev/fairmoney/viewmodels/HomeViewModel;", "getViewModel", "()Lcom/peterstev/fairmoney/viewmodels/HomeViewModel;", "setViewModel", "(Lcom/peterstev/fairmoney/viewmodels/HomeViewModel;)V", "assert_livedata_is_not_empty", "", "assert_livedata_is_not_null", "assert_livedata_is_populated", "assert_userlivedata_is_updated", "assert_viewmodel_is_injected", "initialize", "app_debug"})
@dagger.hilt.android.testing.HiltAndroidTest()
public final class HomeViewModelTest {
    @org.jetbrains.annotations.NotNull()
    private dagger.hilt.android.testing.HiltAndroidRule hiltRule;
    @org.jetbrains.annotations.NotNull()
    private final org.junit.rules.TestRule testExecutorRule = null;
    @org.jetbrains.annotations.NotNull()
    private final com.peterstev.fairmoney.TestCoroutineRule coroutineRule = null;
    @javax.inject.Inject()
    public com.peterstev.fairmoney.viewmodels.HomeViewModel viewModel;
    
    @org.jetbrains.annotations.NotNull()
    @org.junit.Rule()
    public final dagger.hilt.android.testing.HiltAndroidRule getHiltRule() {
        return null;
    }
    
    public final void setHiltRule(@org.jetbrains.annotations.NotNull()
    dagger.hilt.android.testing.HiltAndroidRule p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @org.junit.Rule()
    public final org.junit.rules.TestRule getTestExecutorRule() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @org.junit.Rule()
    public final com.peterstev.fairmoney.TestCoroutineRule getCoroutineRule() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.peterstev.fairmoney.viewmodels.HomeViewModel getViewModel() {
        return null;
    }
    
    public final void setViewModel(@org.jetbrains.annotations.NotNull()
    com.peterstev.fairmoney.viewmodels.HomeViewModel p0) {
    }
    
    @org.junit.Before()
    public final void initialize() {
    }
    
    @org.junit.Test()
    public final void assert_viewmodel_is_injected() {
    }
    
    @org.junit.Test()
    public final void assert_livedata_is_not_null() {
    }
    
    @org.junit.Test()
    public final void assert_livedata_is_not_empty() {
    }
    
    @org.junit.Test()
    public final void assert_livedata_is_populated() {
    }
    
    @org.junit.Test()
    public final void assert_userlivedata_is_updated() {
    }
    
    public HomeViewModelTest() {
        super();
    }
}