package com.example.heartdiseasechecker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;

public class Hospitals extends AppCompatActivity {
WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hospitals);
        webView.getSettings().setBuiltInZoomControls(true);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl("https://www.mayoclinic.org/diseases-conditions/heart-disease/symptoms-causes/syc-20353118");
    }

    public void publichos(View view) {
    }

    public void privatehos(View view) {
    }
}