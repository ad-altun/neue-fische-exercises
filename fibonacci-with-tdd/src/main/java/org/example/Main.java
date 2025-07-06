package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a digital number: ");

        int digitalNumber = scanner.nextInt();

        fibonacciNumber(digitalNumber);

    }

    public static void fibonacciNumber(int n){

        int previous = 0;
        int current = 1;

        int fib = 0;

        if ( n == 1 ) fib = 1;
        else {
            for(int i = 2; i <= n; i++){
                fib = previous + current;
                previous = current;
                current = fib;
            }
        }

        System.out.println("Fibonacci number for " + n + " is: " + fib + ".");

    }
}


