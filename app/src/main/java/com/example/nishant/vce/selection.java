package com.example.nishant.vce;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;


public class selection extends AppCompatActivity  {

    private RadioButton a,b;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selection);


        a = (RadioButton) findViewById(R.id.radioButton);
        b = (RadioButton) findViewById(R.id.radioButton2);


        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(selection.this, section_a.class);
                startActivity(it);
            }
        });

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(selection.this, sectionB.class);
                startActivity(in);
            }
        });


    }
}

