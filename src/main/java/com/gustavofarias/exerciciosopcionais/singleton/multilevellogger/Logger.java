package com.gustavofarias.exerciciosopcionais.singleton.multilevellogger;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Logger {
    private static Logger instance;
    private boolean infoActive = true;
    private boolean warnActive = true;
    private boolean errorActive = true;
    private String logFile = "log.txt";

    private Logger() {}

    public static synchronized Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void configure(boolean info, boolean warn, boolean error) {
        this.infoActive = info;
        this.warnActive = warn;
        this.errorActive = error;
    }

    public void log(Level level, String message) {
        boolean active = switch (level) {
            case INFO -> infoActive;
            case WARN -> warnActive;
            case ERROR -> errorActive;
        };
        if (!active) return;

        String logMsg = level + ": " + message;
        System.out.println(logMsg); // Console
        try (PrintWriter out = new PrintWriter(new FileWriter(logFile, true))) {
            out.println(logMsg); // Arquivo
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
