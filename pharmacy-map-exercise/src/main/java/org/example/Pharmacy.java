package org.example;

import java.util.HashMap;
import java.util.Map;

public class Pharmacy {


    public void addMedications(Medication medication) {
        Map<String, Medication> medications = new HashMap<>();

        medications.put(medication.getName(), medication);

        for(Map.Entry<String, Medication> entry : medications.entrySet()) {
            System.out.println(entry.getValue());
        }

    }

}
