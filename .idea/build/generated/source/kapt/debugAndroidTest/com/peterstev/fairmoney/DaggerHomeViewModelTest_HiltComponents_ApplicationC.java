package com.peterstev.fairmoney;

import android.app.Activity;
import android.app.Service;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.hilt.lifecycle.ViewModelAssistedFactory;
import androidx.hilt.lifecycle.ViewModelFactoryModules_ActivityModule_ProvideFactoryFactory;
import androidx.hilt.lifecycle.ViewModelFactoryModules_FragmentModule_ProvideFactoryFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import com.bumptech.glide.RequestManager;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.peterstev.fairmoney.base.BaseApplication;
import com.peterstev.fairmoney.data.local.dao.UsersDAO;
import com.peterstev.fairmoney.data.local.database.LocalDatabase;
import com.peterstev.fairmoney.data.local.impl.UsersDaoHelperImpl;
import com.peterstev.fairmoney.data.network.ApiHelper;
import com.peterstev.fairmoney.data.network.ApiHelperImpl;
import com.peterstev.fairmoney.data.network.ApiService;
import com.peterstev.fairmoney.injection.AppModule;
import com.peterstev.fairmoney.injection.AppModule_ProvidesApiHelperFactory;
import com.peterstev.fairmoney.injection.AppModule_ProvidesApiServiceFactory;
import com.peterstev.fairmoney.injection.AppModule_ProvidesDatabaseFactory;
import com.peterstev.fairmoney.injection.AppModule_ProvidesGlideFactory;
import com.peterstev.fairmoney.injection.AppModule_ProvidesHomeViewModelFactory;
import com.peterstev.fairmoney.injection.AppModule_ProvidesOkHTTPClientFactory;
import com.peterstev.fairmoney.injection.AppModule_ProvidesRequestOptionsFactory;
import com.peterstev.fairmoney.injection.AppModule_ProvidesRetrofitFactory;
import com.peterstev.fairmoney.injection.AppModule_ProvidesUserDAOFactory;
import com.peterstev.fairmoney.presentation.activities.MainActivity;
import com.peterstev.fairmoney.presentation.fragments.DetailFragment;
import com.peterstev.fairmoney.presentation.fragments.DetailFragment_MembersInjector;
import com.peterstev.fairmoney.presentation.fragments.HomeFragment;
import com.peterstev.fairmoney.presentation.fragments.HomeFragment_MembersInjector;
import com.peterstev.fairmoney.repository.DetailRepository;
import com.peterstev.fairmoney.repository.HomeRepository;
import com.peterstev.fairmoney.viewmodels.DetailViewModel_AssistedFactory;
import com.peterstev.fairmoney.viewmodels.DetailViewModel_AssistedFactory_Factory;
import com.peterstev.fairmoney.viewmodels.HomeViewModel;
import com.peterstev.fairmoney.viewmodels.HomeViewModel_AssistedFactory;
import com.peterstev.fairmoney.viewmodels.HomeViewModel_AssistedFactory_Factory;
import dagger.hilt.android.internal.builders.ActivityComponentBuilder;
import dagger.hilt.android.internal.builders.ActivityRetainedComponentBuilder;
import dagger.hilt.android.internal.builders.FragmentComponentBuilder;
import dagger.hilt.android.internal.builders.ServiceComponentBuilder;
import dagger.hilt.android.internal.builders.ViewComponentBuilder;
import dagger.hilt.android.internal.builders.ViewWithFragmentComponentBuilder;
import dagger.hilt.android.internal.modules.ApplicationContextModule;
import dagger.hilt.android.internal.modules.ApplicationContextModule_ProvideApplicationFactory;
import dagger.hilt.android.internal.modules.ApplicationContextModule_ProvideContextFactory;
import dagger.internal.DoubleCheck;
import dagger.internal.MemoizedSentinel;
import dagger.internal.Preconditions;
import java.util.Map;
import java.util.Set;
import javax.annotation.Generated;
import javax.inject.Provider;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DaggerHomeViewModelTest_HiltComponents_ApplicationC extends HomeViewModelTest_HiltComponents.ApplicationC {
  private final ApplicationContextModule applicationContextModule;

  private final AppModule appModule;

  private volatile Object okHttpClient = new MemoizedSentinel();

  private volatile Object retrofit = new MemoizedSentinel();

  private volatile Object apiService = new MemoizedSentinel();

  private volatile Object apiHelper = new MemoizedSentinel();

  private volatile Object localDatabase = new MemoizedSentinel();

  private volatile Object usersDAO = new MemoizedSentinel();

  private volatile Provider<HomeRepository> homeRepositoryProvider;

  private DaggerHomeViewModelTest_HiltComponents_ApplicationC(AppModule appModuleParam,
      ApplicationContextModule applicationContextModuleParam) {
    this.applicationContextModule = applicationContextModuleParam;
    this.appModule = appModuleParam;
  }

  public static Builder builder() {
    return new Builder();
  }

  private OkHttpClient getOkHttpClient() {
    Object local = okHttpClient;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = okHttpClient;
        if (local instanceof MemoizedSentinel) {
          local = AppModule_ProvidesOkHTTPClientFactory.providesOkHTTPClient(appModule, ApplicationContextModule_ProvideApplicationFactory.provideApplication(applicationContextModule));
          okHttpClient = DoubleCheck.reentrantCheck(okHttpClient, local);
        }
      }
    }
    return (OkHttpClient) local;
  }

  private Retrofit getRetrofit() {
    Object local = retrofit;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = retrofit;
        if (local instanceof MemoizedSentinel) {
          local = AppModule_ProvidesRetrofitFactory.providesRetrofit(appModule, getOkHttpClient(), ApplicationContextModule_ProvideContextFactory.provideContext(applicationContextModule));
          retrofit = DoubleCheck.reentrantCheck(retrofit, local);
        }
      }
    }
    return (Retrofit) local;
  }

  private ApiService getApiService() {
    Object local = apiService;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = apiService;
        if (local instanceof MemoizedSentinel) {
          local = AppModule_ProvidesApiServiceFactory.providesApiService(appModule, getRetrofit());
          apiService = DoubleCheck.reentrantCheck(apiService, local);
        }
      }
    }
    return (ApiService) local;
  }

  private ApiHelperImpl getApiHelperImpl() {
    return new ApiHelperImpl(getApiService());
  }

  private ApiHelper getApiHelper() {
    Object local = apiHelper;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = apiHelper;
        if (local instanceof MemoizedSentinel) {
          local = AppModule_ProvidesApiHelperFactory.providesApiHelper(appModule, getApiHelperImpl());
          apiHelper = DoubleCheck.reentrantCheck(apiHelper, local);
        }
      }
    }
    return (ApiHelper) local;
  }

  private LocalDatabase getLocalDatabase() {
    Object local = localDatabase;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = localDatabase;
        if (local instanceof MemoizedSentinel) {
          local = AppModule_ProvidesDatabaseFactory.providesDatabase(appModule, ApplicationContextModule_ProvideContextFactory.provideContext(applicationContextModule));
          localDatabase = DoubleCheck.reentrantCheck(localDatabase, local);
        }
      }
    }
    return (LocalDatabase) local;
  }

  private UsersDAO getUsersDAO() {
    Object local = usersDAO;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = usersDAO;
        if (local instanceof MemoizedSentinel) {
          local = AppModule_ProvidesUserDAOFactory.providesUserDAO(appModule, getLocalDatabase());
          usersDAO = DoubleCheck.reentrantCheck(usersDAO, local);
        }
      }
    }
    return (UsersDAO) local;
  }

  private UsersDaoHelperImpl getUsersDaoHelperImpl() {
    return new UsersDaoHelperImpl(getUsersDAO());
  }

  private HomeRepository getHomeRepository() {
    return new HomeRepository(getApiHelper(), getUsersDaoHelperImpl());
  }

  private HomeViewModel getHomeViewModel() {
    return AppModule_ProvidesHomeViewModelFactory.providesHomeViewModel(appModule, getHomeRepository());
  }

  private Provider<HomeRepository> getHomeRepositoryProvider() {
    Object local = homeRepositoryProvider;
    if (local == null) {
      local = new SwitchingProvider<>(0);
      homeRepositoryProvider = (Provider<HomeRepository>) local;
    }
    return (Provider<HomeRepository>) local;
  }

  private RequestManager getRequestManager() {
    return AppModule_ProvidesGlideFactory.providesGlide(appModule, ApplicationContextModule_ProvideApplicationFactory.provideApplication(applicationContextModule), AppModule_ProvidesRequestOptionsFactory.providesRequestOptions(appModule));
  }

  @Override
  public void injectTest(HomeViewModelTest homeViewModelTest) {
    injectHomeViewModelTest(homeViewModelTest);
  }

  @Override
  public void injectBaseApplication(BaseApplication arg0) {
  }

  @Override
  public ActivityRetainedComponentBuilder retainedComponentBuilder() {
    return new ActivityRetainedCBuilder();
  }

  @Override
  public ServiceComponentBuilder serviceComponentBuilder() {
    return new ServiceCBuilder();
  }

  @CanIgnoreReturnValue
  private HomeViewModelTest injectHomeViewModelTest(HomeViewModelTest instance) {
    HomeViewModelTest_MembersInjector.injectViewModel(instance, getHomeViewModel());
    return instance;
  }

  public static final class Builder {
    private AppModule appModule;

    private ApplicationContextModule applicationContextModule;

    private Builder() {
    }

    public Builder appModule(AppModule appModule) {
      this.appModule = Preconditions.checkNotNull(appModule);
      return this;
    }

    public Builder applicationContextModule(ApplicationContextModule applicationContextModule) {
      this.applicationContextModule = Preconditions.checkNotNull(applicationContextModule);
      return this;
    }

    public HomeViewModelTest_HiltComponents.ApplicationC build() {
      if (appModule == null) {
        this.appModule = new AppModule();
      }
      Preconditions.checkBuilderRequirement(applicationContextModule, ApplicationContextModule.class);
      return new DaggerHomeViewModelTest_HiltComponents_ApplicationC(appModule, applicationContextModule);
    }
  }

  private final class ActivityRetainedCBuilder implements HomeViewModelTest_HiltComponents.ActivityRetainedC.Builder {
    @Override
    public HomeViewModelTest_HiltComponents.ActivityRetainedC build() {
      return new ActivityRetainedCImpl();
    }
  }

  private final class ActivityRetainedCImpl extends HomeViewModelTest_HiltComponents.ActivityRetainedC {
    private ActivityRetainedCImpl() {

    }

    @Override
    public ActivityComponentBuilder activityComponentBuilder() {
      return new ActivityCBuilder();
    }

    private final class ActivityCBuilder implements HomeViewModelTest_HiltComponents.ActivityC.Builder {
      private Activity activity;

      @Override
      public ActivityCBuilder activity(Activity activity) {
        this.activity = Preconditions.checkNotNull(activity);
        return this;
      }

      @Override
      public HomeViewModelTest_HiltComponents.ActivityC build() {
        Preconditions.checkBuilderRequirement(activity, Activity.class);
        return new ActivityCImpl(activity);
      }
    }

    private final class ActivityCImpl extends HomeViewModelTest_HiltComponents.ActivityC {
      private final Activity activity;

      private volatile Provider<DetailRepository> detailRepositoryProvider;

      private volatile Provider<DetailViewModel_AssistedFactory> detailViewModel_AssistedFactoryProvider;

      private volatile Provider<HomeViewModel_AssistedFactory> homeViewModel_AssistedFactoryProvider;

      private ActivityCImpl(Activity activityParam) {
        this.activity = activityParam;
      }

      private DetailRepository getDetailRepository() {
        return new DetailRepository(DaggerHomeViewModelTest_HiltComponents_ApplicationC.this.getApiHelper());
      }

      private Provider<DetailRepository> getDetailRepositoryProvider() {
        Object local = detailRepositoryProvider;
        if (local == null) {
          local = new SwitchingProvider<>(1);
          detailRepositoryProvider = (Provider<DetailRepository>) local;
        }
        return (Provider<DetailRepository>) local;
      }

      private DetailViewModel_AssistedFactory getDetailViewModel_AssistedFactory() {
        return DetailViewModel_AssistedFactory_Factory.newInstance(getDetailRepositoryProvider());
      }

      private Provider<DetailViewModel_AssistedFactory> getDetailViewModel_AssistedFactoryProvider(
          ) {
        Object local = detailViewModel_AssistedFactoryProvider;
        if (local == null) {
          local = new SwitchingProvider<>(0);
          detailViewModel_AssistedFactoryProvider = (Provider<DetailViewModel_AssistedFactory>) local;
        }
        return (Provider<DetailViewModel_AssistedFactory>) local;
      }

      private HomeViewModel_AssistedFactory getHomeViewModel_AssistedFactory() {
        return HomeViewModel_AssistedFactory_Factory.newInstance(DaggerHomeViewModelTest_HiltComponents_ApplicationC.this.getHomeRepositoryProvider());
      }

      private Provider<HomeViewModel_AssistedFactory> getHomeViewModel_AssistedFactoryProvider() {
        Object local = homeViewModel_AssistedFactoryProvider;
        if (local == null) {
          local = new SwitchingProvider<>(2);
          homeViewModel_AssistedFactoryProvider = (Provider<HomeViewModel_AssistedFactory>) local;
        }
        return (Provider<HomeViewModel_AssistedFactory>) local;
      }

      private Map<String, Provider<ViewModelAssistedFactory<? extends ViewModel>>> getMapOfStringAndProviderOfViewModelAssistedFactoryOf(
          ) {
        return ImmutableMap.<String, Provider<ViewModelAssistedFactory<? extends ViewModel>>>of("com.peterstev.fairmoney.viewmodels.DetailViewModel", (Provider) getDetailViewModel_AssistedFactoryProvider(), "com.peterstev.fairmoney.viewmodels.HomeViewModel", (Provider) getHomeViewModel_AssistedFactoryProvider());
      }

      private ViewModelProvider.Factory getProvideFactory() {
        return ViewModelFactoryModules_ActivityModule_ProvideFactoryFactory.provideFactory(activity, ApplicationContextModule_ProvideApplicationFactory.provideApplication(DaggerHomeViewModelTest_HiltComponents_ApplicationC.this.applicationContextModule), getMapOfStringAndProviderOfViewModelAssistedFactoryOf());
      }

      @Override
      public void injectMainActivity(MainActivity arg0) {
      }

      @Override
      public Set<ViewModelProvider.Factory> getActivityViewModelFactory() {
        return ImmutableSet.<ViewModelProvider.Factory>of(getProvideFactory());
      }

      @Override
      public FragmentComponentBuilder fragmentComponentBuilder() {
        return new FragmentCBuilder();
      }

      @Override
      public ViewComponentBuilder viewComponentBuilder() {
        return new ViewCBuilder();
      }

      private final class FragmentCBuilder implements HomeViewModelTest_HiltComponents.FragmentC.Builder {
        private Fragment fragment;

        @Override
        public FragmentCBuilder fragment(Fragment fragment) {
          this.fragment = Preconditions.checkNotNull(fragment);
          return this;
        }

        @Override
        public HomeViewModelTest_HiltComponents.FragmentC build() {
          Preconditions.checkBuilderRequirement(fragment, Fragment.class);
          return new FragmentCImpl(fragment);
        }
      }

      private final class FragmentCImpl extends HomeViewModelTest_HiltComponents.FragmentC {
        private final Fragment fragment;

        private FragmentCImpl(Fragment fragmentParam) {
          this.fragment = fragmentParam;
        }

        private ViewModelProvider.Factory getProvideFactory() {
          return ViewModelFactoryModules_FragmentModule_ProvideFactoryFactory.provideFactory(fragment, ApplicationContextModule_ProvideApplicationFactory.provideApplication(DaggerHomeViewModelTest_HiltComponents_ApplicationC.this.applicationContextModule), ActivityCImpl.this.getMapOfStringAndProviderOfViewModelAssistedFactoryOf());
        }

        @Override
        public void injectDetailFragment(DetailFragment arg0) {
          injectDetailFragment2(arg0);
        }

        @Override
        public void injectHomeFragment(HomeFragment arg0) {
          injectHomeFragment2(arg0);
        }

        @Override
        public Set<ViewModelProvider.Factory> getFragmentViewModelFactory() {
          return ImmutableSet.<ViewModelProvider.Factory>of(getProvideFactory());
        }

        @Override
        public ViewWithFragmentComponentBuilder viewWithFragmentComponentBuilder() {
          return new ViewWithFragmentCBuilder();
        }

        @CanIgnoreReturnValue
        private DetailFragment injectDetailFragment2(DetailFragment instance) {
          DetailFragment_MembersInjector.injectGlide(instance, DaggerHomeViewModelTest_HiltComponents_ApplicationC.this.getRequestManager());
          return instance;
        }

        @CanIgnoreReturnValue
        private HomeFragment injectHomeFragment2(HomeFragment instance) {
          HomeFragment_MembersInjector.injectGlide(instance, DaggerHomeViewModelTest_HiltComponents_ApplicationC.this.getRequestManager());
          return instance;
        }

        private final class ViewWithFragmentCBuilder implements HomeViewModelTest_HiltComponents.ViewWithFragmentC.Builder {
          private View view;

          @Override
          public ViewWithFragmentCBuilder view(View view) {
            this.view = Preconditions.checkNotNull(view);
            return this;
          }

          @Override
          public HomeViewModelTest_HiltComponents.ViewWithFragmentC build() {
            Preconditions.checkBuilderRequirement(view, View.class);
            return new ViewWithFragmentCImpl(view);
          }
        }

        private final class ViewWithFragmentCImpl extends HomeViewModelTest_HiltComponents.ViewWithFragmentC {
          private ViewWithFragmentCImpl(View view) {

          }
        }
      }

      private final class ViewCBuilder implements HomeViewModelTest_HiltComponents.ViewC.Builder {
        private View view;

        @Override
        public ViewCBuilder view(View view) {
          this.view = Preconditions.checkNotNull(view);
          return this;
        }

        @Override
        public HomeViewModelTest_HiltComponents.ViewC build() {
          Preconditions.checkBuilderRequirement(view, View.class);
          return new ViewCImpl(view);
        }
      }

      private final class ViewCImpl extends HomeViewModelTest_HiltComponents.ViewC {
        private ViewCImpl(View view) {

        }
      }

      private final class SwitchingProvider<T> implements Provider<T> {
        private final int id;

        SwitchingProvider(int id) {
          this.id = id;
        }

        @SuppressWarnings("unchecked")
        @Override
        public T get() {
          switch (id) {
            case 0: // com.peterstev.fairmoney.viewmodels.DetailViewModel_AssistedFactory 
            return (T) ActivityCImpl.this.getDetailViewModel_AssistedFactory();

            case 1: // com.peterstev.fairmoney.repository.DetailRepository 
            return (T) ActivityCImpl.this.getDetailRepository();

            case 2: // com.peterstev.fairmoney.viewmodels.HomeViewModel_AssistedFactory 
            return (T) ActivityCImpl.this.getHomeViewModel_AssistedFactory();

            default: throw new AssertionError(id);
          }
        }
      }
    }
  }

  private final class ServiceCBuilder implements HomeViewModelTest_HiltComponents.ServiceC.Builder {
    private Service service;

    @Override
    public ServiceCBuilder service(Service service) {
      this.service = Preconditions.checkNotNull(service);
      return this;
    }

    @Override
    public HomeViewModelTest_HiltComponents.ServiceC build() {
      Preconditions.checkBuilderRequirement(service, Service.class);
      return new ServiceCImpl(service);
    }
  }

  private final class ServiceCImpl extends HomeViewModelTest_HiltComponents.ServiceC {
    private ServiceCImpl(Service service) {

    }
  }

  private final class SwitchingProvider<T> implements Provider<T> {
    private final int id;

    SwitchingProvider(int id) {
      this.id = id;
    }

    @SuppressWarnings("unchecked")
    @Override
    public T get() {
      switch (id) {
        case 0: // com.peterstev.fairmoney.repository.HomeRepository 
        return (T) DaggerHomeViewModelTest_HiltComponents_ApplicationC.this.getHomeRepository();

        default: throw new AssertionError(id);
      }
    }
  }
}
