package com.gustavofarias.exerciciosopcionais.factory.urbantransportsystem;

public class MainTransport {
    public static void main(String[] args) {
        Transport t1 = TransportFactory.getTransport(12, 15);
        t1.startTransport();

        Transport t2 = TransportFactory.getTransport(5, 25);
        t2.startTransport();

        Transport t3 = TransportFactory.getTransport(3, 10);
        t3.startTransport();
    }
}
