package com.gustavofarias.exerciciosdp.builder.computer;

public class Computer {
    private String cpu;
    private String gpu;
    private String ram;
    private String ssd;
    private String motherboard;
    private String cooler;

    public Computer() {}

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public void setGpu(String gpu) {
        this.gpu = gpu;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public void setSsd(String ssd) {
        this.ssd = ssd;
    }

    public void setMotherboard(String motherboard) {
        this.motherboard = motherboard;
    }

    public void setCooler(String cooler) {
        this.cooler = cooler;
    }

    public void showConfig() {
        System.out.println("=== Computador Personalizado ===");
        if (cpu != null) System.out.println("CPU: " + cpu);
        if (gpu != null) System.out.println("GPU: " + gpu);
        if (ram != null) System.out.println("RAM: " + ram);
        if (ssd != null) System.out.println("SSD: " + ssd);
        if (motherboard != null) System.out.println("Placa Mãe: " + motherboard);
        if (cooler != null) System.out.println("Cooler: " + cooler);
    }
}
