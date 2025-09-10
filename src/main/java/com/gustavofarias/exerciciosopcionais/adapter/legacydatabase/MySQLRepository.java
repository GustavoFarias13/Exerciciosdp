package com.gustavofarias.exerciciosopcionais.adapter.legacydatabase;

public class MySQLRepository implements Repository {
    @Override
    public void save(String data) {
        System.out.println("MySQL salvando: " + data);
    }

    @Override
    public String fetch(String id) {
        return "MySQL dados para id " + id;
    }
}
