package com.example.nishant.vce;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;

public class selection extends AppCompatActivity implements View.OnClickListener {

    private TextView select,branch;
    private RadioButton a,b;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selection);


        select= (TextView)findViewById(R.id.textView3);
        branch= (TextView)findViewById(R.id.textView4);
        a= (RadioButton)findViewById(R.id.radioButton);
        b= (RadioButton)findViewById(R.id.radioButton2);

    }

    @Override
    public void onClick(View v) {

        if (v==a){

            Intent i = new Intent(selection.this,sectionA.class);
            startActivity(i);
        }

    }
}
