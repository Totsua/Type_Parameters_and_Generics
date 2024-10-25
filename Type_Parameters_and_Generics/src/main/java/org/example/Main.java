package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        BoxCache<Integer, Box<?, ?>> boxCache = new BoxCache<>();

        Box<String, Integer> box = new Box<>("IntegerBox");
        Box<String, Float> box2 = new Box<>("FloatBox");
        Box<String, Double> box3 = new Box<>("DoubleBox");

        box.setLargestValue(51, 61);
        box2.setLargestValue(52F, 62F);
        box3.setLargestValue(51.35637D, 52D);

        List<Integer> largestIntegers = new ArrayList<>();
        List<Float> largestFloats = new ArrayList<>();
        List<Double> largestDoubles = new ArrayList<>();

        boxCache.put(1, box);
        boxCache.put(2, box2);
        boxCache.put(3, box3);

        System.out.println(boxCache.getAll().get(2).getLargestValue().getClass());

        for (Box<?, ? extends Number> cachedBox : boxCache.getAll()) {
            switch (cachedBox.getLargestValue().getClass()) {
                case (Integer.class) -> largestIntegers.add((Integer) cachedBox.getLargestValue());
                case (Float.class) -> largestFloats.add((Float) cachedBox.getLargestValue());
                case (Double.class) -> largestDoubles.add((Double) cachedBox.getLargestValue());
            }
        }
/*
        System.out.println("Largest Integers: " + largestIntegers);
        System.out.println("Largest Floats: " + largestFloats);
        System.out.println("Largest Doubles: " + largestDoubles);
*/
    }


}
