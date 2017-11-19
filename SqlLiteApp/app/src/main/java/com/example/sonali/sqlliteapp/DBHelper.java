 package com.example.sonali.sqlliteapp;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Sonali on 16/11/2017.
 */

public class DBHelper extends SQLiteOpenHelper {
    private static final String TAG="DatabaseHelper";
    private static final String TABLE_NAME = "students";
    private static final String COL1="name";
    private static final String COL2="usn";
    private static final String COL3="mailID";
    SQLiteDatabase db;
    //ArrayList<HashMap<String,String>> List;
    //HashMap<String,String> map;
    Context context;

   /* public DBHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version, DatabaseErrorHandler errorHandler) {
        super(context, name, factory, version, errorHandler);
        List=new ArrayList<>();
        map=new HashMap<String,String>();
        this.context=context;

    }*/

    public DBHelper(Context context) {
        //String name;
        super(context, TABLE_NAME, null, 3);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL("CREATE TABLE "+TABLE_NAME+"IF NOT EXISTS("+COL1+" TEXT,"+COL2+" INT PRIMARY KEY,"+COL3+" TEXT)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
       // db=this.getWritableDatabase();
        db.execSQL("drop table "+TABLE_NAME);
        onCreate(db);
    }

    public boolean addData(SQLiteDatabase db, String name, int usn, String mailid) throws InterruptedException {
         db=this.getWritableDatabase();
        //Context context = null;
        //ListView lv=new ListView(context);
        ContentValues contentValues=new ContentValues();
        contentValues.put(COL1,name);
        contentValues.put(COL2,usn);
        contentValues.put(COL3,mailid);
        /*Log.d(TAG,"addData: Adding "+name+" to "+TABLE_NAME);
        Thread.sleep(500);
        Log.d(TAG,"addData: Adding "+usn+" to "+TABLE_NAME);
        Thread.sleep(500);
        Log.d(TAG,"addData: Adding "+mailid+" to "+TABLE_NAME);
        Thread.sleep(500);*/
        Long result=db.insert(TABLE_NAME,null,contentValues);
        if(result == -1) {
            //Log.d(TAG, "Data insertion Unsuccessful");
           // Toast.makeText(context, "insertion of data was unsuccessful", Toast.LENGTH_SHORT).show();
            return false;

        }else{

            //Log.d(TAG, "Data insertion successful");
           // Toast.makeText(context, "insertion of data was successful", Toast.LENGTH_SHORT).show();


              return true;
        }
    }

    public Cursor getData(){
        Cursor data=null;
        SQLiteDatabase db=this.getWritableDatabase();
        String query="SELECT * FROM "+TABLE_NAME;
        data=db.rawQuery(query,null);
       // Log.d(TAG, "Current database status");
        return data;
    }
   /* public void deleteRecord(String property,String[] item){
     db=getWritableDatabase();
        db.delete(TABLE_NAME, property, item);
    }
*/
    public void deleteTable(){
       // db=this.getWritableDatabase();
        db.execSQL("drop table "+TABLE_NAME);

    }
}
