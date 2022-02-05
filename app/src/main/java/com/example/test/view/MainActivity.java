package com.example.test.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.test.R;
import com.example.test.viewmodel.MainDataViewModel;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}