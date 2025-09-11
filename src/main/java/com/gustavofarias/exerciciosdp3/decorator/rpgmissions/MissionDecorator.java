package com.gustavofarias.exerciciosdp3.decorator.rpgmissions;

public abstract class MissionDecorator implements Mission {
    protected Mission decoratedMission;

    public MissionDecorator(Mission decoratedMission) {
        this.decoratedMission = decoratedMission;
    }

    @Override
    public String getDescription() {
        return decoratedMission.getDescription();
    }

    @Override
    public double getReward() {
        return decoratedMission.getReward();
    }
}
