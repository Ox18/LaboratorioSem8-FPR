package com.example.fprappseman8;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class Main2Activity extends AppCompatActivity {

    private String url;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        url = getIntent().getExtras().getString("url");

        WebView myWebView = (WebView) findViewById(R.id.webView);
        myWebView.loadUrl(url);
    }
}
