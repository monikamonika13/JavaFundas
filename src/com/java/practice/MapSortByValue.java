package com.java.practice;

import java.util.HashMap;
import java.util.TreeMap;

public class MapSortByValue {

    public static TreeMap<Integer, String> sortbyvalue(HashMap unsortedmap) {
        TreeMap<Integer, String> sortedmap = new TreeMap(new ValueComparator(unsortedmap));
        sortedmap.putAll(unsortedmap);
        return sortedmap;
    }

    public static void main(String args[]) {
        HashMap<Integer, String> unsortedmap = new HashMap<Integer, String>();
        unsortedmap.put(4, "HTML");
        unsortedmap.put(2, "Java");
        unsortedmap.put(1, "Python");
        unsortedmap.put(3, "ASP");
        System.out.println(unsortedmap);
        TreeMap<Integer, String> sortedmap = sortbyvalue(unsortedmap);
        System.out.println(sortedmap);
    }


}