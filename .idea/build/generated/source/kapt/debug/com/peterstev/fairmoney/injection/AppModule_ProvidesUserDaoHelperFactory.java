package com.peterstev.fairmoney.injection;

import com.peterstev.fairmoney.data.local.impl.UsersDaoHelper;
import com.peterstev.fairmoney.data.local.impl.UsersDaoHelperImpl;
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
public final class AppModule_ProvidesUserDaoHelperFactory implements Factory<UsersDaoHelper> {
  private final AppModule module;

  private final Provider<UsersDaoHelperImpl> usersDaoHelperImplProvider;

  public AppModule_ProvidesUserDaoHelperFactory(AppModule module,
      Provider<UsersDaoHelperImpl> usersDaoHelperImplProvider) {
    this.module = module;
    this.usersDaoHelperImplProvider = usersDaoHelperImplProvider;
  }

  @Override
  public UsersDaoHelper get() {
    return providesUserDaoHelper(module, usersDaoHelperImplProvider.get());
  }

  public static AppModule_ProvidesUserDaoHelperFactory create(AppModule module,
      Provider<UsersDaoHelperImpl> usersDaoHelperImplProvider) {
    return new AppModule_ProvidesUserDaoHelperFactory(module, usersDaoHelperImplProvider);
  }

  public static UsersDaoHelper providesUserDaoHelper(AppModule instance,
      UsersDaoHelperImpl usersDaoHelperImpl) {
    return Preconditions.checkNotNull(instance.providesUserDaoHelper(usersDaoHelperImpl), "Cannot return null from a non-@Nullable @Provides method");
  }
}
