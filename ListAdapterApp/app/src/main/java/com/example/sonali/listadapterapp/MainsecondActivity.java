package com.example.sonali.listadapterapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.List;

public class MainsecondActivity extends AppCompatActivity {
FlowerAdapter fa;
    List<String > flowerlist;
    ListView list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainsecond);
        list= (ListView) findViewById(R.id.lv);
       // fa=new FlowerAdapter(MainsecondActivity.this, flowerlist);
        Intent in=getIntent();
        flowerlist=in.getParcelableExtra("key");
        fa=new FlowerAdapter(MainsecondActivity.this,flowerlist);
        list.setAdapter(fa);
    }
}
