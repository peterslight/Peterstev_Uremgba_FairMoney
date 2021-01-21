package com.peterstev.fairmoney.viewmodels;

import androidx.annotation.NonNull;
import androidx.hilt.lifecycle.ViewModelAssistedFactory;
import androidx.lifecycle.SavedStateHandle;
import com.peterstev.fairmoney.repository.DetailRepository;
import java.lang.Override;
import javax.annotation.Generated;
import javax.inject.Inject;
import javax.inject.Provider;

@Generated("androidx.hilt.AndroidXHiltProcessor")
public final class DetailViewModel_AssistedFactory implements ViewModelAssistedFactory<DetailViewModel> {
  private final Provider<DetailRepository> repository;

  @Inject
  DetailViewModel_AssistedFactory(Provider<DetailRepository> repository) {
    this.repository = repository;
  }

  @Override
  @NonNull
  public DetailViewModel create(SavedStateHandle arg0) {
    return new DetailViewModel(repository.get());
  }
}
