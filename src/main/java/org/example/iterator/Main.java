package org.example.iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("value1");
        arrayList.add("value2");
        arrayList.add("value3");
        arrayList.add("value4");
        arrayList.add("value5");

        Iterator<String> iterator = arrayList.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}
