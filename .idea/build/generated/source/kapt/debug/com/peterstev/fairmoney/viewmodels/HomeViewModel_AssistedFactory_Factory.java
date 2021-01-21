package com.peterstev.fairmoney.viewmodels;

import com.peterstev.fairmoney.repository.HomeRepository;
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
public final class HomeViewModel_AssistedFactory_Factory implements Factory<HomeViewModel_AssistedFactory> {
  private final Provider<HomeRepository> repositoryProvider;

  public HomeViewModel_AssistedFactory_Factory(Provider<HomeRepository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public HomeViewModel_AssistedFactory get() {
    return newInstance(repositoryProvider);
  }

  public static HomeViewModel_AssistedFactory_Factory create(
      Provider<HomeRepository> repositoryProvider) {
    return new HomeViewModel_AssistedFactory_Factory(repositoryProvider);
  }

  public static HomeViewModel_AssistedFactory newInstance(Provider<HomeRepository> repository) {
    return new HomeViewModel_AssistedFactory(repository);
  }
}
