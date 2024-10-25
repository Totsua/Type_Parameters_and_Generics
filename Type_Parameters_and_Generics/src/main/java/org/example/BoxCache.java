package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class BoxCache<K,V extends BoxOperations> {
    K key;
    V value;

    Map<K, V> boxCacheMap = new HashMap<K, V>();

    // Todo Getters and Setters
    public V getValue() {
        return value;
    }

    // ToDo Methods
    public void put(K i, V box) {
        boxCacheMap.put(i, box);
    }
    ArrayList<V> getAll() {
        ArrayList<V> valueList = new ArrayList<>();
        for (Map.Entry<K, V> map : boxCacheMap.entrySet()) {
            valueList.add(map.getValue());
            //System.out.println("Key: " + map.getKey() + "\n Value: " + map.getValue().getName());
        }
        return valueList;
    }
}
