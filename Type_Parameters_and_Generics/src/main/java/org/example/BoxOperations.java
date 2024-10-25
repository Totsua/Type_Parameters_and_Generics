package org.example;

import java.util.Collection;

public interface BoxOperations<V extends Number> {

    V getLargestValue();

    void setLargestValue(V value1, V value2);

    void setLargestValueFromList(Collection list);

}
