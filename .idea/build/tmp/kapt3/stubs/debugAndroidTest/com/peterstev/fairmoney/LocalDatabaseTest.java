package com.peterstev.fairmoney;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0007J\b\u0010\u0014\u001a\u00020\u0013H\u0007J\b\u0010\u0015\u001a\u00020\u0013H\u0007J\b\u0010\u0016\u001a\u00020\u0013H\u0007J\b\u0010\u0017\u001a\u00020\u0013H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0006X\u0082D\u00a2\u0006\u0002\n\u0000R\u0013\u0010\u000b\u001a\u00020\f8G\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0006X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lcom/peterstev/fairmoney/LocalDatabaseTest;", "", "()V", "database", "Lcom/peterstev/fairmoney/data/local/database/LocalDatabase;", "email", "", "firstName", "id", "lastName", "picture", "testExecutorRule", "Landroidx/arch/core/executor/testing/InstantTaskExecutorRule;", "getTestExecutorRule", "()Landroidx/arch/core/executor/testing/InstantTaskExecutorRule;", "title", "userData", "Lcom/peterstev/fairmoney/models/Data;", "assert_insertion_success", "", "assert_result_correct_when_user_exists", "assert_result_empty_when_no_user_exists", "closeDb", "initDb", "app_debug"})
@org.junit.jupiter.api.TestMethodOrder(value = org.junit.jupiter.api.MethodOrderer.OrderAnnotation.class)
@org.junit.runner.RunWith(value = androidx.test.ext.junit.runners.AndroidJUnit4.class)
public final class LocalDatabaseTest {
    @org.jetbrains.annotations.NotNull()
    private final androidx.arch.core.executor.testing.InstantTaskExecutorRule testExecutorRule = null;
    private final java.lang.String id = "0F8JIqi4zwvb77FGz6Wt";
    private final java.lang.String email = "heinz-georg.fiedler@example.com";
    private final java.lang.String lastName = "Fiedler";
    private final java.lang.String firstName = "Heinz-Georg";
    private final java.lang.String picture = "https://randomuser.me/api/portraits/men/81.jpg";
    private final java.lang.String title = "mr";
    private com.peterstev.fairmoney.models.Data userData;
    private com.peterstev.fairmoney.data.local.database.LocalDatabase database;
    
    @org.jetbrains.annotations.NotNull()
    @org.junit.Rule()
    public final androidx.arch.core.executor.testing.InstantTaskExecutorRule getTestExecutorRule() {
        return null;
    }
    
    @org.junit.Before()
    public final void initDb() {
    }
    
    @org.junit.jupiter.api.Order(value = 1)
    @org.junit.Test()
    public final void assert_result_empty_when_no_user_exists() {
    }
    
    @org.junit.jupiter.api.Order(value = 2)
    @org.junit.Test()
    public final void assert_insertion_success() {
    }
    
    @org.junit.jupiter.api.Order(value = 3)
    @org.junit.Test()
    public final void assert_result_correct_when_user_exists() {
    }
    
    @org.junit.After()
    public final void closeDb() {
    }
    
    public LocalDatabaseTest() {
        super();
    }
}