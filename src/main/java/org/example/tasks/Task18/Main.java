package org.example.tasks.Task18;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        //18.Calculate the sum of all numbers in a list.

        List<Integer> list = List.of(2, 3, 4, 5, 5, 6, 7, 7);
        int sum = list.stream()
                .reduce(0, (x, y) -> x + y);
        System.out.println("Sum " + sum);


    }
}
