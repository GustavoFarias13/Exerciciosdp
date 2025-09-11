package com.gustavofarias.exerciciosdp3.decorator.rpgmissions;

public class MainRPG {
    public static void main(String[] args) {
        Mission baseMission = new BaseMission("Derrotar o dragão", 1000);

        // Missão só noturna
        Mission nightMission = new NightMission(baseMission);

        // Missão hardcore + restrição de tempo
        Mission hardcoreTimedMission = new TimedMission(new HardcoreMission(baseMission));

        // Missão com os três modificadores
        Mission fullMission = new TimedMission(new HardcoreMission(new NightMission(baseMission)));

        // Testando
        System.out.println(nightMission.getDescription() + " - Recompensa: " + nightMission.getReward());
        System.out.println(hardcoreTimedMission.getDescription() + " - Recompensa: " + hardcoreTimedMission.getReward());
        System.out.println(fullMission.getDescription() + " - Recompensa: " + fullMission.getReward());
    }
}
