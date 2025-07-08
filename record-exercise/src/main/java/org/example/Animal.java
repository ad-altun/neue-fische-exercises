package org.example;

public record Animal(String animalId,
                     String name,
                     String animalSpecies,
                     int age,
                     Owner owner,
                     Species species) {


}
