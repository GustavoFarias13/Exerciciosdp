package com.gustavofarias.exerciciosopcionais.factory.urbantransportsystem;

public class ElectricScooter implements Transport {
    private double pricePerMinute = 0.50;
    private int batteryLimit = 100; // %

    @Override
    public void startTransport() {
        System.out.println("Patinete elétrico iniciado. Cobrança por minuto: R$" + pricePerMinute + ", Bateria: " + batteryLimit + "%");
    }
}
