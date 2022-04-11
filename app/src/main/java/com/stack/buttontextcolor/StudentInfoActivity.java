package com.stack.buttontextcolor;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class StudentInfoActivity extends AppCompatActivity  {

    TextView txtFullname,txtPhoneNo,txtEducation,txtAge;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_info);

        Intent intent = getIntent();
        String fullname = intent.getStringExtra("fullname");
        String education = intent.getStringExtra("education");
        String age = intent.getStringExtra("age");
        String phoneNo = intent.getStringExtra("phone");

        txtFullname = findViewById(R.id.txtFullname);
        txtEducation = findViewById(R.id.txtEducation);
        txtPhoneNo = findViewById(R.id.txtPhoneNo);
        txtAge = findViewById(R.id.txtAge);
        txtFullname.setText(fullname);
        txtPhoneNo.setText(phoneNo);
        txtAge.setText(age);
        txtEducation.setText(education);

    }
}