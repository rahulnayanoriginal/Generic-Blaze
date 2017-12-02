package com.example.parasajmera.genericfire;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Loginpage extends AppCompatActivity implements View.OnClickListener{
Button button,button2,guest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginpage);
        guest=(Button)findViewById(R.id.guest);
        guest.setOnClickListener(this);
        button=(Button)findViewById(R.id.button);
        button.setOnClickListener(this);
        button2=(Button)findViewById(R.id.button2);
        button2.setOnClickListener(this);


    }



    @Override
    public void onClick(View view) {
        if (view==guest){
            startActivity(new Intent(getApplicationContext(),Welcomepage.class));
        }
        if (view==button){
            startActivity(new Intent(getApplicationContext(),Login2.class));
        }
        if (view==button2){
            startActivity(new Intent(getApplicationContext(),Register.class));
        }



    }
}
