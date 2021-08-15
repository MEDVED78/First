package com.zadania.lesson1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Calculator extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setTitle("LessonSecond");
        setContentView(R.layout.activity_calculator);
    }
}