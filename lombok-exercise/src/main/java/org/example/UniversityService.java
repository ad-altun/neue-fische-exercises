package org.example;

import lombok.Builder;
import lombok.Data;

import java.util.Arrays;

@Data
@Builder
public class UniversityService {
    private Course course;
    private University university;

    public double courseAverageGrade (Course course) {
        Student[] students = course.getStudents();
        double gradeSum = 0;
        double courseAveragegrade = 0;

        for (Student student : students) {
            gradeSum = gradeSum + student.getGrade();
        }

        courseAveragegrade = (double) gradeSum / students.length;

        return courseAveragegrade;
    }
}
