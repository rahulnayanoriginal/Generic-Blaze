package com.example.parasajmera.genericfire;

import android.app.Application;
import android.util.StringBuilderPrinter;

import com.google.firebase.analytics.FirebaseAnalytics;

/**
 * Created by Paras ajmera on 01-09-2017.
 */

public class genericfire {


    String Email;
    String Password;
    public genericfire(){

    }


    public genericfire(String email, String password) {
        Email = email;
        Password = password;
    }

    public String getEmail() {
        return Email;
    }

    public String getPassword() {
        return Password;
    }
}

