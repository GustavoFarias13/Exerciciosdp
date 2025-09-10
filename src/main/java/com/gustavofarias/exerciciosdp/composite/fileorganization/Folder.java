package com.gustavofarias.exerciciosdp.composite.fileorganization;

import java.util.ArrayList;
import java.util.List;

public class Folder implements SystemItem {
    private String name;
    private List<SystemItem> items;

    public Folder(String name) {
        this.name = name;
        this.items = new ArrayList<>();
    }

    public void add(SystemItem item) {
        items.add(item);
    }

    @Override
    public void show() {
        System.out.println("Pasta: " + name);
        for (SystemItem item : items) {
            item.show();
        }
    }
}
