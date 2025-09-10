package com.gustavofarias.exerciciosopcionais.factory.urbantransportsystem;

public class TransportFactory {
    public static Transport getTransport(double distance, double budget) {
        if (distance > 10) {
            return new Bus();
        } else if (budget > 20) {
            return new Taxi();
        } else {
            return new ElectricScooter();
        }
    }
}
