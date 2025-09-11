package com.gustavofarias.exerciciosdp3.decorator.rpgmissions;

public class HardcoreMission extends MissionDecorator {
    public HardcoreMission(Mission decoratedMission) {
        super(decoratedMission);
    }

    @Override
    public String getDescription() {
        return decoratedMission.getDescription() + " [Modo Hardcore]";
    }

    @Override
    public double getReward() {
        return decoratedMission.getReward() * 1.50;
    }
}
