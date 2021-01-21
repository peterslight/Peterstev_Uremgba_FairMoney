package com.peterstev.fairmoney.injection;

import com.peterstev.fairmoney.data.network.ApiHelper;
import com.peterstev.fairmoney.data.network.ApiHelperImpl;
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
public final class AppModule_ProvidesApiHelperFactory implements Factory<ApiHelper> {
  private final AppModule module;

  private final Provider<ApiHelperImpl> apiHelperImplProvider;

  public AppModule_ProvidesApiHelperFactory(AppModule module,
      Provider<ApiHelperImpl> apiHelperImplProvider) {
    this.module = module;
    this.apiHelperImplProvider = apiHelperImplProvider;
  }

  @Override
  public ApiHelper get() {
    return providesApiHelper(module, apiHelperImplProvider.get());
  }

  public static AppModule_ProvidesApiHelperFactory create(AppModule module,
      Provider<ApiHelperImpl> apiHelperImplProvider) {
    return new AppModule_ProvidesApiHelperFactory(module, apiHelperImplProvider);
  }

  public static ApiHelper providesApiHelper(AppModule instance, ApiHelperImpl apiHelperImpl) {
    return Preconditions.checkNotNull(instance.providesApiHelper(apiHelperImpl), "Cannot return null from a non-@Nullable @Provides method");
  }
}
