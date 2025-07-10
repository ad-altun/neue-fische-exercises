package org.example;

import java.util.*;

public class ShopService {
    private final OrderRepoInterface orderRepoInterface;
    private final ProductRepo productRepo;

    @Override
    public String toString() {
        return "ShopService{" +
                "orderRepoInterface=" + orderRepoInterface +
                ", productRepo=" + productRepo +
                '}';
    }

    public ShopService(OrderRepoInterface orderRepo, ProductRepo productRepo) {
        this.orderRepoInterface = orderRepo;
        this.productRepo = productRepo;
    }

    public boolean createOrder(List<String> productIds) {
        boolean orderAddSuccessful = false;
        List<Product> products = new ArrayList<>();

        System.out.println();
        System.out.println("Product IDs " + productIds);
        System.out.println();

        for ( String productId : productIds) {
            if (productRepo.getProductById(productId) == null) {
                System.out.println("Product is out of stock (Product ID: " +
                        productId + " )");
            } else {
                Order newOrder = new Order("p-" + UUID.randomUUID().toString().substring(0,3),
                        products);
                orderRepoInterface.addOrder(newOrder);
                System.out.println("Order is added successfully.");
                System.out.println();

                for ( Product prod : productRepo.getProducts()) {
                    if(prod.productId().equals(productId)) {
                        products.add(prod);
                    }
                }

                System.out.println("neworder in shop" + newOrder);
                System.out.println();
                orderAddSuccessful = true;
            }
        }
        return orderAddSuccessful;
    }

}
