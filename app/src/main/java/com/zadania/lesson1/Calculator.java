package com.zadania.lesson1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Calculator extends AppCompatActivity implements View.OnClickListener {
    TextView textView;
    Button button1;
    Button button2;
    Button button3;
    Button button4;
    Button button5;
    Button button6;
    Button button7;
    Button button8;
    Button button9;
    Button button0;
    Button buttonPoint;
    Button buttonPlus;
    Button buttonMinus;
    Button buttonMult;
    Button buttonDiv;
    Button buttonClear;
    Button buttonEqual;
    String text = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setTitle("LessonThird");
        setContentView(R.layout.activity_calculator);

        initView();
        iniListener();
    }

    private void initView() {
        textView = findViewById(R.id.textView_1);
        button1 = findViewById(R.id.button_1);
        button2 = findViewById(R.id.button_2);
        button3 = findViewById(R.id.button_3);
        button4 = findViewById(R.id.button_4);
        button5 = findViewById(R.id.button_5);
        button6 = findViewById(R.id.button_6);
        button7 = findViewById(R.id.button_7);
        button8 = findViewById(R.id.button_8);
        button9 = findViewById(R.id.button_9);
        button0 = findViewById(R.id.button_0);
        button0 = findViewById(R.id.button_0);
        buttonPoint = findViewById(R.id.button_point);
        buttonPlus = findViewById(R.id._plus);
        buttonMinus = findViewById(R.id._minus);
        buttonMult = findViewById(R.id._multiply);
        buttonDiv = findViewById(R.id._divide);
        buttonClear = findViewById(R.id._clear);
        buttonEqual = findViewById(R.id._equal);
    }

    private void iniListener() {
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);
        button7.setOnClickListener(this);
        button8.setOnClickListener(this);
        button9.setOnClickListener(this);
        button0.setOnClickListener(this);

        buttonPoint.setOnClickListener(this);
        buttonPlus.setOnClickListener(this);
        buttonMinus.setOnClickListener(this);
        buttonMult.setOnClickListener(this);
        buttonDiv.setOnClickListener(this);
        buttonClear.setOnClickListener(this);
        buttonEqual.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button_1:
                text = text + "1";
                break;
            case R.id.button_2:
                text = text + "2";
                break;
            case R.id.button_3:
                text = text + "3";
                break;
            case R.id.button_4:
                text = text + "4";
                break;
            case R.id.button_5:
                text = text + "5";
                break;
            case R.id.button_6:
                text = text + "6";
                break;
            case R.id.button_7:
                text = text + "7";
                break;
            case R.id.button_8:
                text = text + "8";
                break;
            case R.id.button_9:
                text = text + "9";
                break;
            case R.id.button_0:
                text = text + "0";
                break;
            case R.id.button_point:
                text = text + ".";
                break;
            case R.id._plus:
                text = text + "\u002B";
                break;
            case R.id._minus:
                text = text + "-";
                break;
            case R.id._multiply:
                text = text + "*";
                break;
            case R.id._divide:
                text = text + "\u00F7";
                break;
            case R.id._clear:
                text = "";
                break;
            case R.id._equal:
                text = text + "=";
                break;
            default:
                break;
        }
        textView.setText(text);
    }
}