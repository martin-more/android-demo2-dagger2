package com.example.martinmore.demo2dagger_code;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.martinmore.demo2dagger_code.components.DaggerMainActivityComponent;
import com.example.martinmore.demo2dagger_code.module.MyModule2;

import java.util.Map;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    Test3 test1;
    @Inject
    Test3 test2;
    @Inject
    Map<String, Long> test4;
    @Inject
    Map<MyModule2.MyEnum, String> test3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DaggerMainActivityComponent.builder()
                .applicationComponent(((DemoApplication)getApplication()).component())
                .build()
                .inject(this);
    }
}
