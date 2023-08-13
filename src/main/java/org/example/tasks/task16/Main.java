package org.example.tasks.task16;

import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        //16.Filter even numbers from a list.

        List<Integer> list = List.of(2, 3, 4, 5, 6);
        List<Integer> evenNumbers = list.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
        System.out.println("Even Numbers " + evenNumbers);


    }
}
