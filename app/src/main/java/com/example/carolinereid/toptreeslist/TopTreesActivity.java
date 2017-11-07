package com.example.carolinereid.toptreeslist;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
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

        TopTrees topTrees = new TopTrees();
        ArrayList<Tree> treeList = topTrees.getList();

        TopTreesAdapter treeAdapter = new TopTreesAdapter(this, treeList);
        ListView listView = (ListView)findViewById(R.id.tree_list);
        listView.setAdapter(treeAdapter);
    }

    public void getTree(View listItem){
        Tree tree = (Tree) listItem.getTag();
        Intent i = new Intent(this, TreeActivity.class);
        i.putExtra("commonName", tree.getCommonName());
        i.putExtra("latinName", tree.getLatinName());
        i.putExtra("ranking", tree.getRanking().toString());
        startActivity(i);
    }
}
