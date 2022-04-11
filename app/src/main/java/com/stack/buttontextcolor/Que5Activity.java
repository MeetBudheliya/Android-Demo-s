package com.stack.buttontextcolor;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Que5Activity extends AppCompatActivity  {

    TextView txtSelectedItem,txtSelectedItemTotal;
    Button btnCalculate;
    CheckBox chb10,chb20,chb30,chb40,chb50,chb60,chb70,chb80,chb90,chb100;
    int totalAmount =0;
    String sekectedText="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_que5);

        txtSelectedItem = findViewById(R.id.txtSelectedItem);
        txtSelectedItemTotal = findViewById(R.id.txtSelectedItemTotal);
        chb10 = findViewById(R.id.chb10);
        chb20 = findViewById(R.id.chb20);
        chb30 = findViewById(R.id.chb30);
        chb40 = findViewById(R.id.chb40);
        chb50 = findViewById(R.id.chb50);
        chb60 = findViewById(R.id.chb60);
        chb70 = findViewById(R.id.chb70);
        chb80 = findViewById(R.id.chb80);
        chb90 = findViewById(R.id.chb90);
        chb100 = findViewById(R.id.chb100);


        btnCalculate = findViewById(R.id.btnCalculate);


        btnCalculate.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                sekectedText="";
                totalAmount=0;
                if(chb10.isChecked())
                {
                    sekectedText = chb10.getText().toString();
                    Log.e("Demo","--- "+chb10.getText().toString());
                    totalAmount = Integer.parseInt(chb10.getText().toString());
                }
                if(chb20.isChecked())
                {
                    sekectedText =sekectedText+" \n"+ chb20.getText().toString();
                    totalAmount = totalAmount+ Integer.parseInt(chb20.getText().toString());
                }
                if(chb30.isChecked())
                {
                    sekectedText =sekectedText+" \n"+ chb30.getText().toString();
                    totalAmount = totalAmount+ Integer.parseInt(chb30.getText().toString());
                }
                if(chb40.isChecked())
                {
                    sekectedText =sekectedText+" \n"+ chb40.getText().toString();
                    totalAmount = totalAmount+ Integer.parseInt(chb40.getText().toString());
                }
                if(chb50.isChecked())
                {
                    sekectedText =sekectedText+" \n"+ chb50.getText().toString();
                    totalAmount = totalAmount+ Integer.parseInt(chb50.getText().toString());
                }
                if(chb60.isChecked())
                {
                    sekectedText =sekectedText+" \n"+ chb60.getText().toString();
                    totalAmount = totalAmount+ Integer.parseInt(chb60.getText().toString());
                }
                if(chb70.isChecked())
                {
                    sekectedText =sekectedText+" \n"+ chb70.getText().toString();
                    totalAmount = totalAmount+ Integer.parseInt(chb70.getText().toString());
                }
                if(chb80.isChecked())
                {
                    sekectedText =sekectedText+" \n"+ chb80.getText().toString();
                    totalAmount = totalAmount+ Integer.parseInt(chb80.getText().toString());
                }
                if(chb90.isChecked())
                {
                    sekectedText =sekectedText+" \n"+ chb90.getText().toString();
                    totalAmount = totalAmount+ Integer.parseInt(chb90.getText().toString());
                }
                if(chb100.isChecked())
                {
                    sekectedText =sekectedText+" \n"+ chb100.getText().toString();
                    totalAmount = totalAmount+ Integer.parseInt(chb100.getText().toString());
                }
                Log.e("Demo","--***- "+totalAmount);
                txtSelectedItem.setText("Selected Item :\n"+sekectedText);
                txtSelectedItemTotal.setText("Total Amount: "+totalAmount);
            }
        });


    }
}