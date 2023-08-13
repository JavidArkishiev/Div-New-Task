package org.example.tasks.task12;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //12.Filter out strings from a list that have a length less than or equal to 3.
        //Input: ["apple", "banana", "cat", "dog", "elephant"]
        //Output: ["apple", "banana", "elephant"]
        List<String> list=new ArrayList<>(List.of("apple", "banana", "cat", "dog", "elephant"));
        list.stream()
                .filter(n->n.length()>3|| n.equals(3))
                .forEach(System.out::println);


    }
}
