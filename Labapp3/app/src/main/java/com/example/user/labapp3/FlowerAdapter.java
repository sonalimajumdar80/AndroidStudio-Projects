package com.example.user.labapp3;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 15-11-2017.
 */

public class FlowerAdapter extends BaseAdapter{

    Context mContext;

    List<String> mFlowers;

    public FlowerAdapter(Context mXontext, List<String> mFlowers) {
        this.mContext = mContext;
        this.mFlowers = mFlowers;
    }

    @Override
    public int getCount() {
        mFlowers.size();
        return 0;
    }

    @Override
    public Object getItem(int position) {
        mFlowers.get(position);
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        TextView title= (TextView) convertView.findViewById(R.id.floweradp);
        convertView=View.inflate(mContext,R.layout.rowlayout,parent);
        mFlowers= new ArrayList<>();
        mFlowers.get(position);
        return convertView;
    }
}
