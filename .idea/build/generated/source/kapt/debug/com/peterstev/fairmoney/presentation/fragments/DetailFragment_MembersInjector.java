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
public final class DetailFragment_MembersInjector implements MembersInjector<DetailFragment> {
  private final Provider<RequestManager> glideProvider;

  public DetailFragment_MembersInjector(Provider<RequestManager> glideProvider) {
    this.glideProvider = glideProvider;
  }

  public static MembersInjector<DetailFragment> create(Provider<RequestManager> glideProvider) {
    return new DetailFragment_MembersInjector(glideProvider);
  }

  @Override
  public void injectMembers(DetailFragment instance) {
    injectGlide(instance, glideProvider.get());
  }

  @InjectedFieldSignature("com.peterstev.fairmoney.presentation.fragments.DetailFragment.glide")
  public static void injectGlide(DetailFragment instance, RequestManager glide) {
    instance.glide = glide;
  }
}
