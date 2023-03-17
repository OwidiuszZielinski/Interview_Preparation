package org.example;

import java.util.regex.MatchResult;

public class LordTest {
    public static void main(String[] args) {


        String val1 = new String("a");
        String val2 = "a";
        String val3 = val2;
        String val4 = new String(val2);
        System.out.println(val1 == val2);
        System.out.println(val2 == val3);
        System.out.println("constructor " + (val4 == val2));


    }

    private static void foo(String asd) {

        System.out.println("String ");
    }

    private static void foo(Object asd) {
        System.out.println("Object");

    }
}
