package com.gustavofarias.exerciciosdp.factory.digitaldocument;

public class DigitalDocumentFactory {
    public static DigitalDocument createDigitalDocument(String type) {
        return switch (type.toLowerCase()) {
            case "contrato" -> new Contract();
            case "notafiscal" -> new Invoice();
            case "recibo" -> new Receipt();
            default -> throw new IllegalArgumentException("Tipo de documento inválido: " + type);
        };
    }
}
