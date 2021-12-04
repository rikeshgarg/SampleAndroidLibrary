package com.example.toasterlibrary;

import android.app.Application;
import android.content.Context;

public class Toast extends Application {

    public void showtext(Context c, String msg) {
        android.widget.Toast.makeText(c, msg, android.widget.Toast.LENGTH_SHORT).show();

    }


}

