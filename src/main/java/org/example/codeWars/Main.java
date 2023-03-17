package org.example.codeWars;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        System.out.println(isSquare(34672268));
        System.out.println(Math.sqrt(34672268));
        System.out.println(Math.sqrt(34672268) % 0.1);
        System.out.println(Math.sqrt(16) % 0.01);
        System.out.println(checkFibo(7));

        System.out.println(fibo(5));
        System.out.println(Arrays.toString(productFib(5895)));
        System.out.println(myFib(5) + " Basic");
        System.out.println(fiboT(5));
        System.out.println(hexToDec("a"));
        System.out.println(digPow(46288, 3));
        System.out.println(expressionsMatter(1,1,1));
    }

    public static boolean isSquare(int n) {
        if (n == 0) {
            return true;
        }
        if (n < 0) {
            return false;
        }
        double v = (n / Math.sqrt(n)) % Math.sqrt(n) - (int) (n / Math.sqrt(n)) % Math.sqrt(n);
        return v == 0;
    }

    public static long[] productFib(long prod) {
        long[] res = new long[3];
        long multiple = 1;

        while (multiple <= prod) {
            for (long i = 1; multiple <= prod; i++) {
                long a = fibo(i);
                long b = fibo(i + 1);
                multiple = a * b;
                if (multiple == prod) {
                    res[0] = fibo(i);
                    res[1] = fibo(i + 1);
                    res[2] = 1;
                    return res;
                }
                res[0] = a;
                res[1] = b;

            }

        }

        return res;
    }

    private static boolean checkFibo(long n) {
        boolean check = false;
        long i = 1;
        while (i <= n) {
            long fib = fibo(i);
            if (fib == n) {
                check = true;
            }
            i++;
        }
        return check;
    }

    private static long fibo(long n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        return fibo(n - 2) + fibo(n - 1);
    }

    private static long fiboT(long n) {
        List<Long> list = new ArrayList<>();
        list.add(1L);
        list.add(1L);

        while (list.size() < n) {
            long a = list.get(list.size() - 2);
            long b = list.get(list.size() - 1);
            long fib = a + b;
            list.add(fib);
        }
        return list.get(list.size() - 1);
    }

    private static long basicFib(long n) {
        long a = 1L;
        long b = 1L;
        long temp;
        for (int i = 0; i < n; i++) {
            temp = a;
            a = b;
            b = temp + b;
        }
        return a;
    }

    private static int hexToDec(String hex) {
        return Integer.parseInt(hex, 16);
    }


    private static int myFib(int n) {
        int a = 0;
        int b = 1;
        for (int i = 0; i < n; i++) {
            int temp = a;
            a = b;
            b = temp + a;
        }
        return a;
    }

    public static long digPow(int n, int p) {
        String intString = String.valueOf(n);
        long sum = 0;
        for (int i = 0; i < intString.length(); ++i, ++p)
            sum += Math.pow(Character.getNumericValue(intString.charAt(i)), p);
        return (sum % n == 0) ? sum / n : -1;
    }

    public static boolean xor(boolean a, boolean b) {
        return a != b;
    }

    public static int saleHotdogs(final int n) {
        if (n < 5) {
            return n * 100;
        }
        return n >= 10 ? n * 90 : n * 95;

    }

    public static boolean feast(String beast, String dish) {

        return (beast.charAt(0) == dish.charAt(0) && beast.charAt(beast.length() - 1) == dish.charAt(dish.length() - 1));

    }

    public static int expressionsMatter(int a, int b, int c) {
        int max = Math.max(a + b + c, (a * b) * c);
        int maxT = Math.max(Math.max(a * (b + c), a * b * c), Math.max(a + b * c, (a + b) * c));
        return Math.max(maxT, max);
    }
    // 1st parameter is the stocklist (L in example),
    // 2nd parameter is list of categories (M in example)
    public static String stockSummary(String[] lstOfArt, String[] lstOf1stLetter) {
        // your code here
        return null;
    }

}
