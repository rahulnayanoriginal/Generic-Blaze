package com.example.parasajmera.genericfire;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
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

import javax.annotation.Nonnull;

public class Login2 extends AppCompatActivity implements View.OnClickListener {
   private Button button3;
    private EditText editText;
    private EditText editText2;
    private FirebaseAuth firebaseAuth;

    private ProgressDialog progressDialog;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login2);

        firebaseAuth = FirebaseAuth.getInstance();
        if(firebaseAuth.getCurrentUser() != null)
        {
                startActivity(new Intent(getApplicationContext(),Welcomepage.class));
                finish();
        }
        editText =(EditText) findViewById(R.id.editText);
        editText2= (EditText) findViewById(R.id.editText2);
        button3 = (Button) findViewById(R.id.button3);
        progressDialog = new ProgressDialog(this);

        button3.setOnClickListener(this);
    }

    private  void userlogin() {
        String Email = editText.getText().toString().trim();
        String Password = editText2.getText().toString().trim();
        if (TextUtils.isEmpty(Email)) {
            Toast.makeText(this, "Please Enter Your Email Address", Toast.LENGTH_SHORT).show();
            return;

        }
        if (TextUtils.isEmpty(Password)) {
            Toast.makeText(this, "Please Enter Your Password", Toast.LENGTH_SHORT).show();
            return;
        }
        progressDialog.setMessage("Login user.....");
        progressDialog.show();
        firebaseAuth.signInWithEmailAndPassword(Email, Password)
                .addOnCompleteListener(this,new OnCompleteListener<AuthResult>(){
            @Override
            public void onComplete(@Nonnull Task<AuthResult> task){
                progressDialog.dismiss();
                if (task.isSuccessful()){
                    finish();
                    startActivity(new Intent(getApplicationContext(),Welcomepage.class));

                }
            }
        });
    }

    @Override
    public void onClick(View view) {
        if (view == button3){
            userlogin();
            finish();
            startActivity(new Intent(getApplicationContext(),Welcomepage.class));
        }


    }
}
