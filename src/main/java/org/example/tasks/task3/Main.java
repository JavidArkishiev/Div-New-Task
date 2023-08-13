package org.example.tasks.task3;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        //3.Sorting: Use a lambda expression and the Comparator functional interface to define custom
        // sorting logic for a list of objects. For example,
        // sort a list of employees based on their salaries or
        // sort a list of strings based on their lengths.

        List<Person> list = new ArrayList<>();
        list.add(new Person("Javid", 567));
        list.add(new Person("Ismayil", 432));
        Collections.sort(list, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                if (o1.getSalary() > o2.getSalary()) return 1;
                if (o1.getSalary() < o2.getSalary()) return -1;
                return 0;
            }
        });
        for (Person person : list) {
            System.out.println(person);
        }

    }
}
