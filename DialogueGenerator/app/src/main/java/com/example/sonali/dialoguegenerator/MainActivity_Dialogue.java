package com.example.sonali.dialoguegenerator;

import android.app.Application;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;



public class MainActivity_Dialogue extends AppCompatActivity {





    ImageButton imgbtn;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_dialogue);

        imgbtn= (ImageButton) findViewById(R.id.ThumbsUp);
        imgbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder alert=new AlertDialog.Builder(MainActivity_Dialogue.this);
                alert.setTitle("Demo ALERT:");
                alert.setMessage("Keep It Up !!");
                alert.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                        Toast.makeText(MainActivity_Dialogue.this,"interface for demo dialogue experience",Toast.LENGTH_SHORT).show();
                    }
                });
                alert.show();
            }
        });
    }
}
