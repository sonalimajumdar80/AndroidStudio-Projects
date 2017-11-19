package com.example.sonali.torchapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.CompoundButton;
import android.widget.ToggleButton;
import android.hardware.Camera;

import static android.hardware.Camera.*;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    ToggleButton toggleButton;

    Camera camera;
    Camera.Parameters param;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toggleButton = (ToggleButton) findViewById(R.id.onOffFlashlight);

        toggleButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean checked) {
                if (checked) {

                    //ToDo something
                    //camera = open();
                     param = camera.getParameters();
                    param.setFlashMode(Camera.Parameters.FLASH_MODE_TORCH);
                    camera.setParameters(param);

                    camera.startPreview();

                } else {

                    //ToDo something
                   // camera = open();

                    Camera.Parameters param = camera.getParameters();
                    param.setFlashMode(Camera.Parameters.FLASH_MODE_OFF);
                    camera.setParameters(param);
                    camera.stopPreview();
                    camera.release();
                }
            }
        });




    }
}
