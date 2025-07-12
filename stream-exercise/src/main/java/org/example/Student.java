package org.example;

public class Student<String> {
    private final String name;
    private final String zip;
    private final String id;
    private final String age;


    public Student(String id, String name, String zip, String age) {
        this.id = id;
        this.name = name;
        this.zip = zip;
        this.age = age;
    }

    @Override
    public java.lang.String toString() {
        return "Student-Id = " + id + ", " +
                "Student Name = " + name + ", " +
                "Postal Code = " + zip + ", " +
                "Student Age = " + age;
    }

}
