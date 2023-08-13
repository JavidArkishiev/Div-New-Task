package org.example.tasks.task15;

import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //5.Find the maximum value in a list of doubles.
        //Input: [1.5, 2.3, 4.7, 3.1, 2.9]
        //Output: 4.7

        List<Double> list = List.of(1.5, 2.3, 4.7, 3.1, 2.9);
        System.out.println("Max value " + Collections.max(list));


    }
}
