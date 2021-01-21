package dagger.hilt.android.internal.testing;

import com.peterstev.fairmoney.HomeViewModelTest;
import com.peterstev.fairmoney.HomeViewModelTest_ComponentDataHolder;
import java.lang.Class;
import java.lang.Override;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;

@Generated("dagger.hilt.processor.internal.root.RootProcessor")
public final class TestComponentDataSupplierImpl extends TestComponentDataSupplier {
  private final Map<Class<?>, TestComponentData> testComponentDataMap = new HashMap<>(1);

  TestComponentDataSupplierImpl() {
    testComponentDataMap.put(HomeViewModelTest.class, HomeViewModelTest_ComponentDataHolder.get());
  }

  @Override
  protected Map<Class<?>, TestComponentData> get() {
    return testComponentDataMap;
  }
}
