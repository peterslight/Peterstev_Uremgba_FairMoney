package com.peterstev.fairmoney.injection;

import android.app.Application;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;
import okhttp3.OkHttpClient;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AppModule_ProvidesOkHTTPClientFactory implements Factory<OkHttpClient> {
  private final AppModule module;

  private final Provider<Application> applicationProvider;

  public AppModule_ProvidesOkHTTPClientFactory(AppModule module,
      Provider<Application> applicationProvider) {
    this.module = module;
    this.applicationProvider = applicationProvider;
  }

  @Override
  public OkHttpClient get() {
    return providesOkHTTPClient(module, applicationProvider.get());
  }

  public static AppModule_ProvidesOkHTTPClientFactory create(AppModule module,
      Provider<Application> applicationProvider) {
    return new AppModule_ProvidesOkHTTPClientFactory(module, applicationProvider);
  }

  public static OkHttpClient providesOkHTTPClient(AppModule instance, Application application) {
    return Preconditions.checkNotNull(instance.providesOkHTTPClient(application), "Cannot return null from a non-@Nullable @Provides method");
  }
}
