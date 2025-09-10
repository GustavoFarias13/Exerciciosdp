package com.gustavofarias.exerciciosopcionais.factory.paymentgateways;

public class Pix implements Payment{
    @Override
    public void processPayment(double amount) {
        System.out.println("Pix processou R$" + amount + " (expira em 30 min)");
    }
}
