package com.gustavofarias.exerciciosdp.factory.electricvehicle;

public class ElectricMotorcycle implements ElectricVehicle {

    @Override
    public void charge() {
        System.out.println("Carregando Moto Elétrica...");
    }
}
