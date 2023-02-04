package org.example.algorithms;

public class Main {
    public static void main(String[] args) {
        swapVariableWithoutTemp(10 ,15);

    }

    //1.Swap variables
    private static void swapVariableWithoutTemp(int a ,int b) {
        System.out.println("BEFORE " + a);
        System.out.println("BEFORE " + b);
        b = a + b;
        a = b - a;
        b = b - a;
        System.out.println("AFTER " + a);
        System.out.println("AFTER " + b);
    }

    private static void stringReverser(String x) {
        StringBuilder result = new StringBuilder();
        for (int i = x.length() - 1; i >= 0; i--) {
            result.append(x.charAt(i));
        }
        System.out.println(result);
    }

    private static int[] sorter(int[] ints) {
        for (int i = 0; i < ints.length; i++) {
            for (int j = i; j < ints.length; j++) {
                if (ints[j] < ints[i]) {
                    int temp = ints[i];
                    ints[i] = ints[j];
                    ints[j] = temp;
                }
            }
        }
        return ints;
    }


}
