// Generated by view binder compiler. Do not edit!
package com.example.wpws.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.GridLayout;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.wpws.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class AddAlarmDialogBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button alarmDialogAddDay;

  @NonNull
  public final Button alarmDialogButton;

  @NonNull
  public final TextView alarmDialogConditionsText;

  @NonNull
  public final Button alarmDialogDeleteDay;

  @NonNull
  public final TextView alarmDialogError;

  @NonNull
  public final TextView alarmDialogLocationText;

  @NonNull
  public final Spinner alarmDialogLocations;

  @NonNull
  public final EditText alarmDialogName;

  @NonNull
  public final GridLayout alarmDialogNewDays;

  @NonNull
  public final RecyclerView alarmDialogRecycler;

  @NonNull
  public final TextView alarmDialogTitle;

  private AddAlarmDialogBinding(@NonNull ConstraintLayout rootView,
      @NonNull Button alarmDialogAddDay, @NonNull Button alarmDialogButton,
      @NonNull TextView alarmDialogConditionsText, @NonNull Button alarmDialogDeleteDay,
      @NonNull TextView alarmDialogError, @NonNull TextView alarmDialogLocationText,
      @NonNull Spinner alarmDialogLocations, @NonNull EditText alarmDialogName,
      @NonNull GridLayout alarmDialogNewDays, @NonNull RecyclerView alarmDialogRecycler,
      @NonNull TextView alarmDialogTitle) {
    this.rootView = rootView;
    this.alarmDialogAddDay = alarmDialogAddDay;
    this.alarmDialogButton = alarmDialogButton;
    this.alarmDialogConditionsText = alarmDialogConditionsText;
    this.alarmDialogDeleteDay = alarmDialogDeleteDay;
    this.alarmDialogError = alarmDialogError;
    this.alarmDialogLocationText = alarmDialogLocationText;
    this.alarmDialogLocations = alarmDialogLocations;
    this.alarmDialogName = alarmDialogName;
    this.alarmDialogNewDays = alarmDialogNewDays;
    this.alarmDialogRecycler = alarmDialogRecycler;
    this.alarmDialogTitle = alarmDialogTitle;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static AddAlarmDialogBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static AddAlarmDialogBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.add_alarm_dialog, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static AddAlarmDialogBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.alarm_dialog_add_day;
      Button alarmDialogAddDay = ViewBindings.findChildViewById(rootView, id);
      if (alarmDialogAddDay == null) {
        break missingId;
      }

      id = R.id.alarm_dialog_button;
      Button alarmDialogButton = ViewBindings.findChildViewById(rootView, id);
      if (alarmDialogButton == null) {
        break missingId;
      }

      id = R.id.alarm_dialog_conditions_text;
      TextView alarmDialogConditionsText = ViewBindings.findChildViewById(rootView, id);
      if (alarmDialogConditionsText == null) {
        break missingId;
      }

      id = R.id.alarm_dialog_delete_day;
      Button alarmDialogDeleteDay = ViewBindings.findChildViewById(rootView, id);
      if (alarmDialogDeleteDay == null) {
        break missingId;
      }

      id = R.id.alarm_dialog_error;
      TextView alarmDialogError = ViewBindings.findChildViewById(rootView, id);
      if (alarmDialogError == null) {
        break missingId;
      }

      id = R.id.alarm_dialog_location_text;
      TextView alarmDialogLocationText = ViewBindings.findChildViewById(rootView, id);
      if (alarmDialogLocationText == null) {
        break missingId;
      }

      id = R.id.alarm_dialog_locations;
      Spinner alarmDialogLocations = ViewBindings.findChildViewById(rootView, id);
      if (alarmDialogLocations == null) {
        break missingId;
      }

      id = R.id.alarm_dialog_name;
      EditText alarmDialogName = ViewBindings.findChildViewById(rootView, id);
      if (alarmDialogName == null) {
        break missingId;
      }

      id = R.id.alarm_dialog_new_days;
      GridLayout alarmDialogNewDays = ViewBindings.findChildViewById(rootView, id);
      if (alarmDialogNewDays == null) {
        break missingId;
      }

      id = R.id.alarm_dialog_recycler;
      RecyclerView alarmDialogRecycler = ViewBindings.findChildViewById(rootView, id);
      if (alarmDialogRecycler == null) {
        break missingId;
      }

      id = R.id.alarm_dialog_title;
      TextView alarmDialogTitle = ViewBindings.findChildViewById(rootView, id);
      if (alarmDialogTitle == null) {
        break missingId;
      }

      return new AddAlarmDialogBinding((ConstraintLayout) rootView, alarmDialogAddDay,
          alarmDialogButton, alarmDialogConditionsText, alarmDialogDeleteDay, alarmDialogError,
          alarmDialogLocationText, alarmDialogLocations, alarmDialogName, alarmDialogNewDays,
          alarmDialogRecycler, alarmDialogTitle);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
