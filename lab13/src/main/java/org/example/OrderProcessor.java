package org.example;

import java.util.List;

public class OrderProcessor {

    public void processOrder(String orderId, List<String> items) {
        if (orderId == null || orderId.trim().isEmpty()) {
            System.out.println("Invalid order ID.");
            return;
        }

        if (items == null || items.isEmpty()) {
            System.out.println("Order must contain at least one item.");
            return;
        }

        System.out.println("Processing order: " + orderId);

        for (String item : items) {
            if (item == null || item.trim().isEmpty()) {
                System.out.println("Invalid item in the order.");
                continue; // Skip this item instead of crashing
            }
            System.out.println("Valid item: " + item);
        }
    }
}
