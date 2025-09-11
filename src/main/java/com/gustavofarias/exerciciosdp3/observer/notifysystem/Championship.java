package com.gustavofarias.exerciciosdp3.observer.notifysystem;

import java.util.ArrayList;
import java.util.List;

public class Championship {
    private List<Team> teams = new ArrayList<>();

    public void registerTeam(Team team) {
        teams.add(team);
        System.out.println("Time registrado no campeonato: " + ((FootballTeam) team).toString());
    }

    public void removeTeam(Team team) {
        teams.remove(team);
        System.out.println("Time removido do campeonato: " + ((FootballTeam) team).toString());
    }

    public void notifyTeams(String message) {
        for (Team team : teams) {
            team.update(message);
        }
    }

    public void scheduleMatch(String teamA, String teamB) {
        String msg = "Partida marcada entre " + teamA + " e " + teamB;
        notifyTeams(msg);
    }

    public void publishResult(String teamA, String teamB, String result) {
        String msg = "Resultado publicado: " + teamA + " vs " + teamB + " => " + result;
        notifyTeams(msg);
    }
}
