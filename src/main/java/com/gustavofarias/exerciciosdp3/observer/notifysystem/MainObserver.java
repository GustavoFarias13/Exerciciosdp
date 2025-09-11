package com.gustavofarias.exerciciosdp3.observer.notifysystem;

public class MainObserver {
    public static void main(String[] args) {
        Championship championship = new Championship();

        Team team1 = new FootballTeam("Leões");
        Team team2 = new FootballTeam("Dragões");
        Team team3 = new FootballTeam("Falcões");

        // Registrar times
        championship.registerTeam(team1);
        championship.registerTeam(team2);
        championship.registerTeam(team3);

        // Marcar partida
        championship.scheduleMatch("Leões", "Dragões");

        // Publicar resultado
        championship.publishResult("Leões", "Dragões", "2 - 1");

        // Remover um time
        championship.removeTeam(team2);

        // Nova partida só com times restantes
        championship.scheduleMatch("Leões", "Falcões");
    }
}
