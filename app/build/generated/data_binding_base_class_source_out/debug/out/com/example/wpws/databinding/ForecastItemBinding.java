// Generated by view binder compiler. Do not edit!
package com.example.wpws.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.wpws.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ForecastItemBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final TextView forecastItemDescription;

  @NonNull
  public final TextView forecastItemLocation;

  @NonNull
  public final TextView forecastItemName;

  @NonNull
  public final TextView forecastItemRain;

  @NonNull
  public final TextView forecastItemRealFeel;

  @NonNull
  public final TextView forecastItemRh;

  @NonNull
  public final TextView forecastItemSeparator;

  @NonNull
  public final TextView forecastItemTemperature;

  @NonNull
  public final TextView forecastItemUv;

  @NonNull
  public final TextView forecastItemWindSpeed;

  private ForecastItemBinding(@NonNull RelativeLayout rootView,
      @NonNull TextView forecastItemDescription, @NonNull TextView forecastItemLocation,
      @NonNull TextView forecastItemName, @NonNull TextView forecastItemRain,
      @NonNull TextView forecastItemRealFeel, @NonNull TextView forecastItemRh,
      @NonNull TextView forecastItemSeparator, @NonNull TextView forecastItemTemperature,
      @NonNull TextView forecastItemUv, @NonNull TextView forecastItemWindSpeed) {
    this.rootView = rootView;
    this.forecastItemDescription = forecastItemDescription;
    this.forecastItemLocation = forecastItemLocation;
    this.forecastItemName = forecastItemName;
    this.forecastItemRain = forecastItemRain;
    this.forecastItemRealFeel = forecastItemRealFeel;
    this.forecastItemRh = forecastItemRh;
    this.forecastItemSeparator = forecastItemSeparator;
    this.forecastItemTemperature = forecastItemTemperature;
    this.forecastItemUv = forecastItemUv;
    this.forecastItemWindSpeed = forecastItemWindSpeed;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ForecastItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ForecastItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.forecast_item, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ForecastItemBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.forecast_item_description;
      TextView forecastItemDescription = ViewBindings.findChildViewById(rootView, id);
      if (forecastItemDescription == null) {
        break missingId;
      }

      id = R.id.forecast_item_location;
      TextView forecastItemLocation = ViewBindings.findChildViewById(rootView, id);
      if (forecastItemLocation == null) {
        break missingId;
      }

      id = R.id.forecast_item_name;
      TextView forecastItemName = ViewBindings.findChildViewById(rootView, id);
      if (forecastItemName == null) {
        break missingId;
      }

      id = R.id.forecast_item_rain;
      TextView forecastItemRain = ViewBindings.findChildViewById(rootView, id);
      if (forecastItemRain == null) {
        break missingId;
      }

      id = R.id.forecast_item_real_feel;
      TextView forecastItemRealFeel = ViewBindings.findChildViewById(rootView, id);
      if (forecastItemRealFeel == null) {
        break missingId;
      }

      id = R.id.forecast_Item_rh;
      TextView forecastItemRh = ViewBindings.findChildViewById(rootView, id);
      if (forecastItemRh == null) {
        break missingId;
      }

      id = R.id.forecast_item_separator;
      TextView forecastItemSeparator = ViewBindings.findChildViewById(rootView, id);
      if (forecastItemSeparator == null) {
        break missingId;
      }

      id = R.id.forecast_item_temperature;
      TextView forecastItemTemperature = ViewBindings.findChildViewById(rootView, id);
      if (forecastItemTemperature == null) {
        break missingId;
      }

      id = R.id.forecast_item_uv;
      TextView forecastItemUv = ViewBindings.findChildViewById(rootView, id);
      if (forecastItemUv == null) {
        break missingId;
      }

      id = R.id.forecast_item_wind_speed;
      TextView forecastItemWindSpeed = ViewBindings.findChildViewById(rootView, id);
      if (forecastItemWindSpeed == null) {
        break missingId;
      }

      return new ForecastItemBinding((RelativeLayout) rootView, forecastItemDescription,
          forecastItemLocation, forecastItemName, forecastItemRain, forecastItemRealFeel,
          forecastItemRh, forecastItemSeparator, forecastItemTemperature, forecastItemUv,
          forecastItemWindSpeed);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
