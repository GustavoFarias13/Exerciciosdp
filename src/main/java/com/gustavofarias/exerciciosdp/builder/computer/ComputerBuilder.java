package com.gustavofarias.exerciciosdp.builder.computer;

public class ComputerBuilder {
    private Computer computer;

    public ComputerBuilder () {
        this.computer = new Computer();
    }

    public ComputerBuilder cpu(String cpu) {
        computer.setCpu(cpu);
        return this;
    }

    public ComputerBuilder gpu(String gpu) {
        computer.setGpu(gpu);
        return this;
    }

    public ComputerBuilder ram(String ram) {
        computer.setRam(ram);
        return this;
    }

    public ComputerBuilder ssd(String ssd) {
        computer.setSsd(ssd);
        return this;
    }

    public ComputerBuilder motherboard(String motherboard) {
        computer.setMotherboard(motherboard);
        return this;
    }

    public ComputerBuilder cooler(String cooler) {
        computer.setCooler(cooler);
        return this;
    }

    public Computer build() {
       return computer;
    }
}

