package com.gustavofarias.exerciciosopcionais.factory.paymentgateways;

public class Paypal implements Payment{
    @Override
    public void processPayment(double amount) {
        double fee = amount * 0.05;
        System.out.println("Paypal processou R$" + amount + " com taxa de R$" + fee);
    }
}
