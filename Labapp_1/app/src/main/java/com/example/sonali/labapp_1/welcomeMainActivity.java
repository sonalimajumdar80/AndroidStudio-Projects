package com.example.sonali.labapp_1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;//this class contains all the necessary declarations of the classes used in most of the applications
import android.os.Bundle;//this class is used so that the object of this class can provide the related data for the time
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
//untill which the app is in running phase

public class welcomeMainActivity extends AppCompatActivity {
TextView tv;
    String value;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);//this stmt passes the bundle object containing the data to the application when it is created
        setContentView(R.layout.activity_welcome_main);//contents of the Relative layout are made visible in this class so that they can be used
        tv= (TextView) findViewById(R.id.textV);
        value="welcome";
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Intent in=new Intent(welcomeMainActivity.this,MainActivity.class);
        in.putExtra("key",value);
        startActivity(in);
        //MainActivity mn=new MainActivity();

    }



}
