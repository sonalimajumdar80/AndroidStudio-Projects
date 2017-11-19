package com.example.sonali.sqlliteapp;

import android.database.sqlite.SQLiteDatabase;
import android.support.annotation.IntegerRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    DBHelper dbHelper;
    SQLiteDatabase db;
    EditText etname,etusn,etmail;
    Button submit,clear,display,delete;
    //ListView list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dbHelper=new DBHelper(MainActivity.this);

        etname=(EditText) findViewById(R.id.etname);
        etusn=(EditText) findViewById(R.id.etusn);
        etmail=(EditText) findViewById(R.id.etmail);
        delete= (Button) findViewById(R.id.btndlt);

        submit=(Button) findViewById(R.id.btnsubmit);
        clear=(Button) findViewById(R.id.btnclr);
        display=(Button) findViewById(R.id.btnshow);

        dbHelper.onCreate(db);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(etname.getText()!=null && etusn.getText()!=null && etmail!=null){
                    AddItem();
                }
            }
        });

        display.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dbHelper.getData();
            }
        });
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clearEntry();
            }
        });
        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dbHelper.deleteTable();
            }
        });

    }
    
    public void AddItem(){

        try {
            dbHelper.addData(db,etname.getText().toString(), Integer.parseInt(etusn.getText().toString()),etmail.getText().toString());
        } catch (InterruptedException e) {
        //    e.printStackTrace();
            //Log.d("DatabaseHelper","unsuccessful insertion");
            Toast.makeText(MainActivity.this, "Data Insertion unsuccessful", Toast.LENGTH_SHORT).show();
        }

    }

    public void clearEntry(){
        etname.setText("");
        etusn.setText("");
        etmail.setText("");

    }
}
