package com.example.nishant.vce;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class faculty_login extends AppCompatActivity implements View.OnClickListener {

    private Button b;
    private EditText t1,t2;
    private FirebaseAuth firebaseAuth;
    private ProgressDialog progressDialog;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faculty_login);

        b = (Button) findViewById(R.id.buttonLogin);
        t1 = (EditText) findViewById(R.id.editTextEmail2);
        t2 = (EditText) findViewById(R.id.editTextPassword2);

        progressDialog = new ProgressDialog(this);

        firebaseAuth = FirebaseAuth.getInstance();

        b.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        login();

    }

    private void login(){


        String email = t1.getText().toString().trim();
        String password  = t2.getText().toString().trim();


        if(TextUtils.isEmpty(email)){
            Toast.makeText(this,"Please enter email",Toast.LENGTH_LONG).show();
            return;
        }

        if(TextUtils.isEmpty(password)){
            Toast.makeText(this,"Please enter password",Toast.LENGTH_LONG).show();
            return;
        }


        progressDialog.setMessage("Please wait");
        progressDialog.show();

        firebaseAuth.signInWithEmailAndPassword(email,password)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if(task.isSuccessful()){
                            finish();
                            Toast.makeText(faculty_login.this,"Successfully Logged in",Toast.LENGTH_SHORT).show();
                            Intent i = new Intent(faculty_login.this,FacultyMain.class);
                            startActivity(i);
                        }else{
                            Toast.makeText(faculty_login.this,"Please try again",Toast.LENGTH_LONG).show();

                        }
                        progressDialog.dismiss();
                    }
                });


    }

}
