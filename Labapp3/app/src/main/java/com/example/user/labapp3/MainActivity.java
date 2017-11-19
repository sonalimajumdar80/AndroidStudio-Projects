package com.example.user.labapp3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
ListView flowerlist;
    FlowerAdapter fa;
    String flower[]={"lotus","tulip","rose","jasmine"};
    List<String> flowerlist=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        flowerlist= (List<String>) findViewById(R.id.list);
        for(String fl: flower){
            flowerlist.add(fl);
        }

        fa=new FlowerAdapter(MainActivity.this,flowerlist);
        flowerlist.setAdapter(fa);

    }
}
