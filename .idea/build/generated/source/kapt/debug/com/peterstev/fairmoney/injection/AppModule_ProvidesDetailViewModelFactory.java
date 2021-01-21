package com.peterstev.fairmoney.injection;

import com.peterstev.fairmoney.repository.DetailRepository;
import com.peterstev.fairmoney.viewmodels.DetailViewModel;
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
public final class AppModule_ProvidesDetailViewModelFactory implements Factory<DetailViewModel> {
  private final AppModule module;

  private final Provider<DetailRepository> repositoryProvider;

  public AppModule_ProvidesDetailViewModelFactory(AppModule module,
      Provider<DetailRepository> repositoryProvider) {
    this.module = module;
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public DetailViewModel get() {
    return providesDetailViewModel(module, repositoryProvider.get());
  }

  public static AppModule_ProvidesDetailViewModelFactory create(AppModule module,
      Provider<DetailRepository> repositoryProvider) {
    return new AppModule_ProvidesDetailViewModelFactory(module, repositoryProvider);
  }

  public static DetailViewModel providesDetailViewModel(AppModule instance,
      DetailRepository repository) {
    return Preconditions.checkNotNull(instance.providesDetailViewModel(repository), "Cannot return null from a non-@Nullable @Provides method");
  }
}
