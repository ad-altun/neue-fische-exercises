package org.example;

public class Car {
    private String brand;
    private String model;
    private String color;
    private int manufacturingYear;
    private int speed;


    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public void start() {
        System.out.println("Engine is running.");
    };

    public void accelerate(int speed) {
        this.speed = speed;
        System.out.println("New speed of the vehicle is " + this.getSpeed() + " km/h.");
    }

}
