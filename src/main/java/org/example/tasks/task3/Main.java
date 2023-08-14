package org.example.tasks.task3;

import java.io.LineNumberInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        //3.Filter a list of integers and collect only the even numbers into a new list

        List<Integer> list = new ArrayList<>(List.of(3, 4, 5, 56, 67, 23, 14, 17));
        List<Integer> evenNumbers = list.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
        System.out.println("EvenNumbers " + evenNumbers);


    }
}
