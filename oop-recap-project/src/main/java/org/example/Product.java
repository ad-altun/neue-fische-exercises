package org.example;

public record Product(String productId, String productName) {
    @Override
    public String toString() {
        return "Product-ID: " + productId +
                "  ---  Product Name: " + productName;
    }
}
