package com.gustavofarias.exerciciosdp3.composite.medievalarmy;

public class Soldier implements Unit{
    private String name;
    private int attackPower;

    public Soldier(String name, int attackPower) {
        this.name = name;
        this.attackPower = attackPower;
    }

    @Override
    public int getAttackPower() {
        return attackPower;
    }

    @Override
    public String toString() {
        return "Soldado " + name + " (Poder: " + attackPower + ")";
    }
}
