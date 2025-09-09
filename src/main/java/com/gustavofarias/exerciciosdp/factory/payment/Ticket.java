package com.gustavofarias.exerciciosdp.factory.payment;

public class Ticket implements Payment {

    @Override
    public void makePayment(double value) {
        System.out.println("Boleto no valor de R$" + value + " gerado.");    }
}
