package com.peterstev.fairmoney.injection;

import android.app.Application;
import com.bumptech.glide.RequestManager;
import com.bumptech.glide.request.RequestOptions;
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
public final class AppModule_ProvidesGlideFactory implements Factory<RequestManager> {
  private final AppModule module;

  private final Provider<Application> applicationProvider;

  private final Provider<RequestOptions> requestOptionsProvider;

  public AppModule_ProvidesGlideFactory(AppModule module, Provider<Application> applicationProvider,
      Provider<RequestOptions> requestOptionsProvider) {
    this.module = module;
    this.applicationProvider = applicationProvider;
    this.requestOptionsProvider = requestOptionsProvider;
  }

  @Override
  public RequestManager get() {
    return providesGlide(module, applicationProvider.get(), requestOptionsProvider.get());
  }

  public static AppModule_ProvidesGlideFactory create(AppModule module,
      Provider<Application> applicationProvider, Provider<RequestOptions> requestOptionsProvider) {
    return new AppModule_ProvidesGlideFactory(module, applicationProvider, requestOptionsProvider);
  }

  public static RequestManager providesGlide(AppModule instance, Application application,
      RequestOptions requestOptions) {
    return Preconditions.checkNotNull(instance.providesGlide(application, requestOptions), "Cannot return null from a non-@Nullable @Provides method");
  }
}
