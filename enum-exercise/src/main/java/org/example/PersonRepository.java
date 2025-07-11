package org.example;

import java.util.*;

public class PersonRepository {
    List<Person> persons = new ArrayList<>();

    public void addPersons(Person person) {
        persons.add(person);
    }

    public List<Person> getPersons() {
        return persons;
    }

    public Optional<Person> getPersonById(String personId) {
        for (Person person : persons) {
            if (person.id().equals(personId)) {
//            System.out.println(person);
            return Optional.of(person);
            }
        }
        return Optional.empty();
    }
}
