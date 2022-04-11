package com.stack.buttontextcolor;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Que2Activity extends AppCompatActivity  {

    TextView txtInfo;
    Button btnSmall,btnMedium,btnLarge;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_que2);

        txtInfo = findViewById(R.id.txtInfo);


        btnSmall = findViewById(R.id.btnSmall);
        btnMedium = findViewById(R.id.btnMedium);
        btnLarge = findViewById(R.id.btnLarge);



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

    }
}