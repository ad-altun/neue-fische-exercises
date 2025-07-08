package org.example;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        System.out.println();
        Medication medication = new Medication("", 0);
        Pharmacy pharmacy = new Pharmacy();

        List<Medication> medicationsStock = new ArrayList<>();

        medicationsStock.add(new Medication("Parol", 4.99));
        medicationsStock.add(new Medication("Allergovit", 896.63));

        for(Medication med : medicationsStock) {
            pharmacy.addMedications(med);
        }

    }
}
