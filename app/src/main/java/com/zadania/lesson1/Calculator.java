package com.zadania.lesson1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Calculator extends AppCompatActivity implements View.OnClickListener {
    static String TAG = "text";
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
    Text text;
    String vtext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setTitle("LessonThird");
        setContentView(R.layout.activity_calculator);

        text = new Text();
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
        vtext = text.getText();
        switch (v.getId()) {
            case R.id.button_1:
                vtext = vtext + "1";
                text.setText(vtext);
                break;
            case R.id.button_2:
                vtext = vtext + "2";
                text.setText(vtext);
                break;
            case R.id.button_3:
                vtext = vtext + "3";
                text.setText(vtext);
                break;
            case R.id.button_4:
                vtext = vtext + "4";
                text.setText(vtext);
                break;
            case R.id.button_5:
                vtext = vtext + "5";
                text.setText(vtext);
                break;
            case R.id.button_6:
                vtext = vtext + "6";
                text.setText(vtext);
                break;
            case R.id.button_7:
                vtext = vtext + "7";
                text.setText(vtext);
                break;
            case R.id.button_8:
                vtext = vtext + "8";
                text.setText(vtext);
                break;
            case R.id.button_9:
                vtext = vtext + "9";
                text.setText(vtext);
                break;
            case R.id.button_0:
                vtext = vtext + "0";
                text.setText(vtext);
                break;
            case R.id.button_point:
                vtext = vtext + ".";
                text.setText(vtext);
                break;
            case R.id._plus:
                vtext = vtext + "+";
                text.setText(vtext);
                break;
            case R.id._minus:
                vtext = vtext + "-";
                text.setText(vtext);
                break;
            case R.id._multiply:
                vtext = vtext + "*";
                text.setText(vtext);
                break;
            case R.id._divide:
                vtext = vtext + "\u00F7";
                text.setText(vtext);
                break;
            case R.id._clear:
                vtext = "";
                text.setText(vtext);
                break;
            case R.id._equal:
                vtext = vtext + "=";
                text.setText(vtext);
                break;
            default:
                break;
        }
        setContent();
    }

    // Сохранение данных
    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putParcelable(TAG, text);
    }

    // Восстановление данных
    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        text = savedInstanceState.getParcelable(TAG);
        setContent();
    }

    private void setContent() {
        textView.setText(text.getText());
    }


}