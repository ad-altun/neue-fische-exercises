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
        List<Product> orderedProducts = new ArrayList<>();

        for ( String productId : productIds) {
            if (productRepo.getProductById(productId) == null) {
                System.out.println("Product is out of stock (Product ID: " +
                        productId + " )");
            } else {
                Order newOrder = new Order("o-" + UUID.randomUUID().toString().substring(0,4),
                        orderedProducts);
                orderRepoInterface.addOrder(newOrder);
                System.out.println("Order is added successfully.");
                System.out.println();

                for ( Product product : productRepo.getProducts()) {
                    if(product.productId().equals(productId)) {
                        orderedProducts.add(product);
                    }
                }
                orderAddSuccessful = true;
            }
        }
        return orderAddSuccessful;
    }

}
