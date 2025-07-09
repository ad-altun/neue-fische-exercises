package org.example;

import java.util.*;

public class ShopService {
    private ProductRepo productRepo = new ProductRepo();
    private OrderListRepo orderListRepo = new OrderListRepo();


    public Order createOrder(List<String> productIds) {
        List<Product> products = new ArrayList<>();

        for ( String productId : productIds) {
            if (productRepo.getProductById(productId) == null) {
                System.out.println("Product is out of stock (Product ID: " +
                        productId + " )");
                return null;
            }
            products.add(productRepo.getProductById(productId));
        }

        Order newOrder = new Order(UUID.randomUUID().toString(), products);

       orderListRepo.addOrder(newOrder);
       return newOrder;
    }

}
