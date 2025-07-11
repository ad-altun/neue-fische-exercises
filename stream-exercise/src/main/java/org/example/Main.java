package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        List<Integer> numbers = Stream.of(8, 4, 1, 9, 2, 10, 6, 7, 5, 3).collect(Collectors.toCollection(ArrayList::new));

        System.out.println("\nThe list consists of: " + numbers);

        //  Step 1: Filter a list of numbers and output only the even numbers.
        List<Integer> evenNumbers = numbers.stream().filter(num -> num % 2 == 0).toList();

        System.out.println("\nStep-1");
        System.out.println("The list filtered to contain only even numbers: \n" + evenNumbers);

        //  Step 2: Use ‘map’ and double each number in the list.
        List<Integer> doubleNumbers = numbers.stream().map(number -> number * 2).toList();

        System.out.println("\nStep-2");
        System.out.println("Each number doubled: \n" + doubleNumbers);

        //  Step 3: Sort the list in ascending order.
        List<Integer> sortedNumbers = numbers.stream().sorted().toList();

        System.out.println("\nStep-3");
        System.out.println("Sorted list: \n" + sortedNumbers);



    }
}