package com.gustavofarias.exerciciosdp.factory.digitaldocument;

public class Invoice implements DigitalDocument {

    @Override
    public void sign() {
        System.out.println("Nota Fiscal assinada digitalmente.");
    }
}
