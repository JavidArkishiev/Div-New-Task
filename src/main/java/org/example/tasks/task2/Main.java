package org.example.tasks.task2;

import java.util.LinkedList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        //2.Mapping: Use a lambda expression and the Function functional interface to
        // transform each element in a list to a different value.
        // For example, convert a list of strings to uppercase or extract a specific property from a list of objects.

        LinkedList<String> list = new LinkedList<>(List.of("Java", "arkishiev", "THtvttuG"));
        Function<String, String> function = n -> n.toUpperCase();
        List<String> result = list.stream()
                .map(function)
                .collect(Collectors.toList());
        System.out.println("Result " + result);


    }
}
