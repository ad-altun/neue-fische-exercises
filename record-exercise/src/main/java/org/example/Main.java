package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // go to next line before printing anything
        System.out.println();
        System.out.println();

        List<Owner> owners = new ArrayList<>();
        owners.add(new Owner("Mike", 43, "Kempten"));
        owners.add(new Owner("Katy", 33, "Singen"));
        owners.add(new Owner("James", 19, "Friedrichshafen"));
        owners.add((new Owner("Tucker", 59, "Berlin")));

        List<Species> species = new ArrayList<>();
        species.add(new Species("bulldog", 2500));
        species.add(new Species("english bulldog", 3500));
        species.add(new Species("azawakh", 3100));
        species.add(new Species("british shorthair", 1200));


        System.out.println();
        System.out.println();

        List<Animal> animals = new ArrayList<>();

        animals.add(new Animal("1-a", "Pablo",
                "bulldog", 3,
                owners.getFirst(), species.get(0)));
        animals.add(new Animal("1-b", "Diego",
                "english bulldog", 7,
                owners.get(1), species.get(1)));
        animals.add(new Animal("1-c", "Ingo",
                "azawakh", 9,
                owners.get(2), species.get(2)));
        animals.add(new Animal("2-a", "Kitty",
                "british shorthair", 2,
                owners.get(3), species.get(3)));
        animals.add(new Animal("2-a", "Kitty",
                "british shorthair", 2,
                owners.get(3), species.get(3)));


//        List<Animal> animals = new ArrayList<>(List.of(dog1, dog2, dog3, cat1, cat2));

        for (Animal animal : animals) {
            System.out.println("-> Animal-ID " + "'" + animal.animalId()+ "'" +
                    " is a " + animal.animalSpecies() + " and its name is " + animal.name() + "."
                    + '\n' + " " + animal.name() + " is " + animal.age() + " years old." + "\n");
        }

        System.out.println();

        System.out.println("Is cat1 == cat2: " + (animals.get(3) == animals.get(4)));
        System.out.println("Is cat1.equals(cat2): " + animals.get(3).equals(animals.get(4)));


    }
}