package org.example.tasks.task14;

import java.util.List;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        //14.Calculate the sum of all even numbers in a list of integers.
        //Input: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
        //Output: 30

        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int sum = list.stream()
                .filter(n -> n % 2 == 0)
                .reduce(0, (a, b) -> a + b);
        System.out.println("Sum " + sum);


//           Integer  x=    IntStream.rangeClosed(1,10).filter(n->n%2==0).sum();
//        System.out.println(x);

    }
}
