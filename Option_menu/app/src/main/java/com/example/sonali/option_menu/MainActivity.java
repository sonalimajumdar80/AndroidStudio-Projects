package com.example.sonali.option_menu;
//to demonstrate the functioning features in android which are listed below:
//1. Option menu
//2. alert dialog generator
//3. text view in layout
//4. Toast message
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
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

        MenuInflater m=getMenuInflater();
        m.inflate(R.menu.option_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        final AlertDialog.Builder alert=new AlertDialog.Builder(MainActivity.this);
        alert.setTitle("Alert Message: ");

            switch (item.getItemId()){
                case R.id.item1:
                    alert.setMessage("Thanks for the selection!!");
                    alert.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();
                            Toast.makeText(MainActivity.this,"item 1 selected ",Toast.LENGTH_SHORT).show();
                        }
                    });

                    break;
                case R.id.item2:
                    alert.setMessage("Thanks for the selection!!");
                    alert.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();
                            Toast.makeText(MainActivity.this,"item 2 selected ",Toast.LENGTH_SHORT).show();
                        }
                    });
                    break;

                case R.id.item3:
                    alert.setMessage("Thanks for the selection!!");
                    alert.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();
                            Toast.makeText(MainActivity.this,"item 3 selected ",Toast.LENGTH_SHORT).show();
                        }
                    });
                    break;
                default:Toast.makeText(MainActivity.this,"You selected nothing!!",Toast.LENGTH_SHORT).show();


            }
        alert.show();

        return super.onOptionsItemSelected(item);
    }
}
