package com.gustavofarias.exerciciosdp.factory.electricvehicle;

public class ElectricVehicleFactory {
    public static ElectricVehicle createVehicle(String type) {
        return switch (type.toLowerCase()) {
            case "carro" -> new ElectricCar();
            case "moto" -> new ElectricMotorcycle();
            case "patinete" -> new ElectricScooter();
            default -> throw new IllegalArgumentException("Tipo de veículo inválido: " + type);
        };
    }
}
