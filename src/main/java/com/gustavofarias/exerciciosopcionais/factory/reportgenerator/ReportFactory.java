package com.gustavofarias.exerciciosopcionais.factory.reportgenerator;

public class ReportFactory {
    public static Report getReport(String type) {
        return switch (type.toLowerCase()) {
            case "pdf" -> new PdfReport();
            case "html" -> new HtmlReport();
            case "excel" -> new ExcelReport();
            default -> throw new IllegalArgumentException("Formato desconhecido");
        };
    }
}
