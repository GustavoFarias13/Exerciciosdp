package com.gustavofarias.exerciciosopcionais.factory.paymentgateways;

public class Boleto implements Payment{
    @Override
    public void processPayment(double amount) {
        String code = String.valueOf((int)(Math.random()*1000000000));
        System.out.println("Boleto gerado no valor R$" + amount + " com código: " + code);
    }
}
