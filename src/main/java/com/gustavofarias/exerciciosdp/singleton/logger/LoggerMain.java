package com.gustavofarias.exerciciosdp.singleton.logger;

public class LoggerMain {
    public static void main(String[] args) {
        LoggerGlobal logger = LoggerGlobal.getInstance();

        logger.addLog("Sistema iniciado.");
        logger.addLog("Usuário logado com sucesso.");
        logger.addLog("Erro ao conectar ao banco de dados.");

        logger.printLogs();
    }
}
