package com.apcs;

public class Tulip {
    private String color;
    private int cost;

    public Tulip(String col, int cos){
        color = col;
        cost = cos;
    }
    public void getCost(){
        cost = 5;
    }
    public String toString(){
        return color + " with a cost of " + cost;
    }

    public static String main(String[] args){
        Tulip t = new Tulip("blue", 10);
        System.out.println(t);
        return "";
    }
}


