package com.gustavofarias.exerciciosopcionais.factory.paymentgateways;

public class MainPayment {
    public static void main(String[] args) {
        Payment p1 = PaymentFactory.getPayment("paypal");
        p1.processPayment(100);

        Payment p2 = PaymentFactory.getPayment("pix");
        p2.processPayment(50);

        Payment p3 = PaymentFactory.getPayment("boleto");
        p3.processPayment(200);

        Payment p4 = PaymentFactory.getPayment("stripe");
        p4.processPayment(150);
    }
}
