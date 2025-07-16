package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

 /// ///###
 /// you are on value branch!!!!!
 ///

public class Main {
    public static void main(String[] args) {

        Student student1 = new Student("st-1", "Pam", "Dunder Mifflin", 1);
        Student student2 = new Student("st-2", "Jim", "Dunder Mifflin", 2);
        Student student3 = new Student("st-3", "Michael", "Dunder Mifflin", 5);
        Student student4 = new Student("st-4", "Dwight", "Dunder Mifflin", 1);
        Student student5 = new Student("st-5", "Kevin", "Dunder Mifflin", 3);
        Student student6 = Student.builder()
                .id("st-6")
                .name("Ryan")
                .address("Scranton-6")
                .grade(4)
                .build();

        List<Student> students = new ArrayList<>(List.of(student1, student2, student3,
                student4, student5, student6));

        students.forEach(student ->
                System.out.println(
                        "\nStudent-ID: " + student.getId() +
                                "\nStudent-Name: " + student.getName() +
                                "\nStudent-Address: " + student.getAddress() +
                                "\nStudent-Grade: " + student.getGrade() +
                                "\n-----------"
                ));
        System.out.println("\n********************************************\n");

        Teacher teacher1 = new Teacher("th-1", "Creed", "Chemistry");
        Teacher teacher2 = new Teacher("th-2", "Oscar", "Mathematics");
        Teacher teacher3 = new Teacher("th-3", "Robert", "Economy");
        Teacher teacherTemp = new Teacher("", "", "");
        Teacher teacher4 = teacherTemp.withId("th-4").withName("Andy").withSubject("Music");

        List<Teacher> teachers = new ArrayList<>(List.of(teacher1, teacher2, teacher3, teacher4));

        teachers.forEach(teacher -> System.out.println(
                "\nTeacher-ID: " + teacher.id() +
                        "\nTeacher-Name: " + teacher.name() +
                        "\nTeacher-Subject: " + teacher.subject() +
                        "\n----------------"
        ));

        System.out.println("\n********************************************\n");

        Course course1 = new Course("c-1", teacher1.subject(), teacher1.name(), new Student[]{student1, student2});
        Course course2 = new Course("c-2", teacher2.subject(), teacher2.name(), new Student[]{student3, student5});
        Course course3 = new Course("c-3", teacher3.subject(), teacher2.name(), new Student[]{student2, student4});
        Course course4 = Course.builder()
                .id("c-4")
                .name(teacher4.subject())
                .teacher(teacher4.name())
                .students(new Student[]{student6, student3})
                .build();

        List<Course> courses = new ArrayList<>(List.of(course1, course2, course3, course4));

        courses.forEach(course ->
                System.out.println(
                        "\nCourse-ID: " + course.getId() +
                                "\nCourse-name: " + course.getName() +
                                "\nCourse-Teacher: " + course.getTeacher() +
                                "\nCourse-Students: " + Arrays.toString(course.getStudents()) +
                                "\n----------------"
                ));
        System.out.println("\n********************************************\n");


        University university = new University("u-1", "Yale", new Course[]{course1, course2});
        UniversityService service = new UniversityService(course1, university);

        System.out.println("\nThis university's average grade for this course is ");
        System.out.println(service.courseAverageGrade(course1));

        System.out.println("\n********************************************\n");




        System.out.println("\n********************************************\n");
    }
}