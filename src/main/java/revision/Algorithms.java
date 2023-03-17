package revision;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Algorithms {
    public static void main(String[] args) {
        //sort Array
        int[] array = new int[]{ 33, 44, 22, 66, 1, 2, 4, 55, 12 };
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(sortArray(array)));

        //Fibonacci
        System.out.println(fibonacciIteration(10));
        System.out.println(fibonacciRecursion(10));
        System.out.println(fibonacciList(10));

        //Power
        System.out.println(power(2, 8));
        System.out.println(powerIteration(2, 8));
        System.out.println(powerRecursion(2, 8));

        //String Reverser
        System.out.println(reverse("Owidisuz"));
        System.out.println(reverseIteration("Owidisuz"));
        System.out.println(reverseIterationArray("Owidisuz"));
        System.out.println((reverseIterationArrayTwo("Owidiusz")));

        //Factorial
        System.out.println(factorialRecursion(4));
        System.out.println(factorialIteration(4));
        System.out.println(factorialRecursion(4));
        System.out.println(factorialRecursion(4));
        //Palindrom
        System.out.println(checkPalindrom("taat"));
        System.out.println(checkPalindromIteration("xdxdx"));

        //Swap 2 variables
        swapNumbers(10, 15);

        System.out.println(Arrays.toString(concatTable(new String[]{ "ab", "ba" }, new String[]{ "cd", "cc" })));
    }

    private static int[] sortArray(int[] ints) {
        for (int i = 0; i < ints.length; i++) {
            for (int j = i; j < ints.length; j++) {
                int temp = ints[i];
                if (ints[j] < temp) {
                    ints[i] = ints[j];
                    ints[j] = temp;
                }
            }
        }
        return ints;
    }

    private static int fibonacciIteration(int n) {
        int a = 0;
        int b = 1;
        for (int i = 0; i < n - 1; i++) {
            b = a + b;
            a = b - a;
        }
        return b;
    }

    private static int fibonacciRecursion(int n) {
        if (n == 1 || n == 0) {
            return 1;
        } else
            return fibonacciIteration(n - 2) + fibonacciIteration(n - 1);
    }

    private static int fibonacciList(int n) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 1));
        while (list.size() < n) {
            list.add(list.get(list.size() - 1) + list.get(list.size() - 2));
        }
        return list.get(list.size() - 1);
    }

    private static int power(int base, int to) {
        return (int) Math.pow(base, to);
    }

    private static int powerIteration(int base, int to) {
        int result = 1;
        for (int i = 0; i < to; i++) {
            result *= base;
        }
        return result;
    }

    private static int powerRecursion(int base, int to) {
        if (to == 0) {
            return 1;
        } else
            return base * powerRecursion(base, to - 1);
    }

    private static String reverse(String s) {
        return new StringBuilder(s).reverse().toString();
    }

    private static String reverseIteration(String s) {
        StringBuilder result = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            result.append(s.charAt(i));
        }
        return result.toString();
    }

    private static String reverseIterationArray(String s) {
        char[] chars = s.toCharArray();
        int left = 0, right = chars.length - 1;
        while (left < right) {
            char temp = chars[left];
            chars[left++] = chars[right];
            chars[right--] = temp;
        }
        return new String(chars);
    }


    private static String reverseIterationArrayTwo(String s) {
        char[] chars = s.toCharArray();
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            char temp = chars[left];
            chars[left++] = chars[right];
            chars[right--] = temp;
        }
        return new String(chars);
    }

    private static int factorialRecursion(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else
            return n * (factorialRecursion(n - 1));
    }

    private static int factorialIteration(int n) {
        int factor = 1;
        for (int i = 1; i <= n; i++) {
            factor *= i;
        }
        return factor;
    }

    private static boolean checkPalindrom(String s) {
        return new StringBuilder(s).reverse().toString().equals(s);
    }

    private static boolean checkPalindromIteration(String s) {
        int left = 0;
        boolean check = true;
        int right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left++) != s.charAt(right--)) {
                check = false;
            }
        }
        return check;
    }

    private static void swapNumbers(int a, int b) {
        System.out.println(a);
        System.out.println(b);
        b = a + b;
        a = b - a;
        b = b - a;
        System.out.println(a);
        System.out.println(b);
    }

    private static String[] concatTable(String[] a, String[] b) {

        String[] result = new String[a.length + b.length];
        for (int j = 0; j < a.length; j++) {
            result[j] = a[j];
        }
        for (int j = 0; j < b.length; j++) {
            result[j + a.length] = b[j];
        }
        return result;
    }

}
