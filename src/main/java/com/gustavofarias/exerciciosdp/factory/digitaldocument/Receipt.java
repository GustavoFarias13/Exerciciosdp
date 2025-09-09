package com.gustavofarias.exerciciosdp.factory.digitaldocument;

public class Receipt implements DigitalDocument {

    @Override
    public void sign() {
        System.out.println("Recibo assinado digitalmente.");
    }
}
