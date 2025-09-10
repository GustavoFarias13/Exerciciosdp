package com.gustavofarias.exerciciosopcionais.singleton.distributedcache;

import java.util.HashMap;
import java.util.Map;

class CacheManager {
    private static CacheManager instance;
    private Map<String, CacheItem> cache;
    private long expirationTime; // milliseconds

    private CacheManager(long expirationTime) {
        this.cache = new HashMap<>();
        this.expirationTime = expirationTime;
    }

    public static synchronized CacheManager getInstance(long expirationTime) {
        if (instance == null) {
            instance = new CacheManager(expirationTime);
        }
        return instance;
    }

    public void put(String key, String value) {
        cache.put(key, new CacheItem(value, System.currentTimeMillis()));
    }

    public String get(String key) {
        CacheItem item = cache.get(key);
        if (item == null) return null;

        if (System.currentTimeMillis() - item.timestamp > expirationTime) {
            cache.remove(key);
            return null;
        }
        return item.value;
    }
}
