package org.example.codeWars;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class NextCodewars {

    public static void main(String[] args) {
        String[] art = new String[]{ "ABAR 200", "CDXE 500", "BKWR 250", "BTSQ 890", "DRTY 600" };
        String[] cd = new String[]{ "A", "B" };
        System.out.println(stockSummary(art, cd));
        System.out.println(shortcut("hello"));
        System.out.println(Arrays.toString(getSize(4, 2, 6)));
        System.out.println(Arrays.toString(multipleOfIndex(new int[]{ 22, -6, 32, 82, 9, 25 })));
        System.out.println(Arrays.toString(race(720, 850, 70)));
        System.out.println(Arrays.deepToString(multiplicationTable(3)));
        System.out.println(revRot("123456987654", 6));
        System.out.println(revRot("563000655734469485", 4));
    }

    public static String stockSummary(String[] lstOfArt, String[] lstOf1stLetter) {
        if (lstOfArt.length < 1 || lstOf1stLetter.length < 1) {
            return "";
        }
        StringBuilder result = new StringBuilder();
        for (String firstLetter : lstOf1stLetter) {
            int counter = 0;
            for (String art : lstOfArt) {
                StringBuilder number = new StringBuilder();
                for (int i = 0; i < art.length(); i++) {
                    if (Character.isDigit(art.charAt(i))) {
                        number.append(art.charAt(i));
                    }
                }
                if (art.substring(0, 1).equals(firstLetter)) {
                    int i = Integer.parseInt(number.toString());
                    counter += i;

                }

            }
            result.append("(").append(firstLetter).append(" : ").append(counter).append(") - ");

        }
        return result.substring(0, result.length() - 3);
    }

    public static String shortcut(String input) {
        return input.replaceAll("[a,e,i,o,u]", "");
    }

    public static int[] getSize(int w, int h, int d) {
        int area = 2 * (w * d) + 2 * (d * h) + 2 * (w * h);
        int volume = w * h * d;
        return new int[]{ area, volume };
    }

    public static int[] multipleOfIndex(int[] arr) {
        int[] result = new int[arr.length];
        int count = 0;
        for (int i = 1; i < arr.length; i++) {
            System.out.println(arr[i] % i + " " + arr[i]);
            if (arr[i] % i == 0) {
                result[count] = arr[i];
                count++;
            }
        }
        return Arrays.stream(result).filter(value -> value != 0).toArray();

    }

    public static String solve(final String str) {
        int counter = 0;
        int half = str.length() / 2;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isUpperCase(str.charAt(i))) {
                counter++;
            }

        }
        return counter > half ? str.toUpperCase() : str.toLowerCase();
    }

    public static int[] race(int v1, int v2, int g) {
        if (v1 >= v2) {
            return null;
        }
        double x = g / (((double) v2 / 3600) - ((double) v1 / 3600));
        int cast = (int) x;
        int hours = cast / 3600;
        int minutes = (cast % 3600) / 60;
        int remainingSeconds = cast % 60;
        return new int[]{ hours, minutes, remainingSeconds };
    }

    public static int[][] multiplicationTable(int n) {
        int[][] result = new int[n][n];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                result[i - 1][j - 1] = j * i;
            }
        }
        return result;
    }

    public static int[] between(int a, int b) {
        int[] array = new int[b - a + 1];
        for (int i = 0; i < array.length; i++) {
            array[i] = a + i;
        }
        return array;
    }

    public static String revRot(String strng, int sz) {
        List<String> strings = new ArrayList<>();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < strng.length(); i += sz) {
            if (i + sz > strng.length()) {
                break;
            }
            strings.add(strng.substring(i, i + sz));
        }
        System.out.println(strings);
        for (String x : strings) {
            int sumOfCubes = 0;
            for (int i = 0; i < x.length(); i++) {
                sumOfCubes += Math.pow(Character.getNumericValue(x.charAt(i)),3);
            }
            if(sumOfCubes % 2 == 0){
                StringBuilder reverse = new StringBuilder(x).reverse();
                result.append(reverse);
                continue;
            }
            for (int i = 1; i <= x.length(); i++) {
                if(i==x.length()){
                    result.append(x.charAt(0));
                    break;
                }
                result.append(x.charAt(i));
            }

        }
        return result.toString();
    }

}
