package com.peterstev.fairmoney;

import com.peterstev.fairmoney.viewmodels.HomeViewModel;
import dagger.MembersInjector;
import dagger.internal.InjectedFieldSignature;
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
public final class HomeViewModelTest_MembersInjector implements MembersInjector<HomeViewModelTest> {
  private final Provider<HomeViewModel> viewModelProvider;

  public HomeViewModelTest_MembersInjector(Provider<HomeViewModel> viewModelProvider) {
    this.viewModelProvider = viewModelProvider;
  }

  public static MembersInjector<HomeViewModelTest> create(
      Provider<HomeViewModel> viewModelProvider) {
    return new HomeViewModelTest_MembersInjector(viewModelProvider);
  }

  @Override
  public void injectMembers(HomeViewModelTest instance) {
    injectViewModel(instance, viewModelProvider.get());
  }

  @InjectedFieldSignature("com.peterstev.fairmoney.HomeViewModelTest.viewModel")
  public static void injectViewModel(HomeViewModelTest instance, HomeViewModel viewModel) {
    instance.viewModel = viewModel;
  }
}
