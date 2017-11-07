package com.example.carolinereid.toptreeslist;

/**
 * Created by carolinereid on 07/11/2017.
 */

public class Tree {

    private Integer ranking;
    private String commonName;
    private String latinName;

    public Tree(Integer ranking, String commonName, String latinName) {
        this.ranking = ranking;
        this.commonName = commonName;
        this.latinName = latinName;
    }

    public Integer getRanking() {
        return ranking;
    }

    public String getCommonName() {
        return commonName;
    }

    public String getLatinName() {
        return latinName;
    }
}
