package org.example.interfaces;

public interface Logger {

    int i = 5;

    void log(String text);

    static void staticMethod(int i){
        for (int j = 0; j < i; j++) {

        }
        System.out.println("Must have body");
        System.out.println("final not agree");
    }



}
