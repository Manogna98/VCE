package com.example.nishant.vce;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class sectionA extends AppCompatActivity {

    FloatingActionButton logout;


    public void init(){

        logout= (FloatingActionButton)findViewById(R.id.floatingActionButton);

        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i5= new Intent(sectionA.this, Dashboard.class);
                startActivity(i5);
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_section);
        init();
    }
}
