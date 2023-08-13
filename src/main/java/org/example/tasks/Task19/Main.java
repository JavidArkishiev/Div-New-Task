package org.example.tasks.Task19;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        //19.Sort a list of strings in descending order.
        List<String> list = List.of("Yup", "Javid", "Australia");
        list.stream()
                .sorted((x, y) -> Integer.compare(y.length(), x.length()))
                .forEach(s -> System.out.println(s));


    }
}
