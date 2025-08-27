package com.example.usedocker.service;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class OrderServiceTest {

    @Test
    void testCalculateTotal_ok() {
        OrderService orderService = new OrderService();
        assertEquals(150, orderService.calculateTotal(50, 3));
    }

    @Test
    void testCalculateTotal_invalidArgs() {
        OrderService orderService = new OrderService();
        assertThrows(IllegalArgumentException.class,
                () -> orderService.calculateTotal(-1, 2));
    }
}