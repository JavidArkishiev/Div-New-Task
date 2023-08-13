package org.example.tasks.task13;

import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        //13.Sort a list of strings in ascending order based on their lengths.
        //Input: ["apple", "banana", "cat", "dog", "elephant"]
        //Output: ["cat", "dog", "apple", "banana", "elephant"]

        List<String> list = List.of("apple", "banana", "cat", "dog", "elephant");
        List<String> result = list.stream()
                .sorted((a, b) -> Integer.compare(a.length(), b.length()))
                .collect(Collectors.toList());
        System.out.println(result);


    }
}
