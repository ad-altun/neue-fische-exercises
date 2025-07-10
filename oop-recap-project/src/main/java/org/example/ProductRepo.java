package org.example;

import java.util.*;

public class ProductRepo {
    private List<Product> products = new ArrayList<>();

    @Override
    public String toString() {
        return "ProductRepo{" +
                "products=" + products +
                '}';
    }

    // get all products
    public List<Product> getProducts() {
        return products;
    }

    // get single product
    public Product getProductById(String productId) {
        for ( Product product : products ) {
            if ( productId.equals(product.productId())) {
                return product;
            }
        }
        return null;
    }

    // add new product to the products list
    public void addProduct(Product newProduct) {
        products.add(newProduct);
    }

    // remove single product from the products list
    public boolean removeProduct(String productId) {
        return products.removeIf(product -> productId.equals(product.productId()));
    }

}
