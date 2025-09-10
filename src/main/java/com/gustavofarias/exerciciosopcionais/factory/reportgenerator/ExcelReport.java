package com.gustavofarias.exerciciosopcionais.factory.reportgenerator;

public class ExcelReport implements Report {
    @Override
    public void generate(String header, String content, String footer) {
        System.out.println("Excel gerado: " + header + " | " + content + " | " + footer);
    }
}
