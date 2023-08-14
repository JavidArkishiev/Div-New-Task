package org.example.tasks.task4;

import org.w3c.dom.ls.LSInput;

import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        //4.Calculate the sum of a list of integers

        List<Integer> list = List.of(2, 3, 4, 5, 61, 129, 45);
        Integer sum = list.stream()
                .reduce(0, (x, y) -> x + y);
        System.out.println("Sum " + sum);

//        Integer result = IntStream.of(2, 3, 4, 5, 61, 129, 45).sum();
//        System.out.println("Result " + result);


    }
}
