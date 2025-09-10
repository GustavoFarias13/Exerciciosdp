package com.gustavofarias.exerciciosopcionais.adapter.legacydatabase;

public class MongoDBRepository {
    public void insertDocument(String doc) {
        System.out.println("MongoDB inserindo: " + doc);
    }

    public String findDocument(String docId) {
        return "MongoDB dados para id " + docId;
    }
}
