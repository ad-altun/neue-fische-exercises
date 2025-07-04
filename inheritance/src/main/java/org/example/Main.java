package org.example;

public class Main {
    public static void main (String[] args) {

        Vehicle vehicle = new Vehicle("Temsa","MD-9",2025);
        System.out.println(vehicle);

        Car car = new Car("Koluman", "Yazgan", 2024, 6, 12 );
        System.out.println();
        System.out.println(car);

        Motorcycle moto = new Motorcycle(50, "Chopper", "Honda",
                "KrX-2000", 2022, 0, 1);

        int motoSpeed = moto.getSpeed();
        String motoType = moto.getType();

        System.out.println("The motor type is " + motoType +
                " and it rides at " + motoSpeed + " km/h.");;
    }
}