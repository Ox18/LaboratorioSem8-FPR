package com.example.fprappseman8;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        WebView myWebView = (WebView) findViewById(R.id.webView);
        myWebView.loadUrl("https://www.google.com/");
    }
}
