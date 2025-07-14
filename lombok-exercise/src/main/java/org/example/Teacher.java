package org.example;

import lombok.With;

@With
public record Teacher(String id, String name, String subject) {
}
