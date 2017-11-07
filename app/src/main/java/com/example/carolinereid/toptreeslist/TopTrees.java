package com.example.carolinereid.toptreeslist;

import java.util.ArrayList;

/**
 * Created by carolinereid on 07/11/2017.
 */

public class TopTrees {

    private ArrayList<Tree> list;

    public TopTrees() {
        list = new ArrayList<Tree>();
        list.add(new Tree(1, "hazel", "Corylus avellana"));
        list.add(new Tree(2, "field maple", "Acer campestre"));
        list.add(new Tree(3, "silver birch", "Betula pendula"));
        list.add(new Tree(4, "holly", "Ilex aquifolium"));
        list.add(new Tree(5, "rowan", "Sorbus aucuparia"));
        list.add(new Tree(6, "Scots pine", "Pinus sylvestris"));
        list.add(new Tree(7, "alder", "Alnus glutinosa"));
        list.add(new Tree(8, "ash", "Fraxinus excelsior"));
        list.add(new Tree(9, "beech", "Fagus sylvatica"));
        list.add(new Tree(10, "hawthorn", "Crataegus monogyna"));
    }

    public ArrayList<Tree> getList() {
        return new ArrayList<Tree>(list);
    }
}
