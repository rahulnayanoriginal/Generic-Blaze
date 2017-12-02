package com.example.parasajmera.genericfire;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.google.firebase.auth.FirebaseAuth;

public class Welcomepage extends AppCompatActivity {
    Button button10;
    private FirebaseAuth firebaseAuth;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcomepage);
        button10 = (Button) findViewById(R.id.button10);
        //   addListenerOnButton();

        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button10.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {

                        Intent in = new Intent(Welcomepage.this, Fiver.class);
                        startActivity(in);
                    }
                });
            }


//    public void addListenerOnButton() {
//        final Context context = this;
//        button10 = (Button) findViewById(R.id.button10);
//        button10.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View arg0) {
//
//                Intent intent = new Intent(Welcomepage.this, Fiver.class);
//                startActivity(intent);
//            }
//
//
        });
    }
}

//}
