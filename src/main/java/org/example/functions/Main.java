package org.example.functions;

import java.util.function.*;

public class Main {
    public static void main(String[] args) {
        printResult("Number power 2" ,12 ,x -> x * x);

        printResult("Number power 3" ,12 ,x -> x * x * x);

        printResult("Number divide 2" ,2 ,x -> x / 2);

        printResult("Number multiple 3" ,2 ,x -> x * 3);

        BiFunction<Integer, Integer, String> myFuc = (integer ,integer2) -> integer + ":" + integer2;
        System.out.println(myFuc.apply(5 ,5));

        BinaryOperator<Integer> myFuc1 = (integer ,integer2) -> integer * integer2 / 2;
        System.out.println(myFuc1.apply(5 ,10));

        BiFunction<Integer, Integer, String> x = myFuc1.andThen(Integer::toBinaryString);
        System.out.println(x.apply(5 ,10));

        BiPredicate<Integer, Integer> myFuc2 = (integer ,integer2) -> integer >= integer2;
        System.out.println(myFuc2.test(14 ,14));

        BooleanSupplier booleanSupplier = () -> false;
        boolean asBoolean = booleanSupplier.getAsBoolean();
        System.out.println(!asBoolean);

        Function <Integer,String> myFunc3 = integer -> integer + "xD";
        System.out.println(myFunc3.apply(15));

        Predicate<Integer> myFunc4 = integer -> integer < 5;
        System.out.println(myFunc4.test(6));
        final String PREFIX = "__pref__";
        final String SUFFIX = "__suff__";

        UnaryOperator<String> operator = s-> PREFIX + s.replaceAll("[\t\n\r\f\s]","") + SUFFIX;
        UnaryOperator<String> operatorT = s-> PREFIX + s.trim() + SUFFIX;


        System.out.println(operatorT.apply("\n x d "));
    }
    private static void printResult(String operation ,Integer x ,Function<Integer, Integer> fun) {
        System.out.println("Method print lambda expression: ");
        System.out.println(operation + ": " + fun.apply(x));
        System.out.println("------------------------------------------");
    }
}