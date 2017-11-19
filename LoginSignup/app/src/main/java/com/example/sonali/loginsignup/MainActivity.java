package com.example.sonali.loginsignup;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {
    private EditText medittext6,medittext7,medittext8,medittext9;
    private Button mbutton;


@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    medittext6 = (EditText) findViewById(R.id.hello6);
    medittext7 = (EditText) findViewById(R.id.hello7);
    medittext8 = (EditText) findViewById(R.id.hello8);
    medittext9 = (EditText) findViewById(R.id.hello9);
    mbutton =(Button) findViewById(R.id.btn1);
    mbutton.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
          medittext6.getText().toString();
            medittext7.getText().toString();
            medittext8.getText().toString();
            medittext9.getText().toString();



          {



        }
    }






    }
}
