package org.example;

import lombok.*;

@Getter
@Setter
@EqualsAndHashCode
@ToString
@AllArgsConstructor
public class Course {
    private String id;
    private String name;
    private String teacher;
    private Student[] students;
}
