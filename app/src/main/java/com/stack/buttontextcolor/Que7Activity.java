package com.stack.buttontextcolor;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Que7Activity extends AppCompatActivity  {

    TextView txtInfo;
    EditText etFullName,etAge,etAddresss,etPhone,etCity;
    Button btnSubmit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_que7);

        txtInfo = findViewById(R.id.txtInfo);

        btnSubmit = findViewById(R.id.btnSubmit);
        etFullName = findViewById(R.id.etFullName);
        etPhone = findViewById(R.id.etPhone);
        etAddresss = findViewById(R.id.etAddress);
        etCity = findViewById(R.id.etCity);
        etAge = findViewById(R.id.etAge);


        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String fname = etFullName.getText().toString();
                String age = etAge.getText().toString();
                String address = etAddresss.getText().toString();
                String phone = etPhone.getText().toString();
                String city = etCity.getText().toString();

                Intent intent = new Intent(Que7Activity.this, StudentRegisterInfoActivity.class);
                intent.putExtra("fullname",fname);
                intent.putExtra("age",age);
                intent.putExtra("address",address);
                intent.putExtra("city",city);
                intent.putExtra("phone",phone);
                startActivity(intent);
            }
        });
    }
}