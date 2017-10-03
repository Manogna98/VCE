package com.example.nishant.vce;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.TextView;

public class selection extends AppCompatActivity {

    TextView select,branch;
    RadioButton a,b;

    public void init(){

        select= (TextView)findViewById(R.id.textView3);
        branch= (TextView)findViewById(R.id.textView4);
        a= (RadioButton)findViewById(R.id.radioButton);
        b= (RadioButton)findViewById(R.id.radioButton2);



    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selection);
        init();

    }
}
