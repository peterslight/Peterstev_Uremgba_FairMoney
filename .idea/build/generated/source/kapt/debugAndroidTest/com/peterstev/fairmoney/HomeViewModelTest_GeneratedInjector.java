package com.peterstev.fairmoney;

import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ApplicationComponent;
import dagger.hilt.android.internal.testing.TestInjector;
import dagger.hilt.codegen.OriginatingElement;
import dagger.hilt.internal.GeneratedEntryPoint;
import javax.annotation.Generated;

@OriginatingElement(
    topLevelClass = HomeViewModelTest.class
)
@GeneratedEntryPoint
@InstallIn(ApplicationComponent.class)
@Generated("dagger.hilt.processor.internal.root.TestInjectorGenerator")
public interface HomeViewModelTest_GeneratedInjector extends TestInjector<HomeViewModelTest> {
  void injectTest(HomeViewModelTest homeViewModelTest);
}
