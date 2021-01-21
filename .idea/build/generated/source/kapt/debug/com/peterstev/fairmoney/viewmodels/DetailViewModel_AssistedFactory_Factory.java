package com.peterstev.fairmoney.viewmodels;

import com.peterstev.fairmoney.repository.DetailRepository;
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
public final class DetailViewModel_AssistedFactory_Factory implements Factory<DetailViewModel_AssistedFactory> {
  private final Provider<DetailRepository> repositoryProvider;

  public DetailViewModel_AssistedFactory_Factory(Provider<DetailRepository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public DetailViewModel_AssistedFactory get() {
    return newInstance(repositoryProvider);
  }

  public static DetailViewModel_AssistedFactory_Factory create(
      Provider<DetailRepository> repositoryProvider) {
    return new DetailViewModel_AssistedFactory_Factory(repositoryProvider);
  }

  public static DetailViewModel_AssistedFactory newInstance(Provider<DetailRepository> repository) {
    return new DetailViewModel_AssistedFactory(repository);
  }
}
