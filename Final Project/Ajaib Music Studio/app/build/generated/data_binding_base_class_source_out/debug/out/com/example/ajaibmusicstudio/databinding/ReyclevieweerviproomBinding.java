// Generated by view binder compiler. Do not edit!
package com.example.ajaibmusicstudio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.ajaibmusicstudio.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ReyclevieweerviproomBinding implements ViewBinding {
  @NonNull
  private final CardView rootView;

  @NonNull
  public final TextView RoomDescVIP;

  @NonNull
  public final TextView RoomnameVIP;

  @NonNull
  public final ImageView cardViewImgVIP;

  private ReyclevieweerviproomBinding(@NonNull CardView rootView, @NonNull TextView RoomDescVIP,
      @NonNull TextView RoomnameVIP, @NonNull ImageView cardViewImgVIP) {
    this.rootView = rootView;
    this.RoomDescVIP = RoomDescVIP;
    this.RoomnameVIP = RoomnameVIP;
    this.cardViewImgVIP = cardViewImgVIP;
  }

  @Override
  @NonNull
  public CardView getRoot() {
    return rootView;
  }

  @NonNull
  public static ReyclevieweerviproomBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ReyclevieweerviproomBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.reyclevieweerviproom, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ReyclevieweerviproomBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.RoomDescVIP;
      TextView RoomDescVIP = ViewBindings.findChildViewById(rootView, id);
      if (RoomDescVIP == null) {
        break missingId;
      }

      id = R.id.RoomnameVIP;
      TextView RoomnameVIP = ViewBindings.findChildViewById(rootView, id);
      if (RoomnameVIP == null) {
        break missingId;
      }

      id = R.id.cardViewImgVIP;
      ImageView cardViewImgVIP = ViewBindings.findChildViewById(rootView, id);
      if (cardViewImgVIP == null) {
        break missingId;
      }

      return new ReyclevieweerviproomBinding((CardView) rootView, RoomDescVIP, RoomnameVIP,
          cardViewImgVIP);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}