package com.example.nishant.vce;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import static com.example.nishant.vce.R.id.textView;

public class Dashboard extends AppCompatActivity implements View.OnClickListener{

    private Button button;
    private FirebaseAuth firebaseAuth;
    private TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        firebaseAuth= FirebaseAuth.getInstance();
        button = (Button) findViewById(R.id.button);
        text= (TextView) findViewById(R.id.textView2);
        button.setOnClickListener(this);

        FirebaseUser user = firebaseAuth.getCurrentUser();

        text.setText("Hey!"+ user.getEmail());

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
