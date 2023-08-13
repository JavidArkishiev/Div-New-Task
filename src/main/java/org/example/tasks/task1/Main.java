package org.example.tasks.task1;

import java.util.LinkedList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        //1.Filtering: Use a lambda expression and the Predicate functional interface
        // to filter a list of objects based on a specific condition.
        // For example, filter a list of numbers to get only the even numbers.

        LinkedList<Integer> list = new LinkedList<>(List.of(2, 3, 4, 5, 6, 7, 8, 12, 13, 34));
        Predicate<Integer> predicate = x -> x % 2 == 0;
        List<Integer> evenNumbers = list.stream()
                .filter(predicate)
                .collect(Collectors.toList());
        System.out.println("EvenNumbers " + evenNumbers);

    }
}
