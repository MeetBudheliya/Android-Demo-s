package com.stack.buttontextcolor;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity  {

    TextView txtInfo;
    EditText etFname;
    Button btnGreen,btnRed,btnBlue,btnSmall,btnMedium,btnLarge,btnSecound,btnSubmit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtInfo = findViewById(R.id.txtInfo);
        btnGreen = findViewById(R.id.btnGreen);
        btnRed = findViewById(R.id.btnRed);
        btnBlue = findViewById(R.id.btnBlue);

        btnSmall = findViewById(R.id.btnSmall);
        btnMedium = findViewById(R.id.btnMedium);
        btnLarge = findViewById(R.id.btnLarge);
        btnSecound = findViewById(R.id.btnSecound);
        btnSubmit = findViewById(R.id.btnSubmit);
        etFname = findViewById(R.id.etFname);

        btnBlue.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                txtInfo.setTextColor(getResources().getColor(R.color.blue));
            }
        });

        btnGreen.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                txtInfo.setTextColor(getResources().getColor(R.color.green));
            }
        });

        btnRed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtInfo.setTextColor(getResources().getColor(R.color.red));
            }
        });


        btnSmall.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                txtInfo.setTextSize(14);
            }
        });

        btnMedium.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                txtInfo.setTextSize(20);
            }
        });

        btnLarge.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtInfo.setTextSize(34);
            }
        });

        btnSecound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SecoundActivity.class);
                intent.putExtra("fname","Mayur");
                intent.putExtra("lname","Patel");
                intent.putExtra("gender","Male");
                intent.putExtra("phoneNo","78945612130");
                startActivity(intent);
            }
        });

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String fname = etFname.getText().toString();
                Intent intent = new Intent(MainActivity.this, StudentInfoActivity.class);
                intent.putExtra("fname",fname);
//                intent.putExtra("lname","Patel");
//                intent.putExtra("gender","Male");
//                intent.putExtra("phoneNo","78945612130");
                startActivity(intent);
            }
        });
    }
}