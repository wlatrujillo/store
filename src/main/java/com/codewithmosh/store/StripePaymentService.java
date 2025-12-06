package com.codewithmosh.store;

public class StripePaymentService implements PaymentService {
    @Override
    public void processPayment(double amount){
        System.out.println("Payment processed stripe successfully");
        System.out.println("Processing payment of " + amount);

    }
}
