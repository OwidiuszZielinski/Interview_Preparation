package org.example.algorithms;

import java.lang.reflect.Array;
import java.util.*;

public class Learn {
    public static void main(String[] args) {
        int[] ints = new int[]{10,22,33,3,5};

        System.out.println(pow(2, 3));
        System.out.println(powRec(2, 3));
        System.out.println(checkPalindrom("CIVIC"));
        System.out.println(fibo(10));
        System.out.println(dnaToRna("TTTT"));
        System.out.println(calculateYears(1000, 0.05, 0.18, 1100));
        System.out.println(solveSuperMarketQueue(ints, 2));


    }

    private static int[] sorter(int[] ints) {
        for (int i = 0; i < ints.length; i++) {
            for (int j = 0; j < ints.length; j++) {
                if (ints[j] > ints[i]) {
                    ints[i] = ints[j] + ints[i];
                    ints[j] = ints[i] - ints[j];
                    ints[i] = ints[i] - ints[j];

                }
            }
        }
        return ints;
    }

    private static int minCount(int[] ints, int n) {
        int firstIndex = 0;
        int lastIndex = ints.length;
        int midIndex = 0;
        int counter = 1;
        while (ints[midIndex] != n) {
            System.out.println("Loop : " + counter++);
            midIndex = (firstIndex + lastIndex) / 2;
            if (ints[midIndex] > n) {
                lastIndex = midIndex;

            }
            if (ints[midIndex] < n) {
                firstIndex = midIndex;

            }

        }
        return ints[midIndex];
    }

    private static int pow(int p, int t) {
        int result = p;
        for (int i = 0; i < t; i++) {
            result *= p;
        }
        return result;
    }

    private static int powRec(int p, int t) {
        if (t == 0) {
            return 1;
        } else
            return p * powRec(p, t - 1);
    }

    private static boolean checkPalindrom(String str) {
        int last = str.length() - 1;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != str.charAt(last)) {
                return false;
            }
            last--;
        }
        return true;
    }

    private static int fibo(int n) {
        int fibPrevious = 1;
        int fibNext = 1;
        int fib = 0;
        for (int i = 1; i < n; i++) {
            fib = fibNext + fibPrevious;
            fibPrevious = fibNext;
            fibNext = fib;
        }

        return fib;
    }

    public static String whoLikesIt(String... names) {
        int namesLength = names.length;
        switch (namesLength) {
            case 0 -> {
                return "no one likes this";
            }
            case 1 -> {
                return names[0] + " " + "likes this";
            }
            case 2 -> {
                return names[0] + " and " + names[1] + " " + "like this";
            }
            case 3 -> {
                return names[0] + ", " + names[1] + " and " + names[2] + " " + "like this";
            }
            default -> {
                return names[0] + ", " + names[1] + " and " + (namesLength - 2) + " others like this";
            }

        }

    }

    public static String dnaToRna(String dna) {
        return dna.replace("T", "U");
    }

    public static int calculateYears(double principal, double interest, double tax, double desired) {
        int years = 0;
        while (principal < desired) {
            double profit = (principal * interest);
            double profitNetto = profit - (profit * tax);
            principal += profitNetto;
            years++;
        }
        return years;
    }

    public static int solveSuperMarketQueue(int[] customers, int n) {
      int[] array = new int[n];
        for (int i = 0; i < customers.length; i++) {
            array[0] += customers[i];
            Arrays.sort(array);
        }
        return array[n-1];
    }
}
