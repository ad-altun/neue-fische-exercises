package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class School {

    List<Student> students = new ArrayList<>();
    Map<String, String> studentsMap = new HashMap<>();



    public void getStudents() {
        System.out.println("The list of students is: '\n'" + students);
        System.out.println("The list of students in map is: `\n'" + studentsMap);
    }

    public void addStudent(Student student) {
        students.add(student);
        studentsMap.put(student.getStudentId(), student.getFirstName() + " " + student.getLastName());
        System.out.println("Added student " + student);
        System.out.println("Added student in map " + student);
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

    public void getCourses(String studentId) {
        for (Student student : students) {
            if (studentId.equalsIgnoreCase(student.getStudentId())) {
                System.out.println("The taken course is " + student.getCourseName());
            }
        }
    }

}
