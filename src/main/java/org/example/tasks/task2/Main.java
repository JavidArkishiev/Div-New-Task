package org.example.tasks.task2;

import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        //2.Obtain the lengths of strings in a list and collect them into a new list

        List<String> list = List.of("Canada", "Azerbaijan", "Russia");
        List<Integer> result = list.stream()
                .map(String::length)
                .collect(Collectors.toList());
        System.out.println("Result " + result);


    }
}
