package com.company;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class ArrayListMetanit {
    public static void main(String[] args) {
        ArrayList<String> people = new ArrayList<>(5);
        for (int i = 0; i < 10; i++) {
            people.add(i, "Tom " + i);
        }
        for (String peoples : people) {
            System.out.println(peoples);
        }

        System.out.println(people.size());

        if (people.contains("Tom 7"))
            System.out.println("true");
        //System.out.println();
//        System.out.println(people.get(1));

    }

}
