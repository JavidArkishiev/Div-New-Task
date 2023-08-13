package org.example.tasks.task20;

import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        //20.Filter odd numbers from a list.

        List<Integer> list = List.of(2, 3, 13, 23, 14, 17);
        List<Integer> oddNumbers = list.stream()
                .filter(n -> n % 2 == 1)
                .collect(Collectors.toList());
        System.out.println("Odd Numbers " + oddNumbers);

    }
}
