package org.example;

import lombok.*;

@Data
@Builder
public class Course {
    private String id;
    private String name;
    private String teacher;
    private Student[] students;
}
