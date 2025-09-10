package com.gustavofarias.exerciciosdp.adapter.bankcardreader;

public class OldCardReaderAdapter implements CardReader {
    private OldCardReader oldCardReader;

    public OldCardReaderAdapter(OldCardReader oldCardReader) {
        this.oldCardReader = oldCardReader;
    }

    @Override
    public void readData(String data) {
        System.out.println("Adaptador do leitor antigo processando dados...");
        oldCardReader.readMagneticStripe(data);
    }
}
