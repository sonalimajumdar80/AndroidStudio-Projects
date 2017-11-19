package com.example.sonali.labapp_1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView tv;
    Button btn;
    EditText et;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);//this stmt passes the bundle object containing the data to the application when it is created
        setContentView(R.layout.activity_welcome_main);//contents of the Relative layout are made visible in this class so that they can be used
        tv= (TextView) findViewById(R.id.textView);
        btn= (Button) findViewById(R.id.button);
        et= (EditText) findViewById(R.id.editText);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String val=getIntent().getStringExtra("key");
                String value=et.getText().toString();
                val=value;
                et.setText(R.string.resetString);
                Toast.makeText(MainActivity.this, val, Toast.LENGTH_SHORT).show();
               // Intent inte=getIntent();
                Intent inte=new Intent(MainActivity.this,MainSecondActivity.class);

                inte.putExtra("key1",val);
                startActivity(inte);
            }
        });
    }
}
