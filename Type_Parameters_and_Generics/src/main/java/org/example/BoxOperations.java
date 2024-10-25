package org.example;

public interface BoxOperations<V extends Number> {

    V getLargestValue();

    void setLargestValue(V value1, V value2);


}
