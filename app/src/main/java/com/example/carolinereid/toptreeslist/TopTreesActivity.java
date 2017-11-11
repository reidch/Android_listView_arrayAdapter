package com.example.carolinereid.toptreeslist;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by carolinereid on 07/11/2017.
 */

public class TopTreesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.trees_list);
        DBHelper dbHelper = new DBHelper(this);
        ArrayList<Tree> treeList = dbHelper.all();
//        dbHelper.save(1, "Hazel", "Corylus avellana");
//        dbHelper.save(2, "Field maple", "Acer campestre");
//        dbHelper.save(3, "Silver birch", "Betula pendula");
//        dbHelper.save(4, "Holly", "Ilex aquifolium");
//        dbHelper.save(5, "Rowan", "Sorbus aucuparia");
//        dbHelper.save(6, "Scots pine", "Pinus sylvestris");
//        dbHelper.save(7, "Alder", "Alnus glutinosa");
//        dbHelper.save(8, "Ash", "Fraxinus excelsior");
//        dbHelper.save(9, "Beech", "Fagus sylvatica");
//        dbHelper.save(10, "Hawthorn", "Crataegus monogyna");

        TopTreesAdapter treeAdapter = new TopTreesAdapter(this, treeList);
        ListView listView = (ListView)findViewById(R.id.tree_list);
        listView.setAdapter(treeAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.activity_main, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item){
        if(item.getItemId() == R.id.add_tree){
            Intent intent = new Intent(this, AddTreeActivity.class);
            startActivity(intent);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public void getTree(View listItem){
        Tree tree = (Tree) listItem.getTag();
        Intent i = new Intent(this, TreeActivity.class);
        i.putExtra("ranking", tree.getRanking().toString());
        i.putExtra("commonName", tree.getCommonName());
        i.putExtra("latinName", tree.getLatinName());
        i.putExtra("id", tree.getId());
        startActivity(i);
    }
}
