package com.example.calculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText no1 , no2;
    Button add ,mul ,div , sub,equal;
    TextView answer;

    double ans = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        no1 = findViewById(R.id.first_no);
        no2 = findViewById(R.id.second_no);

        add = findViewById(R.id.add);
        sub = findViewById(R.id.sub);
        mul = findViewById(R.id.mul);
        div = findViewById(R.id.div);

        equal = findViewById(R.id.equals);

        answer = findViewById(R.id.answer);

        //addition algorithm
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num1 = no1.getText().toString();
                String num2 = no2.getText().toString();

                if (num1.isEmpty() || num2.isEmpty()) {
                    Toast.makeText(getApplicationContext(),"Enter Numbers",Toast.LENGTH_SHORT).show();
                }
                else {
                    double a = Double.parseDouble(no1.getText().toString());
                    double b = Double.parseDouble(no2.getText().toString());
                    ans = a + b;
                }
            }
        });

        //subtraction
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num1 = no1.getText().toString();
                String num2 = no2.getText().toString();

                if (num1.isEmpty() || num2.isEmpty()) {
                    Toast.makeText(getApplicationContext(),"Enter Numbers",Toast.LENGTH_SHORT).show();
                }
                else {
                    double a = Double.parseDouble(no1.getText().toString());
                    double b = Double.parseDouble(no2.getText().toString());
                    ans = a - b;
                }
            }
        });

        //multiplication algo
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num1 = no1.getText().toString();
                String num2 = no2.getText().toString();

                if (num1.isEmpty() || num2.isEmpty()) {
                    Toast.makeText(getApplicationContext(), "Enter Numbers", Toast.LENGTH_SHORT).show();
                } else {
                    double a = Double.parseDouble(no1.getText().toString());
                    double b = Double.parseDouble(no2.getText().toString());
                    if (b != 0)
                        ans = a / b;
                    else
                        Toast.makeText(getApplicationContext(), "Enter Valid Numbers", Toast.LENGTH_SHORT).show();
                }
            }
        });
        

    }
}