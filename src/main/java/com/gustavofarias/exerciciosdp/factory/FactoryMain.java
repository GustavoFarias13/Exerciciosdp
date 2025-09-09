package com.gustavofarias.exerciciosdp.factory;

import com.gustavofarias.exerciciosdp.factory.digitaldocument.DigitalDocument;
import com.gustavofarias.exerciciosdp.factory.digitaldocument.DigitalDocumentFactory;
import com.gustavofarias.exerciciosdp.factory.electricvehicle.ElectricVehicle;
import com.gustavofarias.exerciciosdp.factory.electricvehicle.ElectricVehicleFactory;
import com.gustavofarias.exerciciosdp.factory.payment.Payment;
import com.gustavofarias.exerciciosdp.factory.payment.PaymentFactory;

public class FactoryMain {
    public static void main(String[] args) {
        // Veículos
        ElectricVehicle vehicle = ElectricVehicleFactory.createVehicle("moto");
        vehicle.charge();

        // Pagamentos
        Payment payment = PaymentFactory.createPayment("boleto");
        payment.makePayment(250.0);

        // Documentos
        DigitalDocument document = DigitalDocumentFactory.createDigitalDocument("contrato");
        document.sign();
    }
}
