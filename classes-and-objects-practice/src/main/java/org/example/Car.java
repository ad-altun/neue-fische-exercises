package org.example;

import java.util.Objects;

public class Car {
    private String brand;
    private String model;
    private String color;
    private int manufacturingYear;
    private int speed;

    public Car(String brand, String model, String color, int manufacturingYear, int speed) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.manufacturingYear = manufacturingYear;
        this.speed = speed;
    }

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
        this.speed = speed + this.speed;
        System.out.println("New speed of the vehicle is " + this.getSpeed() + " km/h.");
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return manufacturingYear == car.manufacturingYear && speed == car.speed &&
                        Objects.equals(brand, car.brand) && Objects.equals(model, car.model) &&
                        Objects.equals(color, car.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, color, manufacturingYear, speed);
    }

        @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", manufacturingYear=" + manufacturingYear +
                ", speed=" + speed +
                '}';
    }
}
