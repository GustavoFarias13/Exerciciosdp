package com.gustavofarias.exerciciosdp.singleton.game;

public class GameSession {

    private static GameSession instance;

    private int score;
    private int level;
    private int lives;

    private GameSession() {
        this.score = 0;
        this.level = 1;
        this.lives = 3;
    }

    // Pedi ajuda ao GPT para mostrar como fazer synchronized
    public static GameSession getInstance() {
        if (instance == null) {
            synchronized (GameSession.class) {
                if (instance == null) {
                    instance = new GameSession();
                }
            }
        }
        return instance;
    }

    // Métodos de atualização do estado
    public synchronized void addScore(int points) {
        this.score += points;
    }

    public synchronized void nextLevel() {
        this.level++;
    }

    public synchronized void loseLife() {
        if (lives > 0) {
            this.lives--;
        }
    }

    public synchronized void resetGame() {
        this.score = 0;
        this.level = 1;
        this.lives = 3;
    }

    public synchronized int getScore() {
        return score;
    }

    public synchronized int getLevel() {
        return level;
    }

    public synchronized int getLives() {
        return lives;
    }

    public synchronized void printStatus() {
        System.out.println("=== ESTADO DO JOGO ===");
        System.out.println("Pontuação: " + score);
        System.out.println("Nível: " + level);
        System.out.println("Vidas: " + lives);
    }
}

