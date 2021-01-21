package com.peterstev.fairmoney.viewmodels;

import androidx.annotation.NonNull;
import androidx.hilt.lifecycle.ViewModelAssistedFactory;
import androidx.lifecycle.SavedStateHandle;
import com.peterstev.fairmoney.repository.HomeRepository;
import java.lang.Override;
import javax.annotation.Generated;
import javax.inject.Inject;
import javax.inject.Provider;

@Generated("androidx.hilt.AndroidXHiltProcessor")
public final class HomeViewModel_AssistedFactory implements ViewModelAssistedFactory<HomeViewModel> {
  private final Provider<HomeRepository> repository;

  @Inject
  HomeViewModel_AssistedFactory(Provider<HomeRepository> repository) {
    this.repository = repository;
  }

  @Override
  @NonNull
  public HomeViewModel create(SavedStateHandle arg0) {
    return new HomeViewModel(repository.get());
  }
}
