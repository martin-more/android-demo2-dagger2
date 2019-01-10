package com.example.martinmore.demo2dagger_code;

import android.app.Application;
import android.location.LocationManager;

import com.example.martinmore.demo2dagger_code.components.ApplicationComponent;
import com.example.martinmore.demo2dagger_code.components.DaggerApplicationComponent;
import com.example.martinmore.demo2dagger_code.module.AndroidModule;

import javax.inject.Inject;

public class DemoApplication extends Application {

    @Inject
    LocationManager locationManager;

    private ApplicationComponent component;

    @Override
    public void onCreate() {
        super.onCreate();
        component = DaggerApplicationComponent.builder()
                .androidModule(new AndroidModule(this))
                .build();
        component.inject(this); // As of now, LocationManager should be injected into this.
    }

    public ApplicationComponent component() {
        return component;
    }
}
