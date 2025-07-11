package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PersonRepository {
    List<Person> persons = new ArrayList<>();

    public void addPersons(Person person) {
        persons.add(person);
    }

    public List<Person> getPersons() {
        return persons;
    }

    public Person getPersonById(String personId) {
        for (Person person : persons) {
            if (person.id().equals(personId)) {
            System.out.println(person);
            return person;
            }
        }
        return null;
    }
}
