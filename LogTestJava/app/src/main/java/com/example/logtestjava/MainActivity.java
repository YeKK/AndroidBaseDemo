package com.example.logtestjava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {


    private static final String TAG = "Main Activity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.e(TAG, "onCreate: ", new Throwable());
        Log.e(TAG, "onCreate: ");
        Log.w(TAG, "onCreate: ", new Throwable());
        Log.w(TAG, "onCreate: ");
        Log.i(TAG, "onCreate: ");
        Log.d(TAG, "onCreate: ");
        Log.v(TAG, "onCreate: "); //筛选器会筛出比它等级更高的log,而不是等级低的log
    }
}