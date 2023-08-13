package org.example.tasks.task6;

import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        //6.Check if a string is empty using a lambda expression and 'Predicate'.

        Predicate<String> isEmpty = n -> n.isEmpty();
        String value = "";
        String value1 = "Java";
        System.out.println("Value " + isEmpty.test(value));
        System.out.println("Value2 " + isEmpty.test(value1));


    }
}
