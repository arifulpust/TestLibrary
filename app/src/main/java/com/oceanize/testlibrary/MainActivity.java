package com.oceanize.testlibrary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.oceanize.testlib.Calculator;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Calculator calculator=new Calculator();
        Log.e("calculator",""+calculator.Add(10,40));
    }
}
