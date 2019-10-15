package com.example.calculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button button0, button1, button2, button3, button4, button5, button6,
            button7, button8, button9, buttonAdd, buttonSub, buttonDivision,
            buttonMul, buttonC, buttonEqual;
    TextView crunchifyTextView;

    float mValueOne, mValueTwo;

    boolean crunchifyAddition, mSubtract, crunchifyMultiplication, crunchifyDivision;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button0 = (Button) findViewById(R.id.bu0);
        button1 = (Button) findViewById(R.id.bu1);
        button2 = (Button) findViewById(R.id.bu2);
        button3 = (Button) findViewById(R.id.bu3);
        button4 = (Button) findViewById(R.id.bu4);
        button5 = (Button) findViewById(R.id.bu5);
        button6 = (Button) findViewById(R.id.bu6);
        button7 = (Button) findViewById(R.id.bu7);
        button8 = (Button) findViewById(R.id.bu8);
        button9 = (Button) findViewById(R.id.but9);
        buttonAdd = (Button) findViewById(R.id.buPlus);
        buttonSub = (Button) findViewById(R.id.buMinus);
        buttonMul = (Button) findViewById(R.id.buMul);
        buttonDivision = (Button) findViewById(R.id.buDot);
        buttonC = (Button) findViewById(R.id.buAc);
        buttonEqual = (Button) findViewById(R.id.buEqual);
        crunchifyTextView = (TextView)  findViewById(R.id.textView);


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                crunchifyTextView.setText(crunchifyTextView.getText() + "1");
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                crunchifyTextView.setText(crunchifyTextView.getText() + "2");
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                crunchifyTextView.setText(crunchifyTextView.getText() + "3");
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                crunchifyTextView.setText(crunchifyTextView.getText() + "4");
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                crunchifyTextView.setText(crunchifyTextView.getText() + "5");
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                crunchifyTextView.setText(crunchifyTextView.getText() + "6");
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                crunchifyTextView.setText(crunchifyTextView.getText() + "7");
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                crunchifyTextView.setText(crunchifyTextView.getText() + "8");
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                crunchifyTextView.setText(crunchifyTextView.getText() + "9");
            }
        });

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                crunchifyTextView.setText(crunchifyTextView.getText() + "0");
            }
        });

        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (crunchifyTextView == null) {
                    crunchifyTextView.setText("");
                } else {
                    mValueOne = Float.parseFloat(crunchifyTextView.getText() + "");
                    crunchifyAddition = true;
                    crunchifyTextView.setText(null);
                }
            }
        });

        buttonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(crunchifyTextView.getText() + "");
                mSubtract = true;
                crunchifyTextView.setText(null);
            }
        });

        buttonMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(crunchifyTextView.getText() + "");
                crunchifyMultiplication = true;
                crunchifyTextView.setText(null);
            }
        });

        buttonDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(crunchifyTextView.getText() + "");
                crunchifyDivision = true;
                crunchifyTextView.setText(null);
            }
        });

        buttonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueTwo = Float.parseFloat(crunchifyTextView.getText() + "");

                if (crunchifyAddition == true) {
                    crunchifyTextView.setText(mValueOne + mValueTwo + "");
                    crunchifyAddition = false;
                }

                if (mSubtract == true) {
                    crunchifyTextView.setText(mValueOne - mValueTwo + "");
                    mSubtract = false;
                }

                if (crunchifyMultiplication == true) {
                    crunchifyTextView.setText(mValueOne * mValueTwo + "");
                    crunchifyMultiplication = false;
                }

                if (crunchifyDivision == true) {
                    crunchifyTextView.setText(mValueOne / mValueTwo + "");
                    crunchifyDivision = false;
                }
            }
        });

        buttonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                crunchifyTextView.setText("");
            }
        });
    }
}