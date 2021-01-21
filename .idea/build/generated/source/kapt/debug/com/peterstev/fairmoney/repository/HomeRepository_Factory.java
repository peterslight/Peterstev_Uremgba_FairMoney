package com.peterstev.fairmoney.repository;

import com.peterstev.fairmoney.data.local.impl.UsersDaoHelperImpl;
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
public final class HomeRepository_Factory implements Factory<HomeRepository> {
  private final Provider<ApiHelper> apiHelperProvider;

  private final Provider<UsersDaoHelperImpl> usersDaoHelperImplProvider;

  public HomeRepository_Factory(Provider<ApiHelper> apiHelperProvider,
      Provider<UsersDaoHelperImpl> usersDaoHelperImplProvider) {
    this.apiHelperProvider = apiHelperProvider;
    this.usersDaoHelperImplProvider = usersDaoHelperImplProvider;
  }

  @Override
  public HomeRepository get() {
    return newInstance(apiHelperProvider.get(), usersDaoHelperImplProvider.get());
  }

  public static HomeRepository_Factory create(Provider<ApiHelper> apiHelperProvider,
      Provider<UsersDaoHelperImpl> usersDaoHelperImplProvider) {
    return new HomeRepository_Factory(apiHelperProvider, usersDaoHelperImplProvider);
  }

  public static HomeRepository newInstance(ApiHelper apiHelper,
      UsersDaoHelperImpl usersDaoHelperImpl) {
    return new HomeRepository(apiHelper, usersDaoHelperImpl);
  }
}
