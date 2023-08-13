package org.example.tasks.task5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        //5.Calculate the square of a number using a lambda expression.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers of elements");
        int number = scanner.nextInt();

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < number; i++) {
            System.out.println("Enter numbers");
            list.add(scanner.nextInt());
        }

        List<Integer> square = list.stream()
                .map(n -> n * n)
                .collect(Collectors.toList());
        System.out.println("Square " + square);

    }
}
