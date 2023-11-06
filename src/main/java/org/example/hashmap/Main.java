package org.example.hashmap;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        HashMap<String, String> hashMap = new HashMap<>(50000, 0.75f);

        long time1 = System.currentTimeMillis();
        for (int i = 0; i < 50000; i++) {
            hashMap.put("key" + i, "value" + i);
        }
        long time2 = System.currentTimeMillis();
        System.out.println(time2 - time1);

//*************************************************************************************************************

        MyHashMap<String, String> myHashMap = new MyHashMap<>();

        long time3 = System.currentTimeMillis();
        for (int i = 0; i < 50000; i++) {
            myHashMap.put("key" + i, "value" + i);
        }
        long time4 = System.currentTimeMillis();
        System.out.println(time4 - time3);


    }
}