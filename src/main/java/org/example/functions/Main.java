package org.example.functions;

import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        printResult("Number power 2" ,12 ,x -> x * x);

        printResult("Number power 3" ,12 ,x -> x * x * x);

        printResult("Number divide 2" ,2 ,x -> x / 2);

        printResult("Number multiple 3" ,2 ,x -> x * 3);
    }
    private static void printResult(String operation ,Integer x ,Function<Integer, Integer> fun) {
        System.out.println("Method print lambda expression: ");
        System.out.println(operation + ": " + fun.apply(x));
        System.out.println("------------------------------------------");
    }
}