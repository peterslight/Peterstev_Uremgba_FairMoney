package com.peterstev.fairmoney.injection;

import android.content.Context;
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
public final class AppModule_ProvidesDatabaseFactory implements Factory<LocalDatabase> {
  private final AppModule module;

  private final Provider<Context> contextProvider;

  public AppModule_ProvidesDatabaseFactory(AppModule module, Provider<Context> contextProvider) {
    this.module = module;
    this.contextProvider = contextProvider;
  }

  @Override
  public LocalDatabase get() {
    return providesDatabase(module, contextProvider.get());
  }

  public static AppModule_ProvidesDatabaseFactory create(AppModule module,
      Provider<Context> contextProvider) {
    return new AppModule_ProvidesDatabaseFactory(module, contextProvider);
  }

  public static LocalDatabase providesDatabase(AppModule instance, Context context) {
    return Preconditions.checkNotNull(instance.providesDatabase(context), "Cannot return null from a non-@Nullable @Provides method");
  }
}
