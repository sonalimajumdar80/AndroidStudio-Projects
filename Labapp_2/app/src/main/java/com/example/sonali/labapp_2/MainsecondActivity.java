package com.example.sonali.labapp_2;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainsecondActivity extends AppCompatActivity {

    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainsecond);
        tv = (TextView) findViewById(R.id.textview);
        String value = getIntent().getStringExtra("key");
        tv.setText(value);

       /* AlertDialog.Builder alert = new AlertDialog.Builder(MainsecondActivity.this);
        alert.setTitle("hello");
        alert.setMessage(value);
        alert.setPositiveButton("ok", );*/


    }

        public void onClickShowAlert(View view) {
            AlertDialog.Builder myAlertBuilder=new AlertDialog.Builder(MainsecondActivity.this);
            myAlertBuilder.setTitle(R.string.alert_title);  
            myAlertBuilder.setMessage(R.string.alert_message);
            myAlertBuilder.setPositiveButton(R.string.ok, new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    MainsecondActivity.this.finish();
                }
            });
            myAlertBuilder.setNegativeButton(R.string.cancel, new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    dialog.cancel();
                }
            });
            AlertDialog alert=myAlertBuilder.create();
            alert.show();
        }




}
