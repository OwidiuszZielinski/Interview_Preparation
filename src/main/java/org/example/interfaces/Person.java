package org.example.interfaces;

import java.io.Serializable;

public class Person implements  Comparable<Person>,Runnable, Serializable,Logger {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String name;


    @Override
    public int compareTo(Person o) {
        return 0;
    }

    @Override
    public void run() {

    }

    @Override
    public void log(String text) {

    }
}
