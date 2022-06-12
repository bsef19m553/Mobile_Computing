package com.example.calculatorapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import org.mozilla.javascript.Context;
import org.mozilla.javascript.Scriptable;
public class MainActivity extends AppCompatActivity {
    Button zero,one,two,three,four,five,six,seven,eight,nine;
    Button dot,equal,plusMinus,plus,minus,multiply,divide, modulus,brackets,calculate;
    TextView input, output;
    String data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        input=findViewById(R.id.valueInput);
        output=findViewById(R.id.valueOutput);

        zero=findViewById(R.id.zero);
        one=findViewById(R.id.one);
        two=findViewById(R.id.two);
        three=findViewById(R.id.three);
        four=findViewById(R.id.four);
        five=findViewById(R.id.five);
        six=findViewById(R.id.six);
        seven=findViewById(R.id.seven);
        eight=findViewById(R.id.eight);
        nine=findViewById(R.id.nine);

        dot=findViewById(R.id.dot);
        equal=findViewById(R.id.equal);
        plusMinus=findViewById(R.id.plusMinus);
        plus=findViewById(R.id.plus);
        minus=findViewById(R.id.minus);
        multiply=findViewById(R.id.multiply);
        divide=findViewById(R.id.divide);
        modulus=findViewById(R.id.modulus);
        brackets=findViewById(R.id.bracket);
        calculate=findViewById(R.id.cal);

        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data=input.getText().toString();
                input.setText(data+"0");
            }
        });
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data=input.getText().toString();
                input.setText(data+"1");
            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data=input.getText().toString();
                input.setText(data+"2");
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data=input.getText().toString();
                input.setText(data+"3");
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data=input.getText().toString();
                input.setText(data+"4");
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data=input.getText().toString();
                input.setText(data+"5");
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data=input.getText().toString();
                input.setText(data+"6");
            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data=input.getText().toString();
                input.setText(data+"7");
            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data=input.getText().toString();
                input.setText(data+"8");
            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data=input.getText().toString();
                input.setText(data+"9");
            }
        });
        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input.setText("");
                output.setText("");
            }
        });
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data=input.getText().toString();
                input.setText(data+"+");
            }
        });
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data=input.getText().toString();
                input.setText(data+"-");
            }
        });
        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data=input.getText().toString();
                input.setText(data+"×");
            }
        });
        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data=input.getText().toString();
                input.setText(data+"/");
            }
        });
        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data=input.getText().toString();
                input.setText(data+".");
            }
        });
        modulus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = input.getText().toString();
                input.setText(data + "%");
            }
        });
        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data=input.getText().toString();
                // Toast.makeText(MainActivity.this, ""+data, Toast.LENGTH_SHORT).show();

                data=data.replaceAll("×","*");
                data=data.replaceAll("%","/100");
                data=data.replaceAll("÷","/");

                Context rhino=Context.enter();
                rhino.setOptimizationLevel(-1);

                String finalResult="";

                Scriptable scriptable=rhino.initStandardObjects();
                finalResult=rhino.evaluateString(scriptable,data,"Javascript",1,null).toString();
                output.setText(finalResult);




            }
        });

    }
}