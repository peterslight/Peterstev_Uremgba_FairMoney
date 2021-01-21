package com.peterstev.fairmoney.injection;

import android.content.Context;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AppModule_ProvidesRetrofitFactory implements Factory<Retrofit> {
  private final AppModule module;

  private final Provider<OkHttpClient> clientProvider;

  private final Provider<Context> contextProvider;

  public AppModule_ProvidesRetrofitFactory(AppModule module, Provider<OkHttpClient> clientProvider,
      Provider<Context> contextProvider) {
    this.module = module;
    this.clientProvider = clientProvider;
    this.contextProvider = contextProvider;
  }

  @Override
  public Retrofit get() {
    return providesRetrofit(module, clientProvider.get(), contextProvider.get());
  }

  public static AppModule_ProvidesRetrofitFactory create(AppModule module,
      Provider<OkHttpClient> clientProvider, Provider<Context> contextProvider) {
    return new AppModule_ProvidesRetrofitFactory(module, clientProvider, contextProvider);
  }

  public static Retrofit providesRetrofit(AppModule instance, OkHttpClient client,
      Context context) {
    return Preconditions.checkNotNull(instance.providesRetrofit(client, context), "Cannot return null from a non-@Nullable @Provides method");
  }
}
