package com.gustavofarias.exerciciosopcionais.factory.reportgenerator;

public class MainReport {
    public static void main(String[] args) {
        Report r1 = ReportFactory.getReport("pdf");
        r1.generate("Relatório 2025", "Conteúdo do relatório", "Rodapé");

        Report r2 = ReportFactory.getReport("html");
        r2.generate("Relatório 2025", "Conteúdo do relatório", "Rodapé");

        Report r3 = ReportFactory.getReport("excel");
        r3.generate("Relatório 2025", "Conteúdo do relatório", "Rodapé");
    }
}
