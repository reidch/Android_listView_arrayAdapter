package com.example.carolinereid.toptreeslist;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class TreeActivity extends AppCompatActivity {

    TextView commonTV;
    TextView latinTV;
    TextView rankingTV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tree);

        Intent i = getIntent();
        Bundle extras = i.getExtras();
        String commonName = extras.getString("commonName");
        String latinName = extras.getString("latinName");
        String ranking = extras.getString("ranking");

        commonTV = (TextView) findViewById(R.id.commonName);
        latinTV = (TextView) findViewById(R.id.latinName);
        rankingTV = (TextView) findViewById(R.id.ranking);

        commonTV.setText(commonName);
        latinTV.setText(latinName);
        rankingTV.setText(ranking);
    }
}
