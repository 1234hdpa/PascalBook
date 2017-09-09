package com.mwolfinspace.pascalbook;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class LoadContent extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_load_content);

        try {
            WebView mWebView = null;
            mWebView = (WebView) findViewById(R.id.webcontent);
            mWebView.getSettings().setJavaScriptEnabled(true);
            mWebView.loadUrl("file:///android_asset/0.htm");
            //TODO: Xem lại hiển thị của website. Ưu tiên website hợp thiết bị mobile.
        } catch (Exception e) {

            this.finish();
        }
    }
}
