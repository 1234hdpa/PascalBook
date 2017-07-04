package com.mwolfinspace.pascalbook;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Manhinhchinh extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manhinhchinh);
    }
    public void buttonPress(View v) {
        switch (v.getId()) {
            case R.id.chude0:
                Toast.makeText(getApplicationContext(), "Bạn chọn chủ đề 0", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(Manhinhchinh.this, ChonNoiDung.class);
                startActivity(intent);
                break;
            case R.id.chude1:
                Toast.makeText(getApplicationContext(), "Bạn chọn chủ đề 1", Toast.LENGTH_SHORT).show();
                break;
            case R.id.chude2:
                Toast.makeText(getApplicationContext(), "Bạn chọn chủ đề 2", Toast.LENGTH_SHORT).show();
                break;
            case R.id.chude3:
                Toast.makeText(getApplicationContext(), "Bạn chọn chủ đề 3", Toast.LENGTH_SHORT).show();
                break;
            case R.id.chude4:
                Toast.makeText(getApplicationContext(), "Bạn chọn chủ đề 4", Toast.LENGTH_SHORT).show();
                break;
            case R.id.chude5:
                Toast.makeText(getApplicationContext(), "Bạn chọn chủ đề 5", Toast.LENGTH_SHORT).show();
                break;
            case R.id.chude6:
                Toast.makeText(getApplicationContext(), "Bạn chọn chủ đề 6", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
