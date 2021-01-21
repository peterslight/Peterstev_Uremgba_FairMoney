package com.peterstev.fairmoney.injection;

import com.peterstev.fairmoney.data.network.ApiService;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;
import retrofit2.Retrofit;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AppModule_ProvidesApiServiceFactory implements Factory<ApiService> {
  private final AppModule module;

  private final Provider<Retrofit> retrofitProvider;

  public AppModule_ProvidesApiServiceFactory(AppModule module,
      Provider<Retrofit> retrofitProvider) {
    this.module = module;
    this.retrofitProvider = retrofitProvider;
  }

  @Override
  public ApiService get() {
    return providesApiService(module, retrofitProvider.get());
  }

  public static AppModule_ProvidesApiServiceFactory create(AppModule module,
      Provider<Retrofit> retrofitProvider) {
    return new AppModule_ProvidesApiServiceFactory(module, retrofitProvider);
  }

  public static ApiService providesApiService(AppModule instance, Retrofit retrofit) {
    return Preconditions.checkNotNull(instance.providesApiService(retrofit), "Cannot return null from a non-@Nullable @Provides method");
  }
}
