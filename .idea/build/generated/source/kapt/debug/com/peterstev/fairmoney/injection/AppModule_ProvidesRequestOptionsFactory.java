package com.peterstev.fairmoney.injection;

import com.bumptech.glide.request.RequestOptions;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AppModule_ProvidesRequestOptionsFactory implements Factory<RequestOptions> {
  private final AppModule module;

  public AppModule_ProvidesRequestOptionsFactory(AppModule module) {
    this.module = module;
  }

  @Override
  public RequestOptions get() {
    return providesRequestOptions(module);
  }

  public static AppModule_ProvidesRequestOptionsFactory create(AppModule module) {
    return new AppModule_ProvidesRequestOptionsFactory(module);
  }

  public static RequestOptions providesRequestOptions(AppModule instance) {
    return Preconditions.checkNotNull(instance.providesRequestOptions(), "Cannot return null from a non-@Nullable @Provides method");
  }
}
