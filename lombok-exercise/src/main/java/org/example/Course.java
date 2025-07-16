package org.example;

import lombok.*;

@Data
@Builder
@Value public class Course {
    String id;
    String name;
    String teacher;
    Student[] students;
}
