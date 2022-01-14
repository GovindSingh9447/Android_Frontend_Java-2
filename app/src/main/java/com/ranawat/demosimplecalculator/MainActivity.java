package com.ranawat.demosimplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        EditText etFirstN=findViewById(R.id.etFirstN);
        EditText etSecN=findViewById(R.id.etSecN);

        TextView tvans=findViewById(R.id.tvans);

        Button btn_Add=findViewById(R.id.btn_Add);
        Button btn_sub=findViewById(R.id.btn_sub);
        Button btn_mult=findViewById(R.id.btn_mult);
        Button btn_div=findViewById(R.id.btn_div);



        btn_Add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                double n1,n2,ans;
                n1=Double.parseDouble(etFirstN.getText().toString());
                n2=Double.parseDouble(etSecN.getText().toString());


                ans=(n1+n2);

                tvans.setText("Addition "+ans);



            }
        });

        btn_sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                double n1,n2,ans;
                n1=Double.parseDouble(etFirstN.getText().toString());
                n2=Double.parseDouble(etSecN.getText().toString());



                ans=(n1-n2);

                tvans.setText("Substraction "+ans);


            }
        });

        btn_mult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double n1,n2,ans;
                n1=Double.parseDouble(etFirstN.getText().toString());
                n2=Double.parseDouble(etSecN.getText().toString());



                ans=(n1*n2);

                tvans.setText("Multiplication "+ans);
            }
        });

        btn_div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double n1,n2,ans;
                n1=Double.parseDouble(etFirstN.getText().toString());
                n2=Double.parseDouble(etSecN.getText().toString());



                ans=(n1/n2);

                tvans.setText("Division "+ans);
            }
        });





    }

}