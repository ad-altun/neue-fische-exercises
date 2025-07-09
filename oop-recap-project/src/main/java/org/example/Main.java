package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println();
        System.out.println();

        Product product = new Product("prd-221", "product-221");

        List<Product> productList = new ArrayList<>();

        ProductRepo productRepo = new ProductRepo();

        productRepo.addProductToList(product,productList);
        productRepo.addProductToList(product,productList);
        productRepo.addProductToList(product,productList);

        System.out.println(productRepo.getProduct());
        System.out.println();
        System.out.println(productRepo.getProductList());


//        System.out.println("Product is added..." + productRepo.getProductList());

//        productRepo.removeProductFromList(product,productList);

//        System.out.println("Product is removed..." + productRepo.getProductList());

    }
}