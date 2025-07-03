package org.example;

public class Main {
    public static void main (String[] args) {

        Vehicle vehicle = new Vehicle("Temsa","MD-9",2025);
        System.out.println(vehicle);

        Car car = new Car("Koluman", "Yazgan", 2024, 6, 12 );
        System.out.println();
        System.out.println(car);
    }
}