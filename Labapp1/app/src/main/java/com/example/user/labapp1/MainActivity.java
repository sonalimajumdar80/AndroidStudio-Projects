package com.example.sonali.labapp1

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    Button btn;
    EditText et;
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn=(Button) findViewById(R.id.btn);
        et=(EditText) findViewById(R.id.editt);
        tv=(TextView)findViewById(R.id.text);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value=et.getText().toString();
                et.setText("hello");
                Toast.makeText(MainActivity.this, "hi", Toast.LENGTH_SHORT).show();
                Intent inte=new Intent(MainActivity.this,MainsecondActivity.class);

                inte.putExtra("key",value);
                startActivity(inte);
            }
        });
    }
}
