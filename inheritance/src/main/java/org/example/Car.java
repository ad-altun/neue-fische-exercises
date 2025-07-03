package org.example;

public class Car extends Vehicle {
    private int numberOfDoors;
    private int numberOfSeats;

    public Car (String manufacturer, String model, int yearOfManufacture, int numberOfDoors,  int numberOfSeats) {
        super(manufacturer, model, yearOfManufacture);
        this.numberOfDoors = numberOfDoors;
        this.numberOfSeats = numberOfSeats;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    @Override
    public String toString() {
        return "Number of Doors: " + numberOfDoors + '\n' +
                "Number of Seats: " + numberOfSeats + '\n' +
                super.toString();
    }

}
