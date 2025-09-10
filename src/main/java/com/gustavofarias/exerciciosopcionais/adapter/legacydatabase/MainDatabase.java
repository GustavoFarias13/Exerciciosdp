package com.gustavofarias.exerciciosopcionais.adapter.legacydatabase;

public class MainDatabase {
    public static void main(String[] args) {
        Repository repo1 = new MySQLRepository();
        repo1.save("Usuário 1");
        System.out.println(repo1.fetch("1"));

        Repository repo2 = new MongoAdapter(new MongoDBRepository());
        repo2.save("Usuário 2");
        System.out.println(repo2.fetch("2"));
    }
}
