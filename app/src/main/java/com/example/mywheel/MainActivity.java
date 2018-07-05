package com.example.mywheel;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.library.LogUtils;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        LogUtils.info(getClass().getSimpleName() + " onCreate...");
    }
}
