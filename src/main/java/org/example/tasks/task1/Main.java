package org.example.tasks.task1;

import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        //  1.Filter a list of integers to get only the even numbers.


        List<Integer> list = List.of(2, 3, 4, 5, 6, 712, 34, 45, 31, 33);
        list.stream()
                .filter(n -> n % 2 == 0)
                .forEach(n -> System.out.println(n));


    }
}
