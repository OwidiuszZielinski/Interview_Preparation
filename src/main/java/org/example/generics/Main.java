package org.example.generics;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        MyGeneric<Integer> test = new MyGeneric<>(5);
        MyGeneric<String> testTwo = new MyGeneric<>("5");
        System.out.println(test.getT());
        System.out.println(testTwo.getT());


        List<Integer> intList = Arrays.asList(1 ,2 ,3 ,4 ,5);
        List<String> stringList = Arrays.asList("Owi" ,"Ela" ,"Nucyf" ,"Dorota");

        Boolean b = true;
        int z = 1;
        b = Boolean.valueOf("true");
        print(stringList);
    }

    public static <T> void print(List<T> list) {
        for (T generic : list) {
            System.out.println(generic);
        }
    }
}
