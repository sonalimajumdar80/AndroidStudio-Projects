package com.example.sonali.listadapterapp;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FlowerAdapter extends BaseAdapter {

   TextView textv;
    Context context;
    List<String> list;


    //ArrayList<HashMap<String,String>> arr;

FlowerAdapter(Context context,List<String> mlist){
    this.context=context;
    list=mlist;
}



    @Override
    public int getCount() {
    return list.size();
       // return 0;
    }

    @Override
    public Object getItem(int position) {
       return list.get(position);
       // return null;
    }

    @Override
    public long getItemId(int position) {

        return 0;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {

           if (convertView == null) {
                           convertView = LayoutInflater.from(context).
                                           inflate(R.layout.activity_second, parent, false);
                       }        TextView title = (TextView) convertView.findViewById(R.id.tv);
                                final Button btn1= (Button) convertView.findViewById(R.id.btn);
                   title.setText(list.get(position));
                    btn1.setText(list.get(position));
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, list.get(position), Toast.LENGTH_SHORT).show();

              // btn1.setBackgroundColor(Integer.parseInt("@color/colorPrimary"));
            }
        });
                   return convertView;


    }
}
