package com.example.nishant.vce;


        import android.app.ProgressDialog;
        import android.content.Intent;
        import android.support.annotation.NonNull;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.text.Selection;
        import android.text.TextUtils;
        import android.view.View;
        import android.widget.Button;
        import android.widget.EditText;
        import android.widget.Toast;

        import com.google.android.gms.tasks.OnCompleteListener;
        import com.google.android.gms.tasks.Task;
        import com.google.firebase.auth.AuthResult;
        import com.google.firebase.auth.FirebaseAuth;

public class NextActivity extends AppCompatActivity implements View.OnClickListener {

    //defining view objects
    private EditText editTextEmail;
    private EditText editTextPassword;
    private Button button;
    private ProgressDialog progressDialog;


    //defining firebase authentication object
    private FirebaseAuth firebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);

        //initializing firebase authentication object
        firebaseAuth = FirebaseAuth.getInstance();

        //initializing views
        editTextEmail = (EditText) findViewById(R.id.editTextEmail);
        editTextPassword = (EditText) findViewById(R.id.editTextPassword);
        button = (Button) findViewById(R.id.button);

        progressDialog = new ProgressDialog(this);

        button.setOnClickListener(this);

        if(firebaseAuth.getCurrentUser() != null){
            //close this activity
            finish();
            //opening profile activity
            startActivity(new Intent(getApplicationContext(),selection.class));
        }

    }
    @Override
    public void onClick(View view) {

        login();
    }
    private void login(){


        String email = editTextEmail.getText().toString().trim();
        String password  = editTextPassword.getText().toString().trim();

        //checking if email and passwords are empty
        if(TextUtils.isEmpty(email)){
            Toast.makeText(this,"Please enter email",Toast.LENGTH_LONG).show();
            return;
        }

        if(TextUtils.isEmpty(password)){
            Toast.makeText(this,"Please enter password",Toast.LENGTH_LONG).show();
            return;
        }


        //displaying that progress dialog

        progressDialog.setMessage("Please wait");
        progressDialog.show();

        //registering a new user
        firebaseAuth.signInWithEmailAndPassword(email,password)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        //checking if success
                        if(task.isSuccessful()){
                            //display some message here
                            finish();
                            Toast.makeText(NextActivity.this,"Successfully Logged in",Toast.LENGTH_SHORT).show();
                            Intent i = new Intent(NextActivity.this,selection.class);
                            startActivity(i);
                        }else{
                            //display some message here
                            Toast.makeText(NextActivity.this,"Please try again",Toast.LENGTH_LONG).show();

                        }
                        progressDialog.dismiss();
                    }
                });


    }


}