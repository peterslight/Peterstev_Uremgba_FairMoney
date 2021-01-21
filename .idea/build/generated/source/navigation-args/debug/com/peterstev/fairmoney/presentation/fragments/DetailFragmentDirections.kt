package com.peterstev.fairmoney.presentation.fragments

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.peterstev.fairmoney.R

public class DetailFragmentDirections private constructor() {
  public companion object {
    public fun actionHomefragmentToDetailfragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_homefragment_to_detailfragment)
  }
}
