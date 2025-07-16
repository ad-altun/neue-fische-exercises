package org.example;

import java.util.List;
import java.util.Optional;

public record Order(
        String id,
        List<Product> products,
        OrderStatus orderStatus) {
}
