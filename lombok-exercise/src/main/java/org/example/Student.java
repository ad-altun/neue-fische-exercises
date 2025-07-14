package org.example;

import lombok.*;

@Getter
@Setter
@EqualsAndHashCode
@ToString
@AllArgsConstructor
public class Student {
    private String id;
    private String name;
    private String address;
    private String grade;
}
