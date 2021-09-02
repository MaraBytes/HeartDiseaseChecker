package com.example.heartdiseasechecker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class CongenitalHeartD extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_congenital_heart_d);
    }

    public void arthritis(View view) {
        startActivity(new Intent(this, webcongenital.class));
    }
}