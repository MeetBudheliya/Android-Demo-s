package com.stack.buttontextcolor;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SecoundActivity extends AppCompatActivity  {

    TextView txtInfo,txtFullName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secound);

        Intent intent = getIntent();
        String fname = intent.getStringExtra("fname");
        String lname = intent.getStringExtra("lname");

        txtInfo = findViewById(R.id.txtInfo);
        txtFullName = findViewById(R.id.txtFullName);

        txtFullName.setText( fname+" "+lname);
    }
}