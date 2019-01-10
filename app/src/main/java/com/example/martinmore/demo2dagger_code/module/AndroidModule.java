package com.example.martinmore.demo2dagger_code.module;

import android.content.Context;
import android.location.LocationManager;

import com.example.martinmore.demo2dagger_code.DemoApplication;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

import static android.content.Context.LOCATION_SERVICE;

@Module
public class AndroidModule {

    private final DemoApplication application;

    public AndroidModule(DemoApplication application) {
        this.application = application;
    }

    @Singleton
    @Provides
    Context ApplicationContext() {
        return application;
    }

    @Provides
    @Singleton
    LocationManager provideLocationManager() {
        return (LocationManager) application.getSystemService(LOCATION_SERVICE);
    }

}
