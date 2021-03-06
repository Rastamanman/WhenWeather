// Generated by view binder compiler. Do not edit!
package com.example.wpws.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.wpws.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class DayCondItemBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final TextView dayConditionClouds;

  @NonNull
  public final TextView dayConditionMaxTemp;

  @NonNull
  public final TextView dayConditionMinTemp;

  @NonNull
  public final TextView dayConditionNumber;

  @NonNull
  public final TextView dayConditionPrecipitation;

  @NonNull
  public final TextView dayConditionPressure;

  @NonNull
  public final TextView dayConditionRain;

  @NonNull
  public final TextView dayConditionRh;

  @NonNull
  public final TextView dayConditionSeparator;

  @NonNull
  public final TextView dayConditionSnow;

  @NonNull
  public final TextView dayConditionTemp;

  @NonNull
  public final TextView dayConditionWindSpeed;

  private DayCondItemBinding(@NonNull ConstraintLayout rootView,
      @NonNull TextView dayConditionClouds, @NonNull TextView dayConditionMaxTemp,
      @NonNull TextView dayConditionMinTemp, @NonNull TextView dayConditionNumber,
      @NonNull TextView dayConditionPrecipitation, @NonNull TextView dayConditionPressure,
      @NonNull TextView dayConditionRain, @NonNull TextView dayConditionRh,
      @NonNull TextView dayConditionSeparator, @NonNull TextView dayConditionSnow,
      @NonNull TextView dayConditionTemp, @NonNull TextView dayConditionWindSpeed) {
    this.rootView = rootView;
    this.dayConditionClouds = dayConditionClouds;
    this.dayConditionMaxTemp = dayConditionMaxTemp;
    this.dayConditionMinTemp = dayConditionMinTemp;
    this.dayConditionNumber = dayConditionNumber;
    this.dayConditionPrecipitation = dayConditionPrecipitation;
    this.dayConditionPressure = dayConditionPressure;
    this.dayConditionRain = dayConditionRain;
    this.dayConditionRh = dayConditionRh;
    this.dayConditionSeparator = dayConditionSeparator;
    this.dayConditionSnow = dayConditionSnow;
    this.dayConditionTemp = dayConditionTemp;
    this.dayConditionWindSpeed = dayConditionWindSpeed;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static DayCondItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static DayCondItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.day_cond_item, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static DayCondItemBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.day_condition_clouds;
      TextView dayConditionClouds = ViewBindings.findChildViewById(rootView, id);
      if (dayConditionClouds == null) {
        break missingId;
      }

      id = R.id.day_condition_max_temp;
      TextView dayConditionMaxTemp = ViewBindings.findChildViewById(rootView, id);
      if (dayConditionMaxTemp == null) {
        break missingId;
      }

      id = R.id.day_condition_min_temp;
      TextView dayConditionMinTemp = ViewBindings.findChildViewById(rootView, id);
      if (dayConditionMinTemp == null) {
        break missingId;
      }

      id = R.id.day_condition_number;
      TextView dayConditionNumber = ViewBindings.findChildViewById(rootView, id);
      if (dayConditionNumber == null) {
        break missingId;
      }

      id = R.id.day_condition_precipitation;
      TextView dayConditionPrecipitation = ViewBindings.findChildViewById(rootView, id);
      if (dayConditionPrecipitation == null) {
        break missingId;
      }

      id = R.id.day_condition_pressure;
      TextView dayConditionPressure = ViewBindings.findChildViewById(rootView, id);
      if (dayConditionPressure == null) {
        break missingId;
      }

      id = R.id.day_condition_rain;
      TextView dayConditionRain = ViewBindings.findChildViewById(rootView, id);
      if (dayConditionRain == null) {
        break missingId;
      }

      id = R.id.day_condition_rh;
      TextView dayConditionRh = ViewBindings.findChildViewById(rootView, id);
      if (dayConditionRh == null) {
        break missingId;
      }

      id = R.id.day_condition_separator;
      TextView dayConditionSeparator = ViewBindings.findChildViewById(rootView, id);
      if (dayConditionSeparator == null) {
        break missingId;
      }

      id = R.id.day_condition_snow;
      TextView dayConditionSnow = ViewBindings.findChildViewById(rootView, id);
      if (dayConditionSnow == null) {
        break missingId;
      }

      id = R.id.day_condition_temp;
      TextView dayConditionTemp = ViewBindings.findChildViewById(rootView, id);
      if (dayConditionTemp == null) {
        break missingId;
      }

      id = R.id.day_condition_wind_speed;
      TextView dayConditionWindSpeed = ViewBindings.findChildViewById(rootView, id);
      if (dayConditionWindSpeed == null) {
        break missingId;
      }

      return new DayCondItemBinding((ConstraintLayout) rootView, dayConditionClouds,
          dayConditionMaxTemp, dayConditionMinTemp, dayConditionNumber, dayConditionPrecipitation,
          dayConditionPressure, dayConditionRain, dayConditionRh, dayConditionSeparator,
          dayConditionSnow, dayConditionTemp, dayConditionWindSpeed);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
