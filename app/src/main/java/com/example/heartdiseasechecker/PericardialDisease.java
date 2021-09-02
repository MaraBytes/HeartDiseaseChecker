package com.example.heartdiseasechecker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class PericardialDisease extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pericardial_disease);
    }

    public void pericardial(View view) {
        startActivity(new Intent(this,WebPericardial.class));
    }
}