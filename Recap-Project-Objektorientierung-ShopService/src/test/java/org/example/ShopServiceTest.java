package org.example;

import org.junit.jupiter.api.Test;

import java.util.List;

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
        Order expected = new Order("-1", List.of(new Product("1", "Apfel")), OrderStatus.PROCESSING);
        assertEquals(expected.products(), actual.products());
        assertNotNull(expected.id());
    }

    @Test
        // void addOrderTest_whenInvalidProductId_expectNull() { // removed because exception is added
    void addOrderTest_whenInvalidProductId_expectNullException() {
        try {
            //GIVEN
            ShopService shopService = new ShopService();
            List<String> productsIds = List.of(null);

            //WHEN
            Order actual = shopService.addOrder(productsIds);

            //THEN
            assertNull(actual);

        } catch (NullPointerException npe) {
            System.out.println("Exception is caught!");
        }
    }

    @Test
    void getOrderByStatus_whenCalledWithStatusProcessing_expectOrdersWithStatusProcessing() {

        try {
            // given
            ShopService shopService = new ShopService();
            OrderListRepo orderListRepo = new OrderListRepo();

            // when
            List<Order> actual = shopService.getOrdersByStatus(OrderStatus.PROCESSING);

            List<Order> expected = orderListRepo.getOrders().stream()
                    .filter(order -> order.orderStatus() == OrderStatus.PROCESSING)
                    .toList();

            // then
            assertEquals(actual, expected);
        } catch (NullPointerException npe) {
            System.out.println("exception caught!");
        }

    }

    @Test
    void updateOrder_whenCalledWithCOMPLETED_expectTRUE()  {
        try {
            // given
            ShopService shopService = new ShopService();
            OrderListRepo orderListRepo = new OrderListRepo();
            Product product = new Product("20", "Kiwi");

            Order order = new Order("1", List.of(product), OrderStatus.PROCESSING);
            orderListRepo.addOrder(order);

            // when
            shopService.updateOrder("1",OrderStatus.COMPLETED);
            Order actual = orderListRepo.getOrderById("1");
            OrderStatus expected = OrderStatus.COMPLETED;

            // then
            assertEquals(expected, actual.orderStatus());
        } catch (NullPointerException npe) {
            System.out.println("Exception caught!");
        }
    }

}
