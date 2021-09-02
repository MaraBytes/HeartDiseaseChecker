package com.example.heartdiseasechecker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class NextActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);
    }

    public void hospitals(View view) {
        startActivity(new Intent(this, Hospitals.class));
    }

    public void search(View view) {
        startActivity(new Intent(this, Home.class));
    }

    public void symptoms(View view) {
        startActivity(new Intent(this, Symptoms.class));
    }

    public void treatment(View view) {
        startActivity(new Intent(this, Treatement.class));
    }
}