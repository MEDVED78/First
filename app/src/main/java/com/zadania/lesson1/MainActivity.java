package com.zadania.lesson1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.CalendarView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = new Intent(this, Calculator.class);
        startActivity(intent);
   //     setContentView(R.layout.activity_main);
   //     setContentView(R.layout.activity_main_second);
    }
}