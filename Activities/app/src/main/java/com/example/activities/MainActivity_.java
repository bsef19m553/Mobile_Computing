package com.example.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity_ extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_);
        TextView textView = (TextView) findViewById(R.id.textViewSecond);
        Intent intentRecieved = getIntent();
        String value  = intentRecieved.getStringExtra("key");
        textView.setText(value);
    }
}