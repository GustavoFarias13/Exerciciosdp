package com.gustavofarias.exerciciosdp.factory.payment;

public class CreditCard implements Payment {

    @Override
    public void makePayment(double value) {
        System.out.println("Pagamento de R$" + value + " realizado no Cartão de Crédito.");
    }
}
