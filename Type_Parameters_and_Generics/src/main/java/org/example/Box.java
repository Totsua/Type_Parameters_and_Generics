package org.example;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Box<T, V extends Number & Comparable<V>> implements BoxOperations{
    private T genericAttribute;
    private V largestValue;
    private String name;

    // Static list of all box names
    public static ArrayList<String> boxNames= new ArrayList<>();

    public Box(String name) {
//        this.genericAttribute = genericAttribute;
//        this.largestValue = largestValue;
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

    public String getName() {
        return name;
    };

    /*public void setLargestValue (V value1,V value2) {

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
    }*/

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

    // Checks to see if a Box shares a name with a previously created Box
    public boolean hasSameName(Box<?,V> box ){
        return boxNames.contains(this.name);
    };

    public T castValue(String bs){
        return (T) bs;
    }

    // setter to set largest value from List input
    @Override
    public void setLargestValueFromList(Collection list ){
        this.largestValue = (V)Collections.max(list);
    };



}
