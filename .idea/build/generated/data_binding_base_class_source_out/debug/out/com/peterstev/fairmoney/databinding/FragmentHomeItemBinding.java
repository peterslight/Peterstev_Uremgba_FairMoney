// Generated by view binder compiler. Do not edit!
package com.peterstev.fairmoney.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.textview.MaterialTextView;
import com.peterstev.fairmoney.R;
import de.hdodenhof.circleimageview.CircleImageView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentHomeItemBinding implements ViewBinding {
  @NonNull
  private final MaterialCardView rootView;

  @NonNull
  public final CircleImageView homeImgUserAvatar;

  @NonNull
  public final MaterialTextView homeTvUserEmail;

  @NonNull
  public final MaterialTextView homeTvUserName;

  private FragmentHomeItemBinding(@NonNull MaterialCardView rootView,
      @NonNull CircleImageView homeImgUserAvatar, @NonNull MaterialTextView homeTvUserEmail,
      @NonNull MaterialTextView homeTvUserName) {
    this.rootView = rootView;
    this.homeImgUserAvatar = homeImgUserAvatar;
    this.homeTvUserEmail = homeTvUserEmail;
    this.homeTvUserName = homeTvUserName;
  }

  @Override
  @NonNull
  public MaterialCardView getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentHomeItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentHomeItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_home_item, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentHomeItemBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.home_img_user_avatar;
      CircleImageView homeImgUserAvatar = rootView.findViewById(id);
      if (homeImgUserAvatar == null) {
        break missingId;
      }

      id = R.id.home_tv_user_email;
      MaterialTextView homeTvUserEmail = rootView.findViewById(id);
      if (homeTvUserEmail == null) {
        break missingId;
      }

      id = R.id.home_tv_user_name;
      MaterialTextView homeTvUserName = rootView.findViewById(id);
      if (homeTvUserName == null) {
        break missingId;
      }

      return new FragmentHomeItemBinding((MaterialCardView) rootView, homeImgUserAvatar,
          homeTvUserEmail, homeTvUserName);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}