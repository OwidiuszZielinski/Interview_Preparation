package org.example.overloading;

import java.lang.reflect.Field;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


        Person.print("xD");
        Person.print();
        Field[] declaredFields = Person.class.getDeclaredFields();
        System.out.println(Arrays.toString(declaredFields));
        Person person = new Person("Owidiusz");
        person.sayMyName();
        System.out.println("Final method OVERLOAD : ");
        person.sayMyName(5);


    }
}
