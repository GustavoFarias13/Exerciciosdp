package com.gustavofarias.exerciciosdp.singleton.logger;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class LoggerGlobal {

    private static LoggerGlobal instance;

    private final List<String> logs;

    private LoggerGlobal() {
        logs = new ArrayList<>();
    }

    public static LoggerGlobal getInstance() {
        if (instance == null) {
            instance = new LoggerGlobal();
        }
        return instance;
    }

    public void addLog(String message) {
        var log = LocalDateTime.now() + " - " + message;
        logs.add(log);
    }

    public void printLogs() {
        if (logs.isEmpty()) {
            System.out.println("Nenhum log disponível.");
            return;
        }
        System.out.println("=== LOGS DO SISTEMA ===");
        logs.forEach(System.out::println);
    }
}
