package com.example.martinmore.demo2dagger_code.components;


import com.example.martinmore.demo2dagger_code.MainActivity;
import com.example.martinmore.demo2dagger_code.annotations.PerActivity;
import com.example.martinmore.demo2dagger_code.module.ModuleA;
import com.example.martinmore.demo2dagger_code.module.ModuleB;
import com.example.martinmore.demo2dagger_code.module.MyModule1;
import com.example.martinmore.demo2dagger_code.module.MyModule2;

import java.util.Map;
import java.util.Set;

import dagger.Component;

@PerActivity
@Component(
        dependencies = ApplicationComponent.class,
        modules = {MyModule1.class, MyModule2.class, ModuleA.class, ModuleB.class})
public interface MainActivityComponent {

    void inject(MainActivity mainActivity);
    Set<String> strings();
    Map<String, Long> longsByString();
    Map<MyModule2.MyEnum, String> stringsByMyEnum();

}
