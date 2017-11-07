package com.example.carolinereid.toptreeslist;

import java.util.ArrayList;

/**
 * Created by carolinereid on 07/11/2017.
 */

public class TopTrees {

    private ArrayList<Tree> list;

    public TopTrees() {
        list = new ArrayList<Tree>();
        list.add(new Tree(1, "Hazel", "Corylus avellana"));
        list.add(new Tree(2, "Field maple", "Acer campestre"));
        list.add(new Tree(3, "Silver birch", "Betula pendula"));
        list.add(new Tree(4, "Holly", "Ilex aquifolium"));
        list.add(new Tree(5, "Rowan", "Sorbus aucuparia"));
        list.add(new Tree(6, "Scots pine", "Pinus sylvestris"));
        list.add(new Tree(7, "Alder", "Alnus glutinosa"));
        list.add(new Tree(8, "Ash", "Fraxinus excelsior"));
        list.add(new Tree(9, "Beech", "Fagus sylvatica"));
        list.add(new Tree(10, "Hawthorn", "Crataegus monogyna"));
    }

    public ArrayList<Tree> getList() {
        return new ArrayList<Tree>(list);
    }
}
