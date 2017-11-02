package com.mwolfinspace.pascalbook;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.webkit.WebView;

import static com.mwolfinspace.pascalbook.R.string.th;
import static com.mwolfinspace.pascalbook.R.string.thanh;
import static com.mwolfinspace.pascalbook.R.string.trac_nghiem;
import static com.mwolfinspace.pascalbook.R.string.vd;

public class LoadContent extends AppCompatActivity {

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                onBackPressed();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_load_content);
        //Them mui ten Back tren thanh cong cu
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //Thay doi ten goi thanh tieu de
        String loaiNoiDung = ((storeVar) this.getApplication()).getSelectedContent();
        switch (loaiNoiDung){
            case "1":
                getSupportActionBar().setTitle(th);
                break;
            case "2":
                getSupportActionBar().setTitle(vd);
                break;
            case "3":
                getSupportActionBar().setTitle(thanh);
                break;
            case "4":
                getSupportActionBar().setTitle(trac_nghiem);
                break;
        }

        try {
            WebView mWebView;
            mWebView = (WebView) findViewById(R.id.webcontent);
            mWebView.getSettings().setJavaScriptEnabled(true);
            mWebView.loadUrl("file:///android_asset/0.htm");
            //TODO: Xem lại hiển thị của website. Ưu tiên website hợp thiết bị mobile.
        } catch (Exception e) {

            this.finish();
        }
    }
}
