package com.gustavofarias.exerciciosdp.factory.electricvehicle;

public class ElectricScooter implements ElectricVehicle {

    @Override
    public void charge() {
        System.out.println("Carregando Patinete Elétrico...");
    }
}
