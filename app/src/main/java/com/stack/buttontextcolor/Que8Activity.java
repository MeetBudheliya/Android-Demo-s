package com.stack.buttontextcolor;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Que8Activity extends AppCompatActivity  {

    TextView txtInfo;
    EditText etLastName,etFirstName;
    Button btnSubmit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_que8);

        txtInfo = findViewById(R.id.txtInfo);
        etFirstName = findViewById(R.id.etFirstName);
        etLastName = findViewById(R.id.etLastName);
        btnSubmit = findViewById(R.id.btnSubmit);

        btnSubmit.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                String fname = etFirstName.getText().toString();
                String lName = etLastName.getText().toString();

                Intent intent = new Intent(Que8Activity.this, SecoundActivity.class);
                intent.putExtra("fname",fname);
                intent.putExtra("lName",lName);

                startActivity(intent);
            }
        });

    }
}