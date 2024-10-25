package org.example;

import java.awt.geom.Arc2D;
import java.util.ArrayList;

public class Box<T, V extends Double> implements BoxOperations{
    private T genericAttribute;
    private V largestValue;
    private String name;

    // Static list of all box names
    public static ArrayList<String> boxNames= new ArrayList<>();

    public Box(T genericAttribute, V largestValue, String name) {
        this.genericAttribute = genericAttribute;
        this.largestValue = largestValue;
        this.name = name;

        // Everytime a Box object is created we'll keep track of all the names
        boxNames.add(name);
    }

    // Getters and Setters
    protected T getGenericAttribute() {
        return genericAttribute;
    }


    protected void setGenericAttribute(T genericAttribute) {
        this.genericAttribute = genericAttribute;
    };


    public void setLargestValue (V value1,V value2) {

        // Compare the two values as "doubadded logic to setLargestValue in Boxle", sets the largest value as a V type
        if(value1.doubleValue() > value2.doubleValue()){
            this.largestValue = value1;
        }
        else{
            this.largestValue = value2;
        }

        // Same thing but in one line
        //this.largestValue = value1.doubleValue() > value2.doubleValue() ?  value1 : value2;

        ;
    }

    @Override
    public V getLargestValue() {
        return this.largestValue;
    }

    @Override
    public void setLargestValue(Number value1,Number value2) {
        // Compare the two values as "double", sets the largest value as a V type
        if(value1.doubleValue() > value2.doubleValue()){
            this.largestValue = (V) value1;
        }
        else{
            this.largestValue = (V) value2;
        }
    }
}
