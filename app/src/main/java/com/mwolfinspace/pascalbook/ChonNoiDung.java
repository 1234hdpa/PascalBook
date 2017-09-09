package com.mwolfinspace.pascalbook;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

import static com.mwolfinspace.pascalbook.R.string.gtch0;
import static com.mwolfinspace.pascalbook.R.string.gtch1;
import static com.mwolfinspace.pascalbook.R.string.gtch2;
import static com.mwolfinspace.pascalbook.R.string.gtch3;
import static com.mwolfinspace.pascalbook.R.string.gtch4;
import static com.mwolfinspace.pascalbook.R.string.gtch5;
import static com.mwolfinspace.pascalbook.R.string.gtch6;
import static com.mwolfinspace.pascalbook.R.string.tdch0;
import static com.mwolfinspace.pascalbook.R.string.tdch1;
import static com.mwolfinspace.pascalbook.R.string.tdch2;
import static com.mwolfinspace.pascalbook.R.string.tdch3;
import static com.mwolfinspace.pascalbook.R.string.tdch4;
import static com.mwolfinspace.pascalbook.R.string.tdch5;
import static com.mwolfinspace.pascalbook.R.string.tdch6;

public class ChonNoiDung extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chon_noi_dung);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        String bai = ((storeVar) this.getApplication()).getSelected();
        TextView change_name = (TextView) findViewById(R.id.tenchude);
        TextView change_info = (TextView) findViewById(R.id.gioithieu);
        switch (bai) {
            case "b0":
                change_name.setText(tdch0);
                change_info.setText(gtch0);
                getSupportActionBar().setTitle(tdch0);
                break;
            case "b1":
                change_name.setText(tdch1);
                change_info.setText(gtch1);
                getSupportActionBar().setTitle(tdch1);
                break;
            case "b2":
                change_name.setText(tdch2);
                change_info.setText(gtch2);
                getSupportActionBar().setTitle(tdch2);
                break;
            case "b3":
                change_name.setText(tdch3);
                change_info.setText(gtch3);
                getSupportActionBar().setTitle(tdch3);
                break;
            case "b4":
                change_name.setText(tdch4);
                change_info.setText(gtch4);
                getSupportActionBar().setTitle(tdch4);
                break;
            case "b5":
                change_name.setText(tdch5);
                change_info.setText(gtch5);
                getSupportActionBar().setTitle(tdch5);
                break;
            case "b6":
                change_name.setText(tdch6);
                change_info.setText(gtch6);
                getSupportActionBar().setTitle(tdch6);
                break;
        }
    }


    public void buttonPress(View v) {
        Intent intent_0 = new Intent(ChonNoiDung.this, LoadContent.class);
        //TODO: Tuỳ chĩnh nút theo nội dung
        switch (v.getId()) {
            case R.id.timhieubutton:
                startActivity(intent_0);
                break;
            case R.id.vidubutton:
                startActivity(intent_0);
                break;
            case R.id.thuchanhbutton:
                startActivity(intent_0);
                break;
            case R.id.tracnghiembutton:
                startActivity(intent_0);
                break;
        }
    }

}
