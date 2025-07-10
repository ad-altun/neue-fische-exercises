package org.example;

import java.util.ArrayList;
import java.util.List;

public class OrderListRepo implements OrderRepoInterface {
    private List<Order> orders = new ArrayList<>();

    @Override
    public String toString() {
        return "OrderListRepo{" +
                "orders=" + orders +
                '}';
    }

    @Override
    public List<Order> getAllOrders() {
        return orders;
    }

    @Override
    public Order getOrderById(String orderId) {
        for ( Order order : orders) {
            if ( order.orderId().equals(orderId)) {
                return order;
            }
        }
        return null;
    }
@Override
    public void addOrder (Order newOrder) {
        orders.add(newOrder);
    }

    @Override
    public void removeOrder(String orderId) {
        orders.removeIf( order -> order.orderId().equals(orderId) );
    }

}
