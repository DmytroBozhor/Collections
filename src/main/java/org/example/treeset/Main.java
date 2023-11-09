package org.example.treeset;

import java.util.Comparator;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

        TreeSet<Student> treeSet = new TreeSet<>(Comparator.comparingInt(Student::getCourse));

        treeSet.add(new Student("Ban", 2));
        treeSet.add(new Student("Alice", 1));
        treeSet.add(new Student("Robin", 3));

        System.out.println(treeSet);

    }

}
