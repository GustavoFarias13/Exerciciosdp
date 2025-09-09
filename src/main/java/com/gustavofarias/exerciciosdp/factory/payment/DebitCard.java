package com.gustavofarias.exerciciosdp.factory.payment;

public class DebitCard implements Payment {

    @Override
    public void makePayment(double value) {
        System.out.println("Pagamento de R$" + value + " realizado no Cartão de Débito.");
    }
}
