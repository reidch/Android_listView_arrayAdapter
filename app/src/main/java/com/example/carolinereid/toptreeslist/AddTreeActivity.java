package com.example.carolinereid.toptreeslist;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class AddTreeActivity extends AppCompatActivity {

    EditText editRanking;
    EditText editCommonName;
    EditText editLatinName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_tree);
        editRanking = (EditText)findViewById(R.id.editRanking);
        editCommonName = (EditText)findViewById(R.id.editCommonName);
        editLatinName = (EditText)findViewById(R.id.editLatinName);
    }

    public void addTree(View button){
        DBHelper dbHelper = new DBHelper(this);
        Integer ranking = Integer.parseInt(editRanking.getText().toString());
        String commonName = editCommonName.getText().toString();
        String latinName = editLatinName.getText().toString();
        dbHelper.save(ranking, commonName, latinName);
        Intent intent = new Intent(this, TopTreesActivity.class);
        startActivity(intent);
    }
}
