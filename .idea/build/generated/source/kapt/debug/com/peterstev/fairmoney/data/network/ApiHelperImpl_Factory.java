package com.peterstev.fairmoney.data.network;

import dagger.internal.Factory;
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
public final class ApiHelperImpl_Factory implements Factory<ApiHelperImpl> {
  private final Provider<ApiService> apiServiceProvider;

  public ApiHelperImpl_Factory(Provider<ApiService> apiServiceProvider) {
    this.apiServiceProvider = apiServiceProvider;
  }

  @Override
  public ApiHelperImpl get() {
    return newInstance(apiServiceProvider.get());
  }

  public static ApiHelperImpl_Factory create(Provider<ApiService> apiServiceProvider) {
    return new ApiHelperImpl_Factory(apiServiceProvider);
  }

  public static ApiHelperImpl newInstance(ApiService apiService) {
    return new ApiHelperImpl(apiService);
  }
}
