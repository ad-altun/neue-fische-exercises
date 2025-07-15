package org.example;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Step-1: output current date and time
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("\nThe current local date and time: \n" + localDateTime);

        // Step-2:  Add a timespan of 2 weeks to the current date and output the new date
        LocalDateTime twoWeeksLater = localDateTime.plusWeeks(2);
        System.out.println("\nTwo weeks later from now: \n" + twoWeeksLater);



    }
}