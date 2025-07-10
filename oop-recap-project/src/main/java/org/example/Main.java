package org.example;

import java.util.*;


// to-dos:
// 1. place and order - check if the product exist. if not, output a message
// 2.

public class Main {
    public static ProductRepo productRepo = new ProductRepo();
    public static OrderRepoInterface orderRepo = new OrderListRepo();

    public static void main(String[] args) {
        System.out.println();
        System.out.println();

        // define products
        /*      ********************************************************      */
        Product product1 = new Product("p-201", "product-201");
        Product product2 = new Product("p-202", "product-202");
        Product product3 = new Product("p-301", "product-301");
        Product product4 = new Product("p-401", "product-401");
        Product product5 = new Product("p-407", "product-407");
        /*      ********************************************************      */


        // add Product to the product repo
        /*      ********************************************************      */
        productRepo.addProduct(product1);
        productRepo.addProduct(product2);
        productRepo.addProduct(product3);
        productRepo.addProduct(product4);
        productRepo.addProduct(product5);
        productRepo.addProduct(new Product("test-id", "test-product"));
        /*      ********************************************************      */


        // get all products - create productList from product repo
        /*      ********************************************************      */
        List<Product> productList = productRepo.getProducts();

        // get all products from the product repo
        System.out.println("Available products: ");
        for (Product product : productList) {
            System.out.println(
                    "Product-ID: " + product.productId() + " - Product Name: " + product.productName());
        }
        System.out.println();

        /*      ********************************************************      */


        // remove product
        /*      ********************************************************      */
        boolean productRemoved = productRepo.removeProduct("test-id");
        if (productRemoved) System.out.println("Product removed successfully.");
        else System.out.println("Product couldn't be removed. Please check the given product ID.");
        /*      ********************************************************      */


        // create orders
        /*      ********************************************************      */
        Order order1 = new Order("o-1001",
                new ArrayList<Product>(Arrays.asList(product1, product2)));
        Order order2 = new Order("o-1002",
                new ArrayList<Product>(Arrays.asList(product5, product3)));
        Order order3 = new Order("o-1003",
                new ArrayList<Product>(Arrays.asList(product4, product2)));
        Order order4 = new Order("o-1004",
                new ArrayList<Product>(Arrays.asList(product2, product5)));
        /*      ********************************************************      */


        // create an ShopService object and
        // add and order
        /*      ********************************************************      */
        System.out.println();
        ShopService shopService = new ShopService(orderRepo, productRepo);

        shopService.createOrder(new ArrayList<>(List.of("p-202", "araba", "car")));
        System.out.println(orderRepo.getAllOrders());
        System.out.println();
        /*      ********************************************************      */



        /*      ********************************************************      */

        /*      ********************************************************      */

        /*      ********************************************************      */
        /*      ********************************************************      */

    }

    public Order makeOrder() {


        return null;
    }

}