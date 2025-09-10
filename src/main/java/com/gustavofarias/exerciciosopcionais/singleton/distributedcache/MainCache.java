package com.gustavofarias.exerciciosopcionais.singleton.distributedcache;

public class MainCache {
    public static void main(String[] args) throws InterruptedException {
        CacheManager cache = CacheManager.getInstance(3000); // 3 segundos de expiração
        cache.put("usuario1", "Dados do usuário 1");

        System.out.println(cache.get("usuario1")); // Deve retornar o dado
        Thread.sleep(4000);
        System.out.println(cache.get("usuario1")); // Expirou, retorna null
    }
}
