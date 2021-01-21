package com.peterstev.fairmoney.data.local.database;

import java.lang.System;

@androidx.room.Database(entities = {com.peterstev.fairmoney.models.Data.class}, version = 1)
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&\u00a8\u0006\u0006"}, d2 = {"Lcom/peterstev/fairmoney/data/local/database/LocalDatabase;", "Landroidx/room/RoomDatabase;", "()V", "usersDao", "Lcom/peterstev/fairmoney/data/local/dao/UsersDAO;", "Companion", "app_debug"})
public abstract class LocalDatabase extends androidx.room.RoomDatabase {
    private static volatile com.peterstev.fairmoney.data.local.database.LocalDatabase instance;
    @org.jetbrains.annotations.NotNull()
    public static final com.peterstev.fairmoney.data.local.database.LocalDatabase.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.peterstev.fairmoney.data.local.dao.UsersDAO usersDao();
    
    public LocalDatabase() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/peterstev/fairmoney/data/local/database/LocalDatabase$Companion;", "", "()V", "instance", "Lcom/peterstev/fairmoney/data/local/database/LocalDatabase;", "createInstance", "context", "Landroid/content/Context;", "getInstance", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.peterstev.fairmoney.data.local.database.LocalDatabase getInstance(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
        
        private final com.peterstev.fairmoney.data.local.database.LocalDatabase createInstance(android.content.Context context) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}