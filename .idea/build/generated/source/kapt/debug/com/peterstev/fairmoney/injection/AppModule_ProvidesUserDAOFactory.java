package com.peterstev.fairmoney.injection;

import com.peterstev.fairmoney.data.local.dao.UsersDAO;
import com.peterstev.fairmoney.data.local.database.LocalDatabase;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AppModule_ProvidesUserDAOFactory implements Factory<UsersDAO> {
  private final AppModule module;

  private final Provider<LocalDatabase> databaseProvider;

  public AppModule_ProvidesUserDAOFactory(AppModule module,
      Provider<LocalDatabase> databaseProvider) {
    this.module = module;
    this.databaseProvider = databaseProvider;
  }

  @Override
  public UsersDAO get() {
    return providesUserDAO(module, databaseProvider.get());
  }

  public static AppModule_ProvidesUserDAOFactory create(AppModule module,
      Provider<LocalDatabase> databaseProvider) {
    return new AppModule_ProvidesUserDAOFactory(module, databaseProvider);
  }

  public static UsersDAO providesUserDAO(AppModule instance, LocalDatabase database) {
    return Preconditions.checkNotNull(instance.providesUserDAO(database), "Cannot return null from a non-@Nullable @Provides method");
  }
}
