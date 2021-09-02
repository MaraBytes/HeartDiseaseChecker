package com.example.heartdiseasechecker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;

public class Symptoms extends AppCompatActivity {
WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_symptoms);
        webView=findViewById(R.id.symptomswebview);
        webView.getSettings().setBuiltInZoomControls(true);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl("https://www.mayoclinic.org/diseases-conditions/heart-disease/symptoms-causes/syc-20353118");
    }
}