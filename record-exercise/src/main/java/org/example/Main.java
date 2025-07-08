package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // go to next line before printing anything
        System.out.println();
        System.out.println();

        List<Animal> animals = new ArrayList<>();

        animals.add(new Animal("1-a", "Pablo", "bulldog", 3));
        animals.add(new Animal("1-b", "Diego", "english bulldog", 7));
        animals.add(new Animal("1-c", "Ingo", "azawakh", 9));
        animals.add(new Animal("2-a", "Kitty", "british shorthair", 2));
        animals.add(new Animal("2-a", "Kitty", "british shorthair", 2));


//        List<Animal> animals = new ArrayList<>(List.of(dog1, dog2, dog3, cat1, cat2));

        for (Animal animal : animals) {
            System.out.println("-> Animal-ID " + "'" + animal.animalId()+ "'" +
                    " is a " + animal.species() + " and its name is " + animal.name() + "."
                    + '\n' + " " + animal.name() + " is " + animal.age() + " years old." + "\n");
        }

        System.out.println();

        System.out.println("Is cat1 == cat2: " + (animals.get(3) == animals.get(4)));
        System.out.println("Is cat1.equals(cat2): " + animals.get(3).equals(animals.get(4)));


    }
}