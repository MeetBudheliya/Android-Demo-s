package com.stack.buttontextcolor;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Que1Activity extends AppCompatActivity  {

    TextView txtInfo;
    EditText etFname;
    Button btnGreen,btnRed,btnBlue,btnSmall,btnMedium,btnLarge,btnSecound,btnSubmit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_que1);

        txtInfo = findViewById(R.id.txtInfo);
        btnGreen = findViewById(R.id.btnGreen);
        btnRed = findViewById(R.id.btnRed);
        btnBlue = findViewById(R.id.btnBlue);

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

    }
}