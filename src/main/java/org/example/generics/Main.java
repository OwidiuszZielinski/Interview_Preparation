package org.example.generics;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1 ,2 ,3 ,4 ,5);
        List<String> stringList = Arrays.asList("Owi" ,"Ela" ,"Nucyf" ,"Dorota");

        String owi = "Owi";
        System.out.println(owi.compareTo("Ela"));

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
