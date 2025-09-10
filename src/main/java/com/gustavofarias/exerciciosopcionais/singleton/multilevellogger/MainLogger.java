package com.gustavofarias.exerciciosopcionais.singleton.multilevellogger;

public class MainLogger {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        logger.configure(true, false, false); // Desativa WARN

        logger.log(Level.INFO, "Sistema iniciado");
        logger.log(Level.WARN, "Aviso ignorado");
        logger.log(Level.ERROR, "Erro crítico!");
    }
}
