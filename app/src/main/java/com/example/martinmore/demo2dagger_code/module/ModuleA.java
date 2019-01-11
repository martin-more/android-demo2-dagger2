package com.example.martinmore.demo2dagger_code.module;

import android.content.Context;
import android.location.LocationManager;

import dagger.Module;
import dagger.Provides;
import dagger.multibindings.IntoSet;

@Module
public class ModuleA {

    @Provides
    @IntoSet
    static String provideOneString(LocationManager depA, Context depB) {
        return "ABC";
    }

}
