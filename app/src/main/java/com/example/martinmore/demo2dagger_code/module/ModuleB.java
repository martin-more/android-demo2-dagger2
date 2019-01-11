package com.example.martinmore.demo2dagger_code.module;

import android.content.Context;
import android.location.LocationManager;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import dagger.Module;
import dagger.Provides;
import dagger.multibindings.ElementsIntoSet;

@Module
public class ModuleB {

    @Provides
    @ElementsIntoSet
    static Set<String> provideSomeStrings(LocationManager depA, Context depB) {
        return new HashSet<>(Arrays.asList("DEF", "GHI"));
    }

}
