package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        System.out.println();

        DaysOfWeek.SATURDAY.isWeekDay();

        PersonRepository personRepository = new PersonRepository();
//        Map<String, String> persons = new HashMap<>();
        List<Person> personList = new ArrayList<>();

        Person person1 = new Person("1", "person-1", "Monday");
        Person person2 = new Person("2", "person-2", "Tuesday");
        Person person3 = new Person("3", "person-3", "Wednesday");
        Person person4 = new Person("4", "person-4", "Thursday");
        Person person5 = new Person("5", "person-5", "Friday");
        Person person6 = new Person("6", "person-6", "Saturday");
        Person person7 = new Person("7", "person-7", "Sunday");

//        List<Person> personList = new ArrayList<>(List.of(person1, person2, person3, person4));
        personList.addAll(List.of(person1, person2,person3, person4, person5, person6, person7));

        // show favorite days
        for (Person person : personList) {
            System.out.println("The favourite day of " + person.name() + " is " + person.favoriteDay());
        }
    }
}