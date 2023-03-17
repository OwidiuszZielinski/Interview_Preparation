package org.example.comparator;

import java.util.Comparator;

public class MyComp implements Comparator<Animal> {
    @Override
    public int compare(Animal o1, Animal o2) {
        return Integer.compare(o1.getAge(),o2.getAge());
    }
}
