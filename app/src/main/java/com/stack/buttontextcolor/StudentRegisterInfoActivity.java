package com.stack.buttontextcolor;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class StudentRegisterInfoActivity extends AppCompatActivity  {

    TextView txtFullname,txtPhoneNo,txtAddress,txtAge,txtCity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_register_info);

        Intent intent = getIntent();
        String fullname = intent.getStringExtra("fullname");
        String address = intent.getStringExtra("address");
        String city = intent.getStringExtra("city");
        String age = intent.getStringExtra("age");
        String phoneNo = intent.getStringExtra("phone");

        txtFullname = findViewById(R.id.txtFullname);
        txtPhoneNo = findViewById(R.id.txtPhoneNo);
        txtCity = findViewById(R.id.txtCity);
        txtAddress = findViewById(R.id.txtAddress);
        txtAge = findViewById(R.id.txtAge);

        txtFullname.setText(fullname);
        txtPhoneNo.setText(phoneNo);
        txtAge.setText(age);
        txtAddress.setText(address);
        txtCity.setText(city);

    }
}