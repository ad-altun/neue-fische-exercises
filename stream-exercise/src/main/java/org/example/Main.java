package org.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Main {
    public static final String COMMA_DELIMITER = ",";

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

        //  Step 4: Perform a ‘reduce’ operation to calculate the sum of all numbers in the list.
        int sum = numbers.stream()
                .reduce(0, Integer::sum);

        System.out.println("\nStep-4");
        System.out.println("Sum of all numbers: \n" + sum);

        //  Step 5: Use ‘forEach’ and output each processed number.
        System.out.println("\nStep-5");
        System.out.println("Remaining numbers after processed by filter() " +
                "map(), and sorted() methods:");
        numbers.stream()
                .filter(num -> num % 2 == 0)
                .map(num -> num * 2)
                .sorted()
                .forEach(System.out::println);

        //  Step 6: Collect the processed numbers with ‘collect’ into a new list.
        List<Integer> processedNumbers = numbers.stream()
                .filter(num -> num % 2 == 0)
                .map(num -> num * 2)
                .sorted().collect(Collectors.toCollection(ArrayList::new));

        System.out.println("\nStep-6");
        System.out.println("Processed numbers as a list: \n" + processedNumbers);

        // Bonus ( read and output from .csv file )
        System.out.println("\n\nBonus");                              // Step - Bonus
        System.out.println("Read from students.csv file: ");         // Task description
        try {
            // records is an array of arrays.
            // inner arrays' elements are String
            List<List<String>> records;
            // get each line from .csv file
            try (Stream<String> lines = Files.lines(Path.of("stream-exercise/students.csv"))) {
                // split with comma
                records = lines.map(line -> Arrays.asList(line.split(COMMA_DELIMITER)))
                        .distinct()                                         // remove duplicate
                        .skip(1)                                         // skip header
                        .filter(line -> line.size() > 1)        // remove empty arrays
                        .toList();                                          // convert to array
                for (List<String> record : records) {
                    // create a new Student with each array
                    Student<String> students = new Student<>(record.get(0),
                            record.get(1), record.get(2), record.get(3));
                    System.out.println();
                    System.out.println(students);
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // BufferReader method
//        try {
//            BufferedReader reader = new BufferedReader(new FileReader("stream-exercise/students.csv"));
//            System.out.println(reader.lines().skip(1).toList());
//            reader.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }
}