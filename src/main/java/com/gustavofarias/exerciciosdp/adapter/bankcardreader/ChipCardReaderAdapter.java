package com.gustavofarias.exerciciosdp.adapter.bankcardreader;

public class ChipCardReaderAdapter implements CardReader {
    private ChipCardReader chipCardReader;

    public ChipCardReaderAdapter(ChipCardReader chipCardReader) {
        this.chipCardReader = chipCardReader;
    }

    @Override
    public void readData(String data) {
        System.out.println("Adaptador do leitor de chip processando dados...");
        chipCardReader.readChip(data);
    }
}
