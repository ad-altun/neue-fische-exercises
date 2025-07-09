package org.example;

import java.util.ArrayList;
import java.util.List;

public class OrderListRepo {
    Order order;

    // List for storing orders
    List<Order> orderList = new ArrayList<>();

    public Order getOrder() {
        return order;
    }

    public String getOrderId(Order order) {
        return order.orderId();
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public List<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(List<Order> orderList) {
        this.orderList = orderList;
    }

    public void addOrderToList(Order order, List<Order> orderList) {
        setOrder(order);
        setOrderList(orderList);
        orderList.add(order);
    }

    public void removeOrderFromList(Order order, List<Order> orderList) {
        setOrder(order);
        setOrderList(orderList);
        orderList.remove(order);
    }

}
