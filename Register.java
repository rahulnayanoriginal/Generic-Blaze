package com.example.parasajmera.genericfire;

import android.app.ProgressDialog;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class Register extends AppCompatActivity implements View.OnClickListener {
    private EditText edittext3;
    private EditText edittext4;
    private EditText edittext5;
    private EditText edittext6;
    private EditText edittext7;
    private Button button5;
    private ProgressDialog progressDialog;
    private FirebaseAuth firebaseAuth;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        progressDialog = new ProgressDialog(this);
        firebaseAuth = FirebaseAuth.getInstance();
        if (firebaseAuth.getCurrentUser() != null){
            finish();
            startActivity(new Intent(getApplicationContext(),Welcomepage.class));


        }

        button5 = (Button) findViewById(R.id.button5);
        edittext3= (EditText) findViewById(R.id.edittext3);
        edittext4=(EditText)findViewById(R.id.edittext4);
        edittext5=(EditText)findViewById(R.id.edittext5);
        edittext6=(EditText)findViewById(R.id.edittext6);
        edittext7=(EditText)findViewById(R.id.edittext7);


        button5.setOnClickListener(this);
    }
    private void registerUser(){
        String FirstName = edittext3.getText().toString().trim();
        String EmailAddress = edittext4.getText().toString().trim();
        String Password = edittext5.getText().toString().trim();
        String Mobile = edittext6.getText().toString().trim();
        String City = edittext7.getText().toString().trim();

        if(TextUtils.isEmpty(FirstName)){
            Toast.makeText(this, "Please Enter Your First Name",Toast.LENGTH_SHORT).show();
            return;

        }

        if(TextUtils.isEmpty(EmailAddress)){
            Toast.makeText(this, "Please Enter Your Email Address",Toast.LENGTH_SHORT).show();
            return;

        }
        if(TextUtils.isEmpty(Password)){
            Toast.makeText(this, "Please Enter Your Password",Toast.LENGTH_SHORT).show();
            return;

        }
        if(TextUtils.isEmpty(Mobile)){
            Toast.makeText(this, "Please Enter Your Mobile Number",Toast.LENGTH_SHORT).show();
            return;
        }
        if(TextUtils.isEmpty(City)){
            Toast.makeText(this, "Please Enter Your City",Toast.LENGTH_SHORT).show();
            return;

        }
        progressDialog.setMessage("Register User.....");
        progressDialog.show();

        firebaseAuth.createUserWithEmailAndPassword(EmailAddress,Password).addOnCompleteListener(this, new OnCompleteListener<AuthResult>()
        {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if (task.isSuccessful()) {
                    Toast.makeText(Register.this, "Register Successfully", Toast.LENGTH_SHORT).show();

                        finish();
                        startActivity(new Intent(getApplicationContext(),Welcomepage.class));

                } else {
                    Toast.makeText(Register.this, "Could Not Register.Please try Again", Toast.LENGTH_SHORT).show();
                }
            }

        });
    }




    @Override
    public void onClick(View view) {
        if(view == button5){
            registerUser();
            startActivity(new Intent(getApplicationContext(), Login2.class));
        }


    }

}

