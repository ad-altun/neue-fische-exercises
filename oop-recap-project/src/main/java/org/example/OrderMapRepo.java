package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OrderMapRepo implements OrderRepoInterface {
    private Map<String, Order> orders = new HashMap<>();

    @Override
    public List<Order> getAllOrders() {
        return new ArrayList<>(orders.values());
    }

    @Override
    public Order getOrderById(String orderId) {
        return orders.get(orderId);
    }

    @Override
    public void addOrder(Order newOrder) {
        orders.put(newOrder.orderId(), newOrder);
    }

    @Override
    public void removeOrder(String orderId) {
        orders.remove(orderId);
    }
}
