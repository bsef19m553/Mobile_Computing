package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button web,dial,email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        web=findViewById(R.id.repo);
        web.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri=Uri.parse("https://github.com/abdullahgr/mobile-computing");
                Intent in=new Intent(Intent.ACTION_VIEW,uri);
                startActivity(in);
            }
        });
        dial=findViewById(R.id.dialMyNumber);
        dial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri=Uri.parse("tel:+923200040840");
                Intent in=new Intent(Intent.ACTION_DIAL,uri);
                startActivity(in);
            }
        });
        email=findViewById(R.id.sendEmail);
        email.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in=new Intent(Intent.ACTION_SEND);
                in.setData(Uri.parse("mailto:"));
                in.setType("*/*");
                in.putExtra(in.EXTRA_EMAIL,"aliabdullah292631@gmail.com");
                in.putExtra(in.EXTRA_SUBJECT,"Send Email");
                if(in.resolveActivity(getPackageManager()) != null) {
                    startActivity(in);
                }

                startActivity(in);}

        });

    }
}