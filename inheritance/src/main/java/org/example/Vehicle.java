package org.example;

public class Vehicle {
    private String manufacturer;
    private String model;
    private int yearOfManufacture;

    public Vehicle(String manufacturer, String model, int yearOfManufacture) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.yearOfManufacture = yearOfManufacture;
    }

    @Override
    public String toString() {
        System.out.println();
        return "Vehicle{\n" +
                "manufacturer='" + manufacturer + '\'' +
                ", \nmodel='" + model + '\'' +
                ", \nyearOfManufacture=" + yearOfManufacture +
                '}';
    }
}
