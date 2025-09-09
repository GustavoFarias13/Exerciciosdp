package com.gustavofarias.exerciciosdp.factory.payment;

public class PaymentFactory {
    public static Payment createPayment(String type) {
        return switch (type.toLowerCase()) {
            case "credito" -> new CreditCard();
            case "debito" -> new DebitCard();
            case "boleto" -> new Ticket();
            default -> throw new IllegalArgumentException("Tipo de pagamento inválido: " + type);
        };
    }
}
