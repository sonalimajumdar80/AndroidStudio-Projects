package com.example.sonali.texttospeech;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import static android.widget.Toast.LENGTH_SHORT;

public class MainActivity extends AppCompatActivity {
    private EditText medittext;
    private Button mbutton;
    private TextView mgettext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        medittext= (EditText) findViewById(R.id.hello1);
        mbutton= (Button) findViewById(R.id.btn);
        mgettext= (TextView) findViewById(R.id.hello2);

        mbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String m= medittext.getText().toString();
                if(m.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Please enter something", Toast.LENGTH_SHORT).show();
                }
                else{
                    mgettext.equals("");
                    if(m.equals("ASAP")|| m.equals("asap"))
                    mgettext.setText("as soon as possible");
                    else if (m.equals("nmit")|| m.equals("NMIT"))
                    {
                        mgettext.setText("Nitte Meenakshi Institute of Technology");
                    }
                    else if (m.equals("TTYL")|| m.equals("ttyl"))
                    {
                        mgettext.setText("Talk to you later");
                    }
                    else if (m.equals("NIIT")|| m.equals("niit"))
                    {
                        mgettext.setText("National Institute of Information Technology");
                    }
                    else if (m.equals("NIT")|| m.equals("nit"))
                    {
                        mgettext.setText("National Institute of Technology");
                    }
                    else if (m.equals("IIT")|| m.equals("iit"))
                    {
                        mgettext.setText("Indian Institute of Technology");
                    }
                    else
                    {
                        mgettext.setText("Unknown abbr. for the dictionary");
                    }
                }

            }
        });



    }
}
