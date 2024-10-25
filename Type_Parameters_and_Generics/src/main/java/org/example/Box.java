package org.example;

import java.awt.geom.Arc2D;

public class Box<T, V extends Double> {
    private T genericAttribute;
    private V largestValue;

    // Getters and Setters
    protected T getGenericAttribute() {
        return genericAttribute;
    }

    protected V getLargestValue() {
        return largestValue;
    }

    protected void setGenericAttribute(T genericAttribute) {
        this.genericAttribute = genericAttribute;
    };

    public void setLargestValue (V value1,V value2) {

        // Compare the two values as "double", sets the largest value as a V type
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
}
