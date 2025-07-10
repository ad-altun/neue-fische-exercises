package org.example;

import java.util.List;

public interface OrderRepoInterface {

    List<Order> getAllOrders();

    Order getOrderById(String orderId);

    void addOrder(Order newOrder);

    void removeOrder(String orderId);

}
