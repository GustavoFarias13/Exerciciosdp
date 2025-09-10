package com.gustavofarias.exerciciosdp.adapter.printers;

public class PrintAdapter implements NewPrinter {

    private OldPrinter oldPrinter;

    public PrintAdapter(OldPrinter oldPrinter) {
        this.oldPrinter = oldPrinter;
    }

    @Override
    public void printDocument(String doc) {
        System.out.println("Adaptador converteu o pedido de impressão...");
        oldPrinter.print(doc);
    }
}
