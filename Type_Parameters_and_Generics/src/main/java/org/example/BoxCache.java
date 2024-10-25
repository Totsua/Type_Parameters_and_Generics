package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class BoxCache<K,V extends BoxOperations> {
    K key;
    V value;

    Map<K, V> boxCacheMap = new HashMap<K, V>();

    public void put(K i, V box) {
        boxCacheMap.put(i, box);
    }
}
