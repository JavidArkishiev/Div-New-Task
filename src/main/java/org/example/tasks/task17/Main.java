package org.example.tasks.task17;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        //  17.Sort a list of strings in ascending order.

        List<String> list = List.of("Java", "Arkishiev", "Add");
        list.stream()
                .sorted((x, y) -> Integer.compare(x.length(), y.length()))
                .forEach(System.out::println);

    }
}
