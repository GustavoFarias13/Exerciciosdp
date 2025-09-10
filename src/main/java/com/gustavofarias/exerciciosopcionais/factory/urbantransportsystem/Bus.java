package com.gustavofarias.exerciciosopcionais.factory.urbantransportsystem;

public class Bus implements Transport {
    private int capacity = 40;
    private String route = "Rota fixa";

    @Override
    public void startTransport() {
        System.out.println("Ônibus iniciado. Capacidade: " + capacity + ", " + route);
    }
}
