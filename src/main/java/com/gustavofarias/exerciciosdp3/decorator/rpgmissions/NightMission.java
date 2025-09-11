package com.gustavofarias.exerciciosdp3.decorator.rpgmissions;

public class NightMission extends MissionDecorator {
    public NightMission(Mission decoratedMission) {
        super(decoratedMission);
    }

    @Override
    public String getDescription() {
        return decoratedMission.getDescription() + " [Missão Noturna]";
    }

    @Override
    public double getReward() {
        return decoratedMission.getReward() * 1.10;
    }
}
