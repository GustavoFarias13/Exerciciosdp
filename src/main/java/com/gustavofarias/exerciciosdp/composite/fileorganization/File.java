package com.gustavofarias.exerciciosdp.composite.fileorganization;

public class File implements SystemItem {
    private String name;

    public File(String name) {
        this.name = name;
    }

    @Override
    public void show() {
        System.out.println("Arquivo: " + name);
    }
}
