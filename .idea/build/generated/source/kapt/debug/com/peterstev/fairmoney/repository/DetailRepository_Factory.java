package com.peterstev.fairmoney.repository;

import com.peterstev.fairmoney.data.network.ApiHelper;
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
public final class DetailRepository_Factory implements Factory<DetailRepository> {
  private final Provider<ApiHelper> apiHelperProvider;

  public DetailRepository_Factory(Provider<ApiHelper> apiHelperProvider) {
    this.apiHelperProvider = apiHelperProvider;
  }

  @Override
  public DetailRepository get() {
    return newInstance(apiHelperProvider.get());
  }

  public static DetailRepository_Factory create(Provider<ApiHelper> apiHelperProvider) {
    return new DetailRepository_Factory(apiHelperProvider);
  }

  public static DetailRepository newInstance(ApiHelper apiHelper) {
    return new DetailRepository(apiHelper);
  }
}
