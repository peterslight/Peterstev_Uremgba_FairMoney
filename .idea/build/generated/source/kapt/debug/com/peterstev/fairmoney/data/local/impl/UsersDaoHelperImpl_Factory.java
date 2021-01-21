package com.peterstev.fairmoney.data.local.impl;

import com.peterstev.fairmoney.data.local.dao.UsersDAO;
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
public final class UsersDaoHelperImpl_Factory implements Factory<UsersDaoHelperImpl> {
  private final Provider<UsersDAO> usersDaoProvider;

  public UsersDaoHelperImpl_Factory(Provider<UsersDAO> usersDaoProvider) {
    this.usersDaoProvider = usersDaoProvider;
  }

  @Override
  public UsersDaoHelperImpl get() {
    return newInstance(usersDaoProvider.get());
  }

  public static UsersDaoHelperImpl_Factory create(Provider<UsersDAO> usersDaoProvider) {
    return new UsersDaoHelperImpl_Factory(usersDaoProvider);
  }

  public static UsersDaoHelperImpl newInstance(UsersDAO usersDao) {
    return new UsersDaoHelperImpl(usersDao);
  }
}
