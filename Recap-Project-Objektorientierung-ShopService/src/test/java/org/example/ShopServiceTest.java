package org.example;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class ShopServiceTest {

    @Test
    void addOrderTest() {
        //GIVEN
        ShopService shopService = new ShopService();
        List<String> productsIds = List.of("1");

        //WHEN
        Order actual = shopService.addOrder(productsIds);

        //THEN
        Order expected = new Order("-1", List.of(Optional.of(new Product("1", "Apfel"))), OrderStatus.PROCESSING);
        assertEquals(expected.products(), actual.products());
        assertNotNull(expected.id());
    }

    @Test
    void addOrderTest_whenInvalidProductId_expectNull() {
        //GIVEN
        ShopService shopService = new ShopService();
        List<String> productsIds = List.of("1", "2");

        //WHEN
        Order actual = shopService.addOrder(productsIds);

        //THEN
        assertNull(actual);
    }

    @Test
    void getOrderByStatus_whenCalledWithStatusProcessing_expectOrdersWithStatusProcessing() {
        // given
        ShopService shopService = new ShopService();
        OrderListRepo orderListRepo = new OrderListRepo();

        // when
        List<Order> actual = shopService.getOrdersByStatus(OrderStatus.PROCESSING);

        List<Order> expected = orderListRepo.getOrders().stream()
                .filter(order -> order.orderStatus() == OrderStatus.PROCESSING)
                .toList();

        // then
        assertEquals(actual,expected);
    }
}
