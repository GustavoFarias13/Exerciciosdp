package com.gustavofarias.exerciciosdp.builder.computer;

public class ComputerMain {
    public static void main(String[] args) {
        Computer pc = new ComputerBuilder()
                .cpu("Intel Core i7")
                .ram("16GB DDR4")
                .ssd("512GB NVMe")
                .build();

        pc.showConfig();
    }
}
