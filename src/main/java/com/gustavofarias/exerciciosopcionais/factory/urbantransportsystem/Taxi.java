package com.gustavofarias.exerciciosopcionais.factory.urbantransportsystem;

public class Taxi implements Transport {
    private double pricePerKm = 2.5;

    @Override
    public void startTransport() {
        System.out.println("Táxi iniciado. Cobrança por km: R$" + pricePerKm);
    }
}
