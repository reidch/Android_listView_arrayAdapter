package com.example.carolinereid.toptreeslist;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class TreeActivity extends AppCompatActivity {

    TextView rankingTV;
    TextView commonTV;
    TextView latinTV;
    Bundle extras;
//    ImageView imageIV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tree);
        extras = getIntent().getExtras();

        String ranking = extras.getString("ranking");
        String commonName = extras.getString("commonName");
        String latinName = extras.getString("latinName");

        rankingTV = (TextView) findViewById(R.id.ranking);
        commonTV = (TextView) findViewById(R.id.commonName);
        latinTV = (TextView) findViewById(R.id.latinName);
//        imageIV = (ImageView) findViewById(R.id.image);
//        String currentImage = commonName.toLowerCase();

//        Drawable photo = getDrawable(getResources().getIdentifier(currentImage, "drawable", getPackageName()));
//        imageIV.setImageDrawable(photo);

        rankingTV.setText(ranking);
        commonTV.setText(commonName);
        latinTV.setText(latinName);
    }

    public void deleteTree(View button){
        Integer id = extras.getInt("id");
        DBHelper dbHelper = new DBHelper(this);
        dbHelper.delete(id);
        Intent intent = new Intent(this, TopTreesActivity.class);
        startActivity(intent);
    }
}
