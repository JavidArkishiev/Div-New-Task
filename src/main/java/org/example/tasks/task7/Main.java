package org.example.tasks.task7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //7.Sort a list of integers in ascending order using a lambda expression and 'Comparator'.

        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(4);
        list.add(5);
        list.add(1);
        list.add(9);

        Comparator<Integer> comparator = new Comparator<Integer>() {

            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }

        };
        Collections.sort(list, comparator);
        for (Integer integer : list) {
            System.out.println(integer);
        }


    }
}
