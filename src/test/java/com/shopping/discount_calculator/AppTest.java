package com.shopping.discount_calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class AppTest {

    @Test
    void test10PercentDiscount() {
        assertEquals(900.0, App.calculateFinalAmount(1000, 10));
    }

    @Test
    void test20PercentDiscount() {
        assertEquals(800.0, App.calculateFinalAmount(1000, 20));
    }

    @Test
    void test50PercentDiscount() {
        assertEquals(500.0, App.calculateFinalAmount(1000, 50));
    }

    @Test
    void testNoDiscount() {
        assertEquals(1000.0, App.calculateFinalAmount(1000, 0));
    }

    @Test
    void testDifferentBill() {
        assertEquals(1800.0, App.calculateFinalAmount(2000, 10));
    }
}