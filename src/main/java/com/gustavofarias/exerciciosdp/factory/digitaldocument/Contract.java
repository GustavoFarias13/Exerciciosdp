package com.gustavofarias.exerciciosdp.factory.digitaldocument;

public class Contract implements DigitalDocument {

    @Override
    public void sign() {
        System.out.println("Contrato assinado digitalmente.");
    }
}
