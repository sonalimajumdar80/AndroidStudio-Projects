package com.example.sonali.labapp1;
//intent is bridge btween two activities
//implemenmtation of intent
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainsecondActivity extends AppCompatActivity {
TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainsecond);
        text=(TextView) findViewById(R.id.textsec);
        String value=getIntent().getStringExtra("key");
        text.setText(value);
    }
}
