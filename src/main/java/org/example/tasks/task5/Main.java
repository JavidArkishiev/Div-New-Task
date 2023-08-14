package org.example.tasks.task5;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        //5.Sort a list of strings in alphabetical order and
        // collect the sorted strings into a new list

        List<String> list = List.of("Java", "Python", "Html", "Css");
        List<String> result = list.stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println("Result " + result);


    }
}
