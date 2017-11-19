package com.example.sonali.labapp_2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater menuinflator=getMenuInflater();
        menuinflator.inflate(R.menu.mainmenu,menu);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        String value;
        Intent inte;
        switch(item.getItemId()){
            case R.id.item1:
                Toast.makeText(this, "item 1", Toast.LENGTH_SHORT).show();
                inte=new Intent(MainActivity.this,MainsecondActivity.class);
                value=item.toString();
                inte.putExtra("key",value);
                startActivity(inte);
                break;
            case R.id.item2: Toast.makeText(this, "item 2", Toast.LENGTH_SHORT).show();
                inte=new Intent(MainActivity.this,MainsecondActivity.class);
                value=item.toString();
                inte.putExtra("key",value);
                startActivity(inte);
                break;
            case R.id.item3: Toast.makeText(this, "item 3", Toast.LENGTH_SHORT).show();
                inte=new Intent(MainActivity.this,MainsecondActivity.class);
                value=item.toString();
                inte.putExtra("key",value);
                startActivity(inte);
                break;
        }
        return super.onOptionsItemSelected(item);
    }

}
