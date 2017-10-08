package com.example.nishant.vce;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class messages extends AppCompatActivity {

    //public final static String MESSAGE_KEY = "com.example.nishant.vce.message_key";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Intent i9 = getIntent();
        //String message = i9.getStringExtra(MESSAGE_KEY);
        //TextView tv = new TextView(this);
        //tv.setTextSize(45);
        //tv.setText(message);
        //setContentView(tv);
        setContentView(R.layout.activity_messages);
    }
}
