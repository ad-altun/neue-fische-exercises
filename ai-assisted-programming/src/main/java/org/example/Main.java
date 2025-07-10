package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Create a method that reverses a given string (e.g., “Hello” -> “olleH”).
        String original = "Hello";
        String reversed = reverseString(original);
        System.out.println();
        System.out.println("Original text: " + original);
        System.out.println("Reversed text: " + reversed); // Output: olleH

        // Implement a function that checks if a given string is a palindrome
        // (e.g., “anna” is a palindrome).
        System.out.println();
        System.out.print("Is 'RaceCar' a palindrome? - ");
        System.out.println(isPalindromeFlexible("RaceCar"));
        System.out.print("Is 'A man a plan a canal Panama' a palindrome? - ");// true
        System.out.println(isPalindromeFlexible("A man a plan a canal Panama")); // true

        // Use AI-assisted programming to write a method that
        // generates the first n prime numbers.
        System.out.println();
        List<Integer> primes = generateFirstNPrimes(10);
        System.out.println("First " + primes.size() + " prime numbers are:" );
        System.out.println(primes); // Output: [2, 3, 5, 7, 11, 13, 17, 19, 23, 29]
    }

    // Create a method that reverses a given string (e.g., “Hello” -> “olleH”).
    public static String reverseString(String input) {
        return new StringBuilder(input).reverse().toString();
    }

    // Implement a function that checks if a given string is a palindrome
    // (e.g., “anna” is a palindrome).
    public static boolean isPalindromeFlexible(String input) {
        String cleaned = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String reversed = new StringBuilder(cleaned).reverse().toString();
        return cleaned.equals(reversed);
    }

    // Use AI-assisted programming to write a method that
    // generates the first n prime numbers.
    public static List<Integer> generateFirstNPrimes(int n) {
        List<Integer> primes = new ArrayList<>();
        int num = 2; // Start from the first prime number

        while (primes.size() < n) {
            if (isPrime(num)) {
                primes.add(num);
            }
            num++;
        }

        return primes;
    }
    private static boolean isPrime(int number) {
        if (number <= 1) return false;
        if (number == 2) return true;
        if (number % 2 == 0) return false;

        for (int i = 3; i <= Math.sqrt(number); i += 2) {
            if (number % i == 0) return false;
        }

        return true;
    }


}