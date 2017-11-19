package com.example.sonali.counterapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import static com.example.sonali.counterapp.R.*;

public class MainActivity extends AppCompatActivity {
    private EditText mEditText;
    private Button mButton;
    int counter=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mEditText= (EditText) findViewById(R.id.sonuclick);
        mButton= (Button) findViewById(R.id.sonu);

        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter++;
                mEditText.setText("Counts"+counter);
            }
        });

    }
}
