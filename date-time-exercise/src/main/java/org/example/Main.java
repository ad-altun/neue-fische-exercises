package org.example;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {

        // Step-1: output current date and time
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("\nThe current local date and time: \n" + localDateTime);

    }
}