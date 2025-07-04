package org.example;

public class Motorcycle extends Vehicle {
    private int speed;
    private String type;

    public Motorcycle(int speed, String type,  String manufacturer,
                      String model, int yearOfManufacture,
                      int numberOfDoors, int numberOfSeats ) {
        super(manufacturer, model, yearOfManufacture);
        this.speed = speed;
        this.type = type;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }


}
