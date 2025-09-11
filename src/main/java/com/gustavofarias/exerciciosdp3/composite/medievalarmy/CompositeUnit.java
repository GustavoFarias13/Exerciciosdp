package com.gustavofarias.exerciciosdp3.composite.medievalarmy;

import java.util.ArrayList;
import java.util.List;

public class CompositeUnit implements Unit {
    private String name;
    private List<Unit> units = new ArrayList<>();

    public CompositeUnit(String name) {
        this.name = name;
    }

    public void add(Unit unit) {
        units.add(unit);
    }

    public void remove(Unit unit) {
        units.remove(unit);
    }

    @Override
    public int getAttackPower() {
        int total = 0;
        for (Unit u : units) {
            total += u.getAttackPower();
        }
        return total;
    }

    @Override
    public String toString() {
        return name + " (Poder total: " + getAttackPower() + ")";
    }
}
