package com.dejman.deji.cryptoexchanger;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class WebviewActivity extends AppCompatActivity {

    private WebView webview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webview);

        webview = (WebView)findViewById(R.id.webview1);
        webview.getSettings().setJavaScriptEnabled(true);
        webview.loadUrl("http://www.cryptocompare.com/exchanges/#/overview");

        TrackBack();

    }



    private void TrackBack(){
        Intent goBack = new Intent(WebviewActivity.this, MainActivity.class);
        startActivity(goBack);
        finish();
    }

}


