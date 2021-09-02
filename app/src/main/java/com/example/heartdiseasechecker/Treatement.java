package com.example.heartdiseasechecker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class Treatement extends AppCompatActivity {
WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_treatement);
        webView=findViewById(R.id.treatmentwebview);
        webView.getSettings().setBuiltInZoomControls(true);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl("https://www.webmd.com/heart-disease/guide/heart-disease-treatment-care");
    }
}