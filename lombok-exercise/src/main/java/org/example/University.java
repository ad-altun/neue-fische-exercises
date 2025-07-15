package org.example;

import lombok.Builder;
import lombok.With;

@Builder
@With
public record University(String id, String name, Course[] courses) {
}
