// Generated by view binder compiler. Do not edit!
package com.example.ajaibmusicstudio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.ajaibmusicstudio.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityVipRoomListBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final RecyclerView ReyclerViewVIPRoom;

  private ActivityVipRoomListBinding(@NonNull ConstraintLayout rootView,
      @NonNull RecyclerView ReyclerViewVIPRoom) {
    this.rootView = rootView;
    this.ReyclerViewVIPRoom = ReyclerViewVIPRoom;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityVipRoomListBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityVipRoomListBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_vip_room_list, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityVipRoomListBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.ReyclerViewVIPRoom;
      RecyclerView ReyclerViewVIPRoom = ViewBindings.findChildViewById(rootView, id);
      if (ReyclerViewVIPRoom == null) {
        break missingId;
      }

      return new ActivityVipRoomListBinding((ConstraintLayout) rootView, ReyclerViewVIPRoom);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
