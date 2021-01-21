package com.peterstev.fairmoney.presentation.fragments;

import com.bumptech.glide.RequestManager;
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
public final class HomeFragment_MembersInjector implements MembersInjector<HomeFragment> {
  private final Provider<RequestManager> glideProvider;

  public HomeFragment_MembersInjector(Provider<RequestManager> glideProvider) {
    this.glideProvider = glideProvider;
  }

  public static MembersInjector<HomeFragment> create(Provider<RequestManager> glideProvider) {
    return new HomeFragment_MembersInjector(glideProvider);
  }

  @Override
  public void injectMembers(HomeFragment instance) {
    injectGlide(instance, glideProvider.get());
  }

  @InjectedFieldSignature("com.peterstev.fairmoney.presentation.fragments.HomeFragment.glide")
  public static void injectGlide(HomeFragment instance, RequestManager glide) {
    instance.glide = glide;
  }
}
