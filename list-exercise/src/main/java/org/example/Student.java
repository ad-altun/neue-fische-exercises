package org.example;

public class Student extends Course {
    // properties - fields
    private String firstName;
    private String lastName;
    private String studentId;

    // org.example.Student class constructor
    public Student(String firstName, String lastName, String studentID){
        this.firstName = firstName;
        this.lastName = lastName;
        this.studentId = studentID;
    }

    // getters and setters
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    // Bonus task
    public void addCourse(String courseName) {
        this.setCourseName(courseName);
    }

    // override the toString() method
    @Override
    public String toString() {
        return
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", studentId='" + studentId + '\'';
    }
}
