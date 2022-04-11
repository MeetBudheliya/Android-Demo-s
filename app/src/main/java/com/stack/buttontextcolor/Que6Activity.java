package com.stack.buttontextcolor;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Que6Activity extends AppCompatActivity  {

    TextView txtInfo;
    EditText etFullName,etAge,etEducation,etPhone;
    Button btnSubmit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_que6);

        txtInfo = findViewById(R.id.txtInfo);

        btnSubmit = findViewById(R.id.btnSubmit);
        etFullName = findViewById(R.id.etFullName);
        etPhone = findViewById(R.id.etPhone);
        etEducation = findViewById(R.id.etEducation);
        etAge = findViewById(R.id.etAge);


        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String fname = etFullName.getText().toString();
                String age = etAge.getText().toString();
                String education = etEducation.getText().toString();
                String phone = etPhone.getText().toString();
                Intent intent = new Intent(Que6Activity.this, StudentInfoActivity.class);
                intent.putExtra("fullname",fname);
                intent.putExtra("age",age);
                intent.putExtra("education",education);
                intent.putExtra("phone",phone);
                startActivity(intent);
            }
        });
    }
}