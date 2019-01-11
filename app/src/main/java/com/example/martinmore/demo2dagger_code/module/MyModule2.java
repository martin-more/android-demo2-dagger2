package com.example.martinmore.demo2dagger_code.module;

import java.math.BigDecimal;

import dagger.MapKey;
import dagger.Module;
import dagger.Provides;
import dagger.multibindings.IntoMap;

@Module
public class MyModule2 {

    @Provides
    @IntoMap
    @MyEnumKey(MyEnum.ABC)
    static String provideABCValue() {
        return "value for ABC";
    }

    @Provides
    @IntoMap
    @MyNumberClassKey(BigDecimal.class)
    static String provideBigDecimalValue() {
        return "value for BigDecimal";
    }

    public static enum MyEnum {
        ABC, DEF;
    }

    @MapKey
    @interface MyEnumKey {
        MyEnum value();
    }

    @MapKey
    @interface MyNumberClassKey {
        Class<? extends Number> value();
    }

}
