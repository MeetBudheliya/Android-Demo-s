package com.stack.buttontextcolor;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class HomeActivity extends AppCompatActivity  {

    TextView txtInfo;
    EditText etFname;
    Button btnQue1,btnQue2,btnQue3,btnQue4,btnQue5,btnQue6,btnQue7,btnQue8,btnQue9,btnQue10;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        btnQue1 = findViewById(R.id.btnQue1);
        btnQue2 = findViewById(R.id.btnQue2);
        btnQue3 = findViewById(R.id.btnQue3);
        btnQue4 = findViewById(R.id.btnQue4);
        btnQue5 = findViewById(R.id.btnQue5);
        btnQue6 = findViewById(R.id.btnQue6);
        btnQue7 = findViewById(R.id.btnQue7);
        btnQue8 = findViewById(R.id.btnQue8);
        btnQue9 = findViewById(R.id.btnQue9);
        btnQue10 = findViewById(R.id.btnQue10);


        btnQue1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeActivity.this, Que1Activity.class);
                startActivity(intent);
            }
        });

        btnQue2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeActivity.this, Que2Activity.class);
                startActivity(intent);
            }
        });

        btnQue3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeActivity.this, Que3Activity.class);
                startActivity(intent);
            }
        });


        btnQue4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeActivity.this, Que4Activity.class);
                startActivity(intent);
            }
        });

        btnQue5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeActivity.this, Que5Activity.class);
                startActivity(intent);
            }
        });

        btnQue6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeActivity.this, Que6Activity.class);
                startActivity(intent);
            }
        });

        btnQue7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeActivity.this, Que7Activity.class);
                startActivity(intent);
            }
        });

        btnQue8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeActivity.this, Que8Activity.class);
                startActivity(intent);
            }
        });
        btnQue9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeActivity.this, Que9Activity.class);
                startActivity(intent);
            }
        });

        btnQue10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}