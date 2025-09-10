package com.gustavofarias.exerciciosdp.adapter.printers;

public class PrintersMain {
    public static void main(String[] args) {
        OldPrinter oldPrinter = new OldPrinter();
        NewPrinter printer = new PrintAdapter(oldPrinter);

        printer.printDocument("Relatório de vendas 2025");
    }
}
