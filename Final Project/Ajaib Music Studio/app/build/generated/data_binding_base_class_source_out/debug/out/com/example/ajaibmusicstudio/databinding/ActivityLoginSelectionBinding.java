// Generated by view binder compiler. Do not edit!
package com.example.ajaibmusicstudio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.ajaibmusicstudio.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityLoginSelectionBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final Button BtnAdmin;

  @NonNull
  public final Button BtnCostumer;

  @NonNull
  public final LinearLayout LayoutLoginPage;

  @NonNull
  public final TextView TextLoginSelection;

  private ActivityLoginSelectionBinding(@NonNull RelativeLayout rootView, @NonNull Button BtnAdmin,
      @NonNull Button BtnCostumer, @NonNull LinearLayout LayoutLoginPage,
      @NonNull TextView TextLoginSelection) {
    this.rootView = rootView;
    this.BtnAdmin = BtnAdmin;
    this.BtnCostumer = BtnCostumer;
    this.LayoutLoginPage = LayoutLoginPage;
    this.TextLoginSelection = TextLoginSelection;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityLoginSelectionBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityLoginSelectionBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_login_selection, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityLoginSelectionBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.BtnAdmin;
      Button BtnAdmin = ViewBindings.findChildViewById(rootView, id);
      if (BtnAdmin == null) {
        break missingId;
      }

      id = R.id.BtnCostumer;
      Button BtnCostumer = ViewBindings.findChildViewById(rootView, id);
      if (BtnCostumer == null) {
        break missingId;
      }

      id = R.id.LayoutLoginPage;
      LinearLayout LayoutLoginPage = ViewBindings.findChildViewById(rootView, id);
      if (LayoutLoginPage == null) {
        break missingId;
      }

      id = R.id.TextLoginSelection;
      TextView TextLoginSelection = ViewBindings.findChildViewById(rootView, id);
      if (TextLoginSelection == null) {
        break missingId;
      }

      return new ActivityLoginSelectionBinding((RelativeLayout) rootView, BtnAdmin, BtnCostumer,
          LayoutLoginPage, TextLoginSelection);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
