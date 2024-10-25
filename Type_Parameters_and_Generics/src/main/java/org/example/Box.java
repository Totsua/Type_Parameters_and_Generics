package org.example;

public class Box<T, V> {
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



}
