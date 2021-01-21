package com.peterstev.fairmoney.viewmodels;

import androidx.hilt.lifecycle.ViewModelAssistedFactory;
import androidx.lifecycle.ViewModel;
import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ActivityRetainedComponent;
import dagger.hilt.codegen.OriginatingElement;
import dagger.multibindings.IntoMap;
import dagger.multibindings.StringKey;
import javax.annotation.Generated;

@Generated("androidx.hilt.AndroidXHiltProcessor")
@Module
@InstallIn(ActivityRetainedComponent.class)
@OriginatingElement(
    topLevelClass = DetailViewModel.class
)
public interface DetailViewModel_HiltModule {
  @Binds
  @IntoMap
  @StringKey("com.peterstev.fairmoney.viewmodels.DetailViewModel")
  ViewModelAssistedFactory<? extends ViewModel> bind(DetailViewModel_AssistedFactory factory);
}
