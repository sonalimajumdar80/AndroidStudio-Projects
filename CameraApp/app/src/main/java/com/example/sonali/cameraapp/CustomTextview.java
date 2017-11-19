package com.example.sonali.cameraapp;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Created by Sonali on 16/11/2017.
 */

public class CustomTextview extends TextView {
    public CustomTextview(Context context) {
        super(context);
    }

    public CustomTextview(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public CustomTextview(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public CustomTextview(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        init();
    }

    public void init(){
        Typeface font = Typeface.createFromAsset(getContext().getAssets(),);
    }
}
