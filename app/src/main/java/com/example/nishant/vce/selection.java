package com.example.nishant.vce;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

<<<<<<< HEAD
public class selection extends AppCompatActivity  {

    private TextView select,branch;
    private RadioButton a,b;
    Button next;
=======
public class selection extends AppCompatActivity {

    private TextView select, branch;
    private RadioButton a, b;
>>>>>>> 46609be54e9dbafd477192571cca4ff47b78bd4c


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selection);


<<<<<<< HEAD
        select= (TextView)findViewById(R.id.textView3);
        branch= (TextView)findViewById(R.id.textView4);
        a= (RadioButton)findViewById(R.id.radioButton);
        b= (RadioButton)findViewById(R.id.radioButton2);
        next= (Button)findViewById(R.id.button3);

       next.setOnClickListener(new View.OnClickListener() {
          @Override
            public void onClick(View view) {
              //if(view==a) {

                  Intent i4 = new Intent(selection.this, sectionA.class);
                  startActivity(i4);
              //}
            }
        });

    }

    //@Override
    //public void onClick(View v) {

      //  if (v==a){

        //    Intent i = new Intent(selection.this,sectionA.class);
          //  startActivity(i);
        //}
=======
        select = (TextView) findViewById(R.id.textView3);
        //branch = (TextView) findViewById(R.id.textView4);
        a = (RadioButton) findViewById(R.id.radioButton);
        b = (RadioButton) findViewById(R.id.radioButton2);

        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(selection.this, sectionA.class);
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
>>>>>>> 46609be54e9dbafd477192571cca4ff47b78bd4c

    //}
}

