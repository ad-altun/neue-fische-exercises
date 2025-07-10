package org.example;

import java.util.List;

public record Order(String orderId, List<Product> productsInOrder) {
    @Override
    public String toString() {
        return "Order{" +
                "orderId='" + orderId + '\'' +
                ", productsInOrder=" + productsInOrder +
                '}';
    }
}
