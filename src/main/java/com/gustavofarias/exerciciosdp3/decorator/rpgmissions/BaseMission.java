package com.gustavofarias.exerciciosdp3.decorator.rpgmissions;

public class BaseMission implements Mission {
    private String description;
    private double reward;

    public BaseMission(String description, double reward) {
        this.description = description;
        this.reward = reward;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public double getReward() {
        return reward;
    }
}
