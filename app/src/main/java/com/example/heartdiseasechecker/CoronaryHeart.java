package com.example.heartdiseasechecker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class CoronaryHeart extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coronary_heart);
    }

    public void coronary(View view) {
        startActivity(new Intent(this, WebCoronary.class));
    }
}