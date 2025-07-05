package org.example;

public class Main {
    public static void main(String[] args) {

        fibonacciNumber(10);

    }

    public static int fibonacciNumber(int n){

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

        return fib;
    }
}


