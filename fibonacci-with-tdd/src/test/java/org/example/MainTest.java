package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MainTest {

    @Test
    void fibonacci_shouldReturn0_when0IsGiven() {
        int n = 0;
        int expected = 0;
        int actual = Main.fibonacciNumber(n);
        assertEquals(expected, actual);
    }

    @Test
    void fibonacci_shouldReturn1_when1IsGiven() {
        int n = 1;
        int expected = 1;
        int actual = Main.fibonacciNumber(n);
        assertEquals(expected, actual);
    }

    @Test
    void fibonacci_shouldReturn3_when2IsGiven() {
        int n = 2;
        int expected = 1;
        int actual = Main.fibonacciNumber(n);
        assertEquals(expected, actual);
    }

    @Test
    void fibonacci_shouldReturn6_when3IsGiven() {
        int n = 3;
        int expected = 2;
        int actual = Main.fibonacciNumber(n);
        assertEquals(expected, actual);
    }

    @Test
    void fibonacci_shouldReturn10_when4IsGiven() {
        int n = 4;
        int expected = 3;
        int actual = Main.fibonacciNumber(n);
        assertEquals(expected, actual);
    }

    @Test
    void fibonacci_shouldReturn610_when15IsGiven() {
        int n = 15;
        int expected = 610;
        int actual = Main.fibonacciNumber(n);
        assertEquals(expected, actual);
    }
}