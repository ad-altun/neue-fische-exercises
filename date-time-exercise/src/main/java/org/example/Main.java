package org.example;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Step-1: output current date and time
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("\nThe current local date and time: \n" + localDateTime);

        // Step-2:  Add a timespan of 2 weeks to the current date and output the new date
        LocalDateTime twoWeeksLater = localDateTime.plusWeeks(2);
        System.out.println("\nTwo weeks later from now: \n" + twoWeeksLater);

        // Step 3: Compare the current date with a specified future date and
        // output whether the current date is before or after the specified date.
        LocalDate localDate = LocalDate.now();
        LocalDate futureDate = LocalDate.of(2025, Month.AUGUST, 3);

        System.out.println("\nThe current local date: \n" + localDate);
        System.out.println("\nThe specified local date: \n" + futureDate);

        if (localDate.isBefore(futureDate)) {
            System.out.println("-> The current date is before the specified date.");
        } else {
            System.out.println("-> The current date is after the specified date.");
        }


    }

}