package com.gustavofarias.exerciciosdp.factory.electricvehicle;

public class ElectricCar implements ElectricVehicle {

    @Override
    public void charge() {
        System.out.println("Carregando Carro Elétrico...");
    }
}
