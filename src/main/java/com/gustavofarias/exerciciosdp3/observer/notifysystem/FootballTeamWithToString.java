package com.gustavofarias.exerciciosdp3.observer.notifysystem;

public class FootballTeamWithToString extends FootballTeam {
    public FootballTeamWithToString(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Time " + super.toString();
    }
}
