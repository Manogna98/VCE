package com.example.nishant.vce;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;

import java.net.URI;


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

                //String url = "https://www.google.se/?gfe_rd=cr&dcr=0&ei=awfUWZbqH86q8we9q5bACg&gws_rd=ssl";
               // Intent in = new Intent(selection.this, Dashboard.class);
               // Intent in = new Intent(Intent.ACTION_VIEW);
               // in.setData(Uri.parse(url));

                Intent in = new Intent(selection.this,sectionB.class);
                startActivity(in);
            }
        });

    }
}

