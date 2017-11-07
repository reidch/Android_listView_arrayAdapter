package com.example.carolinereid.toptreeslist;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class TreeActivity extends AppCompatActivity {

    TextView rankingTV;
    TextView commonTV;
    TextView latinTV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tree);

        Intent i = getIntent();
        Bundle extras = i.getExtras();
        String ranking = extras.getString("ranking");
        String commonName = extras.getString("commonName");
        String latinName = extras.getString("latinName");

        rankingTV = (TextView) findViewById(R.id.ranking);
        commonTV = (TextView) findViewById(R.id.commonName);
        latinTV = (TextView) findViewById(R.id.latinName);

        rankingTV.setText(ranking);
        commonTV.setText(commonName);
        latinTV.setText(latinName);
    }
}
