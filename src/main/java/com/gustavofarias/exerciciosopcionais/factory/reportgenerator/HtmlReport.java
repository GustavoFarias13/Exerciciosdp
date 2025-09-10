package com.gustavofarias.exerciciosopcionais.factory.reportgenerator;

public class HtmlReport implements Report {
    @Override
    public void generate(String header, String content, String footer) {
        System.out.println("<html><body><h1>" + header + "</h1><p>" + content + "</p><footer>" + footer + "</footer></body></html>");
    }
}
