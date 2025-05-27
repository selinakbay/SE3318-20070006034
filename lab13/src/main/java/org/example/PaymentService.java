package org.example;

public class PaymentService {

    public void processPayment(String method, double amount, String currency) {
        if (method == null || method.trim().isEmpty()) {
            System.out.println("Payment method is required.");
            return;
        }

        if (amount <= 0) {
            System.out.println("Amount must be greater than zero.");
            return;
        }

        if (currency == null || currency.length() != 3) {
            System.out.println("Invalid currency code.");
            return;
        }

        System.out.println("Processing " + currency + " " + amount + " via " + method);
    }
}
