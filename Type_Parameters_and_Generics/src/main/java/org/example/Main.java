package org.example;

import com.sun.jdi.Value;
import org.w3c.dom.ls.LSOutput;

import java.security.Key;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        BoxCache<Integer, Box<String, Float>> boxCache = new BoxCache<>();
        Box<String, Float> box = new Box<>("FloatBox");
        boxCache.put(1, box);


/*        for (Map.Entry<Integer, Box<String, Float>> map: boxCache.boxCacheMap.entrySet()){
            System.out.println("Key: " + map.getKey() + "\n Value: " +  map.getValue().getName());
        }*/


    }


}
