package org.example.algorithms;

import java.util.Arrays;
import java.util.Comparator;

public class Code {
    public static void main(String[] args) {
        System.out.println(bmi(80, 1.8));
        System.out.println(replace("ABCDE"));
        System.out.println(warnTheSheep(new String[]{ "sheep", "sheep", "sheep", "sheep", "sheep", "wolf", "sheep", "sheep" }));
        System.out.println(print(3));

    }

    public static String doubleChar(String s) {
        StringBuilder stringBuffer = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            stringBuffer.append(s.charAt(i));
            stringBuffer.append(s.charAt(i));
        }
        return stringBuffer.toString();
    }

    public static String bmi(double weight, double height) {
        double bmi = weight / Math.pow(height, 2);
        System.out.println(bmi);
        if (bmi <= 18.5) {
            return "Underweight";
        }
        if (bmi <= 25) {
            return "Normal";
        }
        if (bmi <= 30) {
            return "Overweight";
        }
        return "Obese";
    }

    public static String replace(final String s) {
        return s.replaceAll("[aeiouAEIOU]", "!");
    }

    public static String reverseLetter(final String str) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (Character.isAlphabetic(str.charAt(i))) {
                builder.append(str.charAt(i));
            }

        }
        return builder.reverse().toString();
    }

    public static String warnTheSheep(String[] array) {
        int counter = 0;
        for (int i = array.length - 1; i > 0; i--) {
            if (array[i].equals("wolf")) {
                break;
            }
            counter++;
        }
        return counter > 0 ? "Oi! Sheep number " + counter + "! You are about to be eaten by a wolf!" : "Pls go away and stop eating my sheep";
    }

    public static String print(int n) {
        StringBuffer buffer = new StringBuffer();
        if (n <= 0) {
            return null;
        }
        for (int i = 0; i < n; i++) {
            if (i < (n / 2) + 1) {
                buffer.append(" ".repeat(n / 2 - i));
                buffer.append("*".repeat(i));
                buffer.append("*".repeat(i + 1));
                buffer.append("\n");
                continue;
            }
            buffer.append(" ".repeat(Math.max(0, i - (n / 2))));
            buffer.append("*".repeat(Math.max(0, n - (i + 1))));
            buffer.append("*".repeat(Math.max(0, n - (i + 1) + 1)));
            buffer.append("\n");

        }
        return buffer.toString();
    }
    public int min(int[] list) {
        return Arrays.stream(list).boxed().min(Comparator.naturalOrder()).orElseThrow(IllegalAccessError::new);
    }

    public int max(int[] list) {
        return Arrays.stream(list).boxed().max(Comparator.naturalOrder()).orElseThrow(IllegalAccessError::new);
    }
}
