package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class ShopService {
    private ProductRepo productRepo = new ProductRepo();
    private OrderRepo orderRepo = new OrderMapRepo();
    private OrderListRepo orderListRepo = new OrderListRepo();

    public Order addOrder(List<String> productIds) throws NullPointerException {
        List<Product> products = new ArrayList<>();

            for (String productId : productIds) {
                Product productToOrder = productRepo.getProductById(productId)
                        .orElseThrow(NullPointerException::new);
                products.add(productToOrder);
            }

            Order newOrder = new Order(UUID.randomUUID().toString(), products, OrderStatus.PROCESSING);

            return orderRepo.addOrder(newOrder);
    }

    public List<Order> getOrdersByStatus(OrderStatus orderStatus) {
        return orderListRepo.getOrders().stream()
                .filter(order -> order.orderStatus() == orderStatus)
                .toList();
    }
}
