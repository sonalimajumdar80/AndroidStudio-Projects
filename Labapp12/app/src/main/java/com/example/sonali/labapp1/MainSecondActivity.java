package com.example.sonali.labapp1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainSecondActivity extends AppCompatActivity {

    TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_second);
        text=(TextView) findViewById(R.id.textsec);
        String value=getIntent().getStringExtra("key");
        text.setText(value);
    }
}
