package com.peterstev.fairmoney.injection;

import com.peterstev.fairmoney.repository.HomeRepository;
import com.peterstev.fairmoney.viewmodels.HomeViewModel;
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
public final class AppModule_ProvidesHomeViewModelFactory implements Factory<HomeViewModel> {
  private final AppModule module;

  private final Provider<HomeRepository> repositoryProvider;

  public AppModule_ProvidesHomeViewModelFactory(AppModule module,
      Provider<HomeRepository> repositoryProvider) {
    this.module = module;
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public HomeViewModel get() {
    return providesHomeViewModel(module, repositoryProvider.get());
  }

  public static AppModule_ProvidesHomeViewModelFactory create(AppModule module,
      Provider<HomeRepository> repositoryProvider) {
    return new AppModule_ProvidesHomeViewModelFactory(module, repositoryProvider);
  }

  public static HomeViewModel providesHomeViewModel(AppModule instance, HomeRepository repository) {
    return Preconditions.checkNotNull(instance.providesHomeViewModel(repository), "Cannot return null from a non-@Nullable @Provides method");
  }
}
