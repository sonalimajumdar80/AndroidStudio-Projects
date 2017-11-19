package com.example.sonali.listadapterapp;

import android.content.Intent;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView list;
    FlowerAdapter fa;
    List<String> flowerlist;
    String[] flowers= new String[]{"jasmine", "lotus","rose","marigold", "lily","lavender"};
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        flowerlist=new ArrayList<>();

        list= (ListView) findViewById(R.id.lv);
        btn= (Button) findViewById(R.id.btn);
        for(String f:flowers){
           flowerlist.add(f);
        }
        fa=new FlowerAdapter(MainActivity.this,flowerlist);
        list.setAdapter(fa);
       /* Intent in=new Intent(MainActivity.this,MainsecondActivity.class);
        in.putExtra("key", (Parcelable) flowerlist);
        startActivity(in);*/




    }
}
