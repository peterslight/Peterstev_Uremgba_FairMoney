package com.peterstev.fairmoney;

import androidx.test.core.app.ApplicationProvider;
import dagger.hilt.android.internal.modules.ApplicationContextModule;
import dagger.hilt.android.internal.testing.TestComponentData;
import dagger.hilt.android.internal.testing.TestInjector;
import dagger.hilt.internal.GeneratedComponentManager;
import java.lang.SuppressWarnings;
import java.util.Collections;
import javax.annotation.Generated;

@Generated("dagger.hilt.processor.internal.root.RootProcessor")
public final class HomeViewModelTest_ComponentDataHolder {
  private HomeViewModelTest_ComponentDataHolder() {
  }

  public static TestComponentData get() {
    return new TestComponentData(false, testInstance -> injectInternal((HomeViewModelTest) testInstance), Collections.emptySet(), Collections.emptySet(), (modules, testInstance, autoAddModuleEnabled) -> DaggerHomeViewModelTest_HiltComponents_ApplicationC.builder()
        .applicationContextModule(new ApplicationContextModule(ApplicationProvider.getApplicationContext()))
        .build());
  }

  @SuppressWarnings("unchecked")
  private static void injectInternal(HomeViewModelTest testInstance) {
    ((TestInjector<HomeViewModelTest>) ((GeneratedComponentManager) ApplicationProvider.getApplicationContext()).generatedComponent()).injectTest(testInstance);
  }
}
