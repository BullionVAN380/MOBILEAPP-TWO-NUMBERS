package com.example.myphone;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText Num1;
    private  EditText Num2;
    private Button Add;
    private Button Minus;
    private Button Divide;
    private  Button Multiply;
    private  TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Num1 = findViewById(R.id.num1);
        Num2 = findViewById(R.id.num2);
        result =(TextView) findViewById(R.id.answer);
        Add =(Button) findViewById(R.id.btnadd);
        Minus=(Button) findViewById(R.id.btnsub);
        Divide=(Button) findViewById(R.id.btndivide);
        Multiply=(Button) findViewById(R.id.btnmult) ;


        //event listeners for addition
        Add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int Number1=Integer.parseInt(Num1.getText().toString());
                int Number2=Integer.parseInt(Num2.getText().toString());

                int Add=Number1+Number2;
                result.setText("Result Is: "+String.valueOf(Add));
            }
        });

        //event listeners for subtraction
        Minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int Number1=Integer.parseInt(Num1.getText().toString());
                int Number2=Integer.parseInt(Num2.getText().toString());

                int Minus=Number1-Number2;
                result.setText("Result Is: "+String.valueOf(Minus));
            }
        });

        //event listeners for division
        Divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int Number1=Integer.parseInt(Num1.getText().toString());
                int Number2=Integer.parseInt(Num2.getText().toString());

                int Divide=Number1/Number2;

                result.setText("Result Is: "+String.valueOf(Divide));

                }

        });

        //event listeners multiplication
        Multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int Number1=Integer.parseInt(Num1.getText().toString());
                int Number2=Integer.parseInt(Num2.getText().toString());

                int Multiply=Number1*Number2;
                result.setText("Result Is: "+String.valueOf(Multiply));
            }
        });

    }
}