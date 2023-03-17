package org.example.passbyvalue;

import java.util.Comparator;

public class Animal  {
    public int age;

    public void setAge(int age) {
        this.age = age;
    }

    public static Comparator<Animal> myComparator= new Comparator<Animal>() {
        @Override
        public int compare(Animal o1 ,Animal o2) {
            return 0;
        }
    };

    public Animal(Animal animal) {
        this.age = animal.age;
    }

    public Animal() {
    }

    public Animal(int age) {
        this.age = age;
    }
}
