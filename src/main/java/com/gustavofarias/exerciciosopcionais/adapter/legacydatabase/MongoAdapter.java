package com.gustavofarias.exerciciosopcionais.adapter.legacydatabase;

public class MongoAdapter implements Repository {
    private MongoDBRepository mongo;

    public MongoAdapter(MongoDBRepository mongo) {
        this.mongo = mongo;
    }

    @Override
    public void save(String data) {
        mongo.insertDocument(data);
    }

    @Override
    public String fetch(String id) {
        return mongo.findDocument(id);
    }
}
