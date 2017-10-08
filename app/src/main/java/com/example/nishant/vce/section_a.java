
package com.example.nishant.vce;

        import android.content.Intent;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.text.Selection;
        import android.view.View;
        import android.widget.Button;
        import android.widget.EditText;
        import android.widget.TextView;
        import android.widget.Toast;

        import com.google.firebase.auth.FirebaseAuth;
        import com.google.firebase.auth.FirebaseUser;



public class section_a extends AppCompatActivity implements View.OnClickListener{

    private Button button,b,message;
    private FirebaseAuth firebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_section_a);

        firebaseAuth= FirebaseAuth.getInstance();
        button = (Button) findViewById(R.id.button3);
        b = (Button) findViewById(R.id.button5);
        message = (Button) findViewById(R.id.button6);

        message.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i8 = new Intent(section_a.this,messages.class);
                startActivity(i8);
            }
        });


        button.setOnClickListener(this);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(section_a.this, Web.class);
                startActivity(i);
            }
        });

    }

    private void logout(){

        firebaseAuth.signOut();
        finish();

        Intent i= new Intent(section_a.this,NextActivity.class);
        startActivity(i);


        Toast.makeText(section_a.this,"Logged out",Toast.LENGTH_LONG).show();

    }

    @Override
    public void onClick(View view) {
        logout();


    }
}

