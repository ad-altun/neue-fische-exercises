package org.example;

public class Medication {
    private final String name;
    private final double price;
    private boolean availability;

    public Medication(String name, double price) {
        this.name = name;
        this.price = price;
        availability = false;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public boolean isAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    @Override
    public String toString() {
        return "Medication name: " + name + '\n' +
                "Price: " + price + " €" + '\n' +
                "Availability: " + (availability ? "Available" : "Not Available") + '\n';
    }


}
