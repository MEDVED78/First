package com.zadania.lesson1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Calculator extends SettingsCalculator implements View.OnClickListener {
    static String TAG = "text";
    static String TAG1 = "numb1";
    static String TAG2 = "numb2";

    Text text, numb1, numb2;
    String vtext = "";
    float number1, number2, sum, min, divis, multip;
    int otv = 0;
    static int k = 1;
    private static String TAG5 = "myLogs";
    androidx.appcompat.widget.AppCompatTextView textView;
    androidx.appcompat.widget.AppCompatButton button1;
    androidx.appcompat.widget.AppCompatButton button2;
    androidx.appcompat.widget.AppCompatButton button3;
    androidx.appcompat.widget.AppCompatButton button4;
    androidx.appcompat.widget.AppCompatButton button5;
    androidx.appcompat.widget.AppCompatButton button6;
    androidx.appcompat.widget.AppCompatButton button7;
    androidx.appcompat.widget.AppCompatButton button8;
    androidx.appcompat.widget.AppCompatButton button9;
    androidx.appcompat.widget.AppCompatButton button0;
    androidx.appcompat.widget.AppCompatButton buttonPoint;
    androidx.appcompat.widget.AppCompatButton buttonPlus;
    androidx.appcompat.widget.AppCompatButton buttonMinus;
    androidx.appcompat.widget.AppCompatButton buttonMult;
    androidx.appcompat.widget.AppCompatButton buttonDiv;
    androidx.appcompat.widget.AppCompatButton buttonClear;
    androidx.appcompat.widget.AppCompatButton buttonEqual;
    androidx.appcompat.widget.AppCompatButton buttonSettings;
    androidx.appcompat.widget.AppCompatButton buttonApply;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setTitle("LessonFourth");
        // setTheme(getAppTheme(R.style.MyCoolStyle));
        setContentView(R.layout.activity_calculator);
        text = new Text();
        numb1 = new Text();
        numb2 = new Text();
        initView();
        iniListener();
        vtext = text.getText();
        number1 = numb1.getNumb1();
        number2 = numb2.getNumb2();
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
        buttonPoint = findViewById(R.id.button_point);
        buttonPlus = findViewById(R.id._plus);
        buttonMinus = findViewById(R.id._minus);
        buttonMult = findViewById(R.id._multiply);
        buttonDiv = findViewById(R.id._divide);
        buttonClear = findViewById(R.id._clear);
        buttonEqual = findViewById(R.id._equal);
        buttonSettings = findViewById(R.id.btnSettings);
        buttonApply = findViewById(R.id.btnApply);
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
        buttonSettings.setOnClickListener(this);
        buttonApply.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
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
                otv = 1;
                number1 = Float.valueOf(vtext);
                numb1.setNumb1(number1);
                vtext = vtext + "+";
                text.setText(vtext);
                vtext = "";
                break;
            case R.id._minus:
                otv = 2;
                number1 = Float.valueOf(vtext);
                numb1.setNumb1(number1);
                vtext = vtext + "-";
                text.setText(vtext);
                vtext = "";
                break;
            case R.id._multiply:
                otv = 3;
                number1 = Float.valueOf(vtext);
                vtext = vtext + "*";
                text.setText(vtext);
                vtext = "";
                break;
            case R.id._divide:
                otv = 4;
                number1 = Float.valueOf(vtext);
                numb1.setNumb1(number1);
                vtext = vtext + "\u00F7";
                text.setText(vtext);
                vtext = "";
                break;
            case R.id._clear:
                vtext = "";
                text.setText(vtext);
                otv = 0;
                vtext = "";
                break;
            case R.id._equal:
                number2 = Integer.valueOf(vtext);
                numb2.setNumb2(number2);
                switch (otv) {
                    case 1:
                        sum = number1 + number2;
                        vtext = String.valueOf(sum);
                        break;
                    case 2:
                        min = number1 - number2;
                        vtext = String.valueOf(min);
                        break;
                    case 3:
                        multip = number1 * number2;
                        vtext = String.valueOf(multip);
                        break;
                    case 4:
                        divis = number1 / number2;
                        vtext = String.valueOf(divis);
                        break;
                    default:
                        break;
                }
                text.setText(vtext);
                vtext = "";
                break;
            case R.id.btnSettings:
                // Чтобы стартовать активити, надо подготовить интент
                // В данном случае это будет явный интент, поскольку здесь передаётся класс активити
                Intent runSettings = new Intent(Calculator.this, SettingsCalculator.class);
                // Метод стартует активити, указанную в интенте
                startActivity(runSettings);
                break;
            case R.id.btnApply:
                recreate();
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
        outState.putParcelable(TAG1, numb1);
        outState.putParcelable(TAG2, numb2);
    }

    // Восстановление данных
    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        text = savedInstanceState.getParcelable(TAG);
        numb1 = savedInstanceState.getParcelable(TAG1);
        numb2 = savedInstanceState.getParcelable(TAG2);
        setContent();
    }

    private void setContent() {
        textView.setText(text.getText());
    }
}