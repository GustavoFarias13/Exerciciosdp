package com.gustavofarias.exerciciosdp.adapter.bankcardreader;

public class CardReaderMain {
    public static void main(String[] args) {
        CardReader reader1 = new OldCardReaderAdapter(new OldCardReader());
        CardReader reader2 = new ChipCardReaderAdapter(new ChipCardReader());

        reader1.readData("1234 5678 9012 3456");
        reader2.readData("CHIP-9876-5432-1012");
    }
}
