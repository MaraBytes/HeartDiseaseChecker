package com.example.heartdiseasechecker;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class
MainActivity extends AppCompatActivity {
        private EditText editEmail, editPass;
        private FirebaseAuth fbAuth;
        private TextView loginTx, signupTx;

        private ProgressBar progressBar;
    @Override
    protected void onStart() {
        super.onStart();
        if(fbAuth.getCurrentUser() != null) {
            //Start HomeActivity
            finish();
            startActivity(new Intent(this, NextActivity.class));
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editEmail = findViewById(R.id.email);
        editPass = findViewById(R.id.passkey);
        fbAuth = FirebaseAuth.getInstance();

        editEmail = findViewById(R.id.email);
        editPass = findViewById(R.id.passkey);
        loginTx = findViewById(R.id.logIn);
        signupTx = findViewById(R.id.signUp);

        progressBar = findViewById(R.id.progress_bar_login);
        progressBar.setVisibility(View.INVISIBLE);

        getSupportActionBar().hide();

        signupTx.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent homeIntent = new Intent(MainActivity.this, RegisterUser.class);
                startActivity(homeIntent);
            }
        });

        loginTx.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                userLogin();
            }
        });
    }

    void userLogin() {
        String email = editEmail.getText().toString().trim();
        String pass = editPass.getText().toString().trim();

        if(email.isEmpty() || pass.isEmpty()) {
            Toast.makeText(this, "Please enter both Email and Password.", Toast.LENGTH_SHORT).show();
            return;
        }

        progressBar.setVisibility(View.VISIBLE);
        fbAuth.signInWithEmailAndPassword(email, pass)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if(task.isSuccessful()) {
                            //Start HomeActivity
                            finish();
                            startActivity(new Intent(MainActivity.this, NextActivity.class));
                        } else {
                            Toast.makeText(getApplicationContext(), "Failed! Please Try Again.", Toast.LENGTH_SHORT).show();
                            progressBar.setVisibility(View.INVISIBLE);
                        }
                    }
                });
    }

    public void Home(View view) {
        Intent intent=new Intent(this, NextActivity.class);
        startActivity(intent);
    }
}