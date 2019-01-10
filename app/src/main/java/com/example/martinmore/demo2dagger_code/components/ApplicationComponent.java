package com.example.martinmore.demo2dagger_code.components;

import android.content.Context;
import android.location.LocationManager;

import com.example.martinmore.demo2dagger_code.DemoApplication;
import com.example.martinmore.demo2dagger_code.module.AndroidModule;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {AndroidModule.class})
public interface ApplicationComponent {

    void inject(DemoApplication application);
    LocationManager getLocationManager();
    Context getContext();
}
