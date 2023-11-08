package org.example.treemap;

import java.util.Map;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {

        Map<String, String> treeMap = new TreeMap<>();
        treeMap.put("Karen", "female");
        treeMap.put("Denis", "male");
        treeMap.put("Ban", "male");
        treeMap.put("Britni", "female");

//        Cannot put null as we do with HashMap
//        treeMap.put(null, "none");

//        The output will be sorted
        System.out.println(treeMap);


    }
}
