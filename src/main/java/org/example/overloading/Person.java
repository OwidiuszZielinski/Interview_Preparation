package org.example.overloading;

public class Person {
    protected static final String DEFAULT_NAME = "MOLLY";
    protected String name;

    public Person(String name) {
        this.name = name;
    }

    public static void print(String name){
        System.out.println(name);
    }
    public static void print(){
        System.out.println(DEFAULT_NAME);
    }

    public final void sayMyName(){
        System.out.println("HEISENBERG");
    }
    public final void sayMyName(int times){
        for (int i = 0; i < times; i++) {
            System.out.println("HEISENBERG");

        }
    }

}
