package org.example;

import java.util.ArrayList;
import java.util.List;

public class OrderListRepo {
    private List<Order> orders = new ArrayList<>();


    public List<Order> getOrder() {
        return orders;
    }

    public Order getOrderById(String orderId) {
        for ( Order order : orders) {
            if ( order.orderId().equals(orderId)) {
                return order;
            }
        }
        return null;
    }

    public void addOrder (Order newOrder) {
        orders.add(newOrder);
    }

    public void removeOrder(String orderId) {
        orders.removeIf( order -> order.orderId().equals(orderId) );
    }

}
