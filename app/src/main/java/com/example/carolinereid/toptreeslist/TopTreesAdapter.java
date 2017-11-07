package com.example.carolinereid.toptreeslist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by carolinereid on 07/11/2017.
 */

public class TopTreesAdapter extends ArrayAdapter<Tree> {

    public TopTreesAdapter(Context context, ArrayList<Tree> trees) {
        super(context, 0, trees);
    }

    public View getView(int position, View listItemView, ViewGroup parent){
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.tree_item, parent, false);
        }
        Tree currentTree = getItem(position);
        TextView ranking = (TextView)listItemView.findViewById(R.id.ranking);
        ranking.setText(currentTree.getRanking().toString());
        TextView commonName = (TextView)listItemView.findViewById(R.id.commonName);
        commonName.setText(currentTree.getCommonName());
        TextView latinName = (TextView)listItemView.findViewById(R.id.latinName);
        latinName.setText(currentTree.getLatinName());

        listItemView.setTag(currentTree);

        return listItemView;
    }
}
