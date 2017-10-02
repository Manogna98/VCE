package com.example.nishant.vce;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;

public class Dashboard extends AppCompatActivity implements View.OnClickListener{

    private Button button;
    private FirebaseAuth firebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        firebaseAuth= FirebaseAuth.getInstance();
        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(this);

    }

    private void logout(){

        firebaseAuth.signOut();
        finish();
        Intent i= new Intent(Dashboard.this,NextActivity.class);
        startActivity(i);

        Toast.makeText(Dashboard.this,"Logged out",Toast.LENGTH_LONG).show();

    }

    @Override
    public void onClick(View v) {

        logout();



    }
}
