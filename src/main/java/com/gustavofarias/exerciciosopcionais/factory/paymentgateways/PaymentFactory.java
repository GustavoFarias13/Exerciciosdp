package com.gustavofarias.exerciciosopcionais.factory.paymentgateways;

public class PaymentFactory {
    public static Payment getPayment(String type) {
        return switch (type.toLowerCase()) {
            case "paypal" -> new Paypal();
            case "stripe" -> new Stripe();
            case "pix" -> new Pix();
            case "boleto" -> new Boleto();
            default -> throw new IllegalArgumentException("Pagamento desconhecido");
        };
    }
}
