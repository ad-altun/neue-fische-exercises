package org.example;


public class Main {
    public static void main(String[] args) {
        School school = new School();

        System.out.println();
        Student student1 = new Student("Gary", "Rodriguez", "FC23");
        school.addStudent(student1);
        System.out.println();

        Student student2 = new Student("Henry", "Teo", "SC24");
        school.addStudent(student2);
        System.out.println();

        Student student3 = new Student("John", "Doe", "SC25");
        school.addStudent(student3);
        System.out.println();

        Student student4 = new Student("Michael", "Scout", "WC21");
        school.addStudent(student4);


        Student studentFind = school.findStudentByStudentId(student4.getStudentId());

        System.out.println();
        System.out.println("Found student is " + studentFind);

        System.out.println();

        school.removeStudentByStudentId(student1.getStudentId());

        school.getStudents();




    }
}