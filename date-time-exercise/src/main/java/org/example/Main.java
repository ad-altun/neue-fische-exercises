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

        // Step 4: Calculate the difference in days between two arbitrary dates
        // and output the result.
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nPlease enter a date in \"dd.mm.yyyy\" form: ");
        String startString = scanner.nextLine();
        LocalDate start = dateConverter(startString);
        System.out.println("\nNow enter the second date in \"dd.mm.yyyy\" form again: ");
        String endString = scanner.nextLine();
        LocalDate end = dateConverter(endString);

        long diffDays = ChronoUnit.DAYS.between(start,end);

        System.out.println("\nThe difference between two given dates is " +
                diffDays + " days.");

        // *****************************************************
        // Bonus task
        LocalDate birthDate = LocalDate.of(2023, 9, 21);
        Animal animal = new Animal("Ringo", birthDate);

        LocalDate currentDate = LocalDate.now();
        LocalDate nextBirthDay = LocalDate.of(2025, 9, 21);

        long daysUntilNextBirthday = ChronoUnit.DAYS.between(currentDate, nextBirthDay);

        System.out.println("\n The dog " + animal.getName() +
                " has " + daysUntilNextBirthday + " days more until his next birthday!");

        // *****************************************************


    }

    public static LocalDate dateConverter(String date) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");

        return LocalDate.parse(date, formatter);
    }
}