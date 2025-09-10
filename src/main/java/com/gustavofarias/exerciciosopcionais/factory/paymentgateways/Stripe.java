package com.gustavofarias.exerciciosopcionais.factory.paymentgateways;

public class Stripe implements Payment{
    @Override
    public void processPayment(double amount) {
        System.out.println("Stripe processou R$" + amount);
    }
}
