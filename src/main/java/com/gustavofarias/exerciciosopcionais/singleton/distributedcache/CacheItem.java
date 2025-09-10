package com.gustavofarias.exerciciosopcionais.singleton.distributedcache;

class CacheItem {
    String value;
    long timestamp;

    CacheItem(String value, long timestamp) {
        this.value = value;
        this.timestamp = timestamp;
    }
}
