package com.gustavofarias.exerciciosdp.singleton.game;

public class GameMain {
    public static void main(String[] args) {
        GameSession session = GameSession.getInstance();

        session.addScore(100);
        session.nextLevel();
        session.loseLife();

        session.printStatus();
    }
}
