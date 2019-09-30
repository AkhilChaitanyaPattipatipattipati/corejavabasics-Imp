package com.cache;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache<K,V> extends LinkedHashMap<K,V> {
    private final int count;
    private LRUCache(int count){
        this.count=count;
    }
    @Override
    protected   boolean removeEldestEntry(Map.Entry<K, V> eldest) {
       return size()>count;
    }
    public  static <K,V> LRUCache<K,V>   newInstance(int count){
        return new LRUCache<K,V> ( count );
    }
}
