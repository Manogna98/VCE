package com.example.nishant.vce;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class FacultyMain extends AppCompatActivity implements View.OnClickListener {

   // EditText message_text;
    //public final static String MESSAGE_KEY = "com.example.nishant.vce.message_key";

    private Button l;
    private FirebaseAuth firebaseAuth;
    EditText message;
    Button send;

    private DatabaseReference mDatabase;
    private FirebaseAuth mAuth;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faculty_main);
        mDatabase = FirebaseDatabase.getInstance().getReference();
        mAuth = FirebaseAuth.getInstance();

        l = (Button) findViewById(R.id.button7);
        firebaseAuth = FirebaseAuth.getInstance();

        l.setOnClickListener(this);
        message = (EditText)findViewById(R.id.editTextMessage);
        send = (Button) findViewById(R.id.enter);
        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String userid = mAuth.getCurrentUser().getUid();
                String mess = message.getText().toString().trim();
                User user = new User();
                user.setMessage(mess);

                mDatabase.push().setValue(user);

                Toast.makeText(FacultyMain.this,"message is sent successfully",
                        Toast.LENGTH_SHORT).show();
                finish();

            }
        });


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
