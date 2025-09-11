package com.gustavofarias.exerciciosdp3.observer.notifysystem;

public class FootballTeam implements Team {
    private String name;

    public FootballTeam(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println("Time " + name + " recebeu notificação: " + message);
    }

    @Override
    public String toString() {
        return name;
    }
}
