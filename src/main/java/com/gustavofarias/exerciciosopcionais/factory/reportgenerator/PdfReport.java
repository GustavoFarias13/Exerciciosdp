package com.gustavofarias.exerciciosopcionais.factory.reportgenerator;

public class PdfReport implements Report {
    @Override
    public void generate(String header, String content, String footer) {
        System.out.println("PDF gerado (binário simulado): [" + header + "|" + content + "|" + footer + "]");
    }
}
