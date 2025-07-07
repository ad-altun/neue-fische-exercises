package org.example;

import java.util.ArrayList;
import java.util.List;

public class School {

    List<Student> students = new ArrayList<>();

    public void getStudents() {
        System.out.println("The list of students is: '\n'" + students);
    }

    public void addStudent(Student student) {
        students.add(student);
        System.out.println("Added student " + student);
    }

    public Student findStudentByStudentId(String studentId) {
        for (Student student : students) {
            if (studentId.equalsIgnoreCase(student.getStudentId())) {
                return student;
            }
        }
        return null;
    }

    public void removeStudentByStudentId(String studentId) {
        students.removeIf(student -> studentId.equalsIgnoreCase(student.getStudentId()));
    }

}
