package com.example.carolinereid.toptreeslist;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;

/**
 * Created by carolinereid on 09/11/2017.
 */

public class DBHelper extends SQLiteOpenHelper{

    public static final String DATABASE_NAME = "trees.db";
    public static final String TREES_TABLE_NAME = "trees";
    public static final String TREES_COLUMN_ID = "id";
    public static final String TREES_COLUMN_RANK = "ranking";
    public static final String TREES_COLUMN_NAME = "commonName";
    public static final String TREES_COLUMN_LATIN = "latinName";

    public DBHelper(Context context) { super(context, DATABASE_NAME, null, 1); }

    public void onCreate(SQLiteDatabase db){
        db.execSQL("CREATE TABLE " + TREES_TABLE_NAME + "(id INTEGER primary key autoincrement, ranking INTEGER, commonName TEXT, latinName TEXT)");
    }

    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion){
        db.execSQL("DROP TABLE IF EXISTS " + TREES_TABLE_NAME);
        onCreate(db);
    }

    public boolean save(Integer ranking, String commonName, String latinName){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(TREES_COLUMN_RANK, ranking);
        contentValues.put(TREES_COLUMN_NAME, commonName);
        contentValues.put(TREES_COLUMN_LATIN, latinName);
        db.insert(TREES_TABLE_NAME, null, contentValues);
        return true;
    }

    public ArrayList<Tree> all(){
        ArrayList<Tree> trees = new ArrayList<>();
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery("SELECT * FROM " + TREES_TABLE_NAME + " ORDER BY " + TREES_COLUMN_RANK, null);
        while(cursor.moveToNext()){
            Integer id = cursor.getInt(cursor.getColumnIndex(TREES_COLUMN_ID));
            Integer ranking = cursor.getInt(cursor.getColumnIndex(TREES_COLUMN_RANK));
            String commonName = cursor.getString(cursor.getColumnIndex(TREES_COLUMN_NAME));
            String latinName = cursor.getString(cursor.getColumnIndex(TREES_COLUMN_LATIN));
            Tree tree = new Tree(id, ranking, commonName, latinName);
            trees.add(tree);
        }
        cursor.close();
        return trees;
    }

    public void delete(Integer id){
        SQLiteDatabase db = this.getWritableDatabase();
        String selection = " id = ?";
        String[] values = {id.toString()};
        db.delete(TREES_TABLE_NAME, selection, values);
    }
}
