package com.example.nishant.vce;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.auth.FirebaseAuth;

public class FacultyMain extends AppCompatActivity implements View.OnClickListener {

   // EditText message_text;
    //public final static String MESSAGE_KEY = "com.example.nishant.vce.message_key";

    private Button l;
    private FirebaseAuth firebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faculty_main);

        l = (Button) findViewById(R.id.button7);
        firebaseAuth = FirebaseAuth.getInstance();

        l.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        logout();

    }

    public void logout(){

        firebaseAuth.signOut();
        finish();

        Intent intent = new Intent(FacultyMain.this,faculty_login.class);
        startActivity(intent);
    }

    //public void sendMessage(View view){

        //message_text= (EditText) findViewById(R.id.editTextMessage);
        //String message = message_text.getText().toString();
        //Intent i9 = new Intent(FacultyMain.this,messages.class);
        //i9.putExtra(MESSAGE_KEY,message);
        //startActivity(i9);
    //}
}
