package com.gustavofarias.exerciciosdp3.decorator.rpgmissions;

public class TimedMission extends MissionDecorator {
    public TimedMission(Mission decoratedMission) {
        super(decoratedMission);
    }

    @Override
    public String getDescription() {
        return decoratedMission.getDescription() + " [Restrição de Tempo]";
    }

    @Override
    public double getReward() {
        return decoratedMission.getReward() * 1.20;
    }
}
