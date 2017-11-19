package com.example.user.labapp2;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainsecondActivity extends AppCompatActivity {
TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainsecond);
        tv=(TextView)findViewById(R.id.textview);
        String value=getIntent().getStringExtra("key");
        tv.setText(value);

        AlertDialog.Builder alert=new AlertDialog.Builder(MainsecondActivity.this);
        alert.setTitle("hello");
        alert.setMessage(value);
        alert.setPositiveButton("ok",);


    }
}
