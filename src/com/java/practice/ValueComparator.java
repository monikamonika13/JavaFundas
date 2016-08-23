package com.java.practice;

import java.util.Comparator;
import java.util.HashMap;

public class ValueComparator implements Comparator<Integer> {

    HashMap<Integer, String> map = new HashMap<>();

    public ValueComparator(HashMap<Integer, String> map) {
        this.map.putAll(map);
    }

    @Override
    public int compare(Integer i1, Integer i2) {
        if (map.get(i1).compareTo(map.get(i2)) > 0)
                return 1;
        else if (map.get(i1).compareTo(map.get(i2)) < 0)
            return -1;
        else
            return 0;
    }
}
