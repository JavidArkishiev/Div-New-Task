package org.example.tasks.task11;

import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        //11.Find the square of each element in a list of integers.
        //Input: [1, 2, 3, 4, 5]
        //Output: [1, 4, 9, 16, 25]
        List<Integer> list = List.of(1, 2, 3, 4, 5);
        List<Integer> square = list.stream()
                .map(n -> n * n)
                .collect(Collectors.toList());
        System.out.println("Square " + square);

    }
}
