package com.example.sonali.labapp_1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainSecondActivity extends AppCompatActivity {
TextView textV1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_second2);
        textV1= (TextView) findViewById(R.id.tv1);
        String value=getIntent().getStringExtra("key");
        textV1.setText(value);
    }
}
