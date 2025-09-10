package com.gustavofarias.exerciciosopcionais.adapter.legacydatabase;

public interface Repository {
    void save(String data);
    String fetch(String id);
}
