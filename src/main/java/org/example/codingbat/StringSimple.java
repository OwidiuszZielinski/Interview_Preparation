package org.example.codingbat;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class StringSimple {

    public static void main(String[] args) {
        System.out.println(conCat("abc", "cat"));
        System.out.println(deFront("hi"));
    }

    public String makeAbba(String a, String b) {
        return a + b + b + a;
    }

    public String makeOutWord(String out, String word) {
        return out.substring(0, 2) + word + out.substring(2, 4);
    }

    public String extraEnd(String str) {
        String substring = str.substring(str.length() - 2);
        return substring + substring + substring;
    }

    public String firstTwo(String str) {
        if (str.length() < 2) {
            return str;
        }
        return str.substring(0, 2);
    }

    public String firstHalf(String str) {
        return str.substring(0, str.length() / 2);
    }

    public String withoutEnd(String str) {
        return str.substring(1, str.length() - 1);
    }

    public String comboString(String a, String b) {
        int alen = a.length();
        int blen = b.length();
        if (alen > blen) {
            return b + a + b;
        }
        return a + b + a;
    }

    public String nonStart(String a, String b) {
        return a.substring(1) + b.substring(1);
    }

    public String left2(String str) {
        String substring = str.substring(str.length() - 2);
        return substring + str.substring(0, str.length() - 2);
    }

    public String theEnd(String str, boolean front) {
        return front ? str.substring(0, 1) : str.substring(str.length() - 1);
    }

    public String withouEnd2(String str) {
        if (str.length() < 2) {
            return str;
        }
        return str.substring(0, 1) + str.substring(str.length() - 1);
    }

    public String middleTwo(String str) {
        if (str.length() < 6) {
            return "";
        }
        return str.substring(str.length() / 2, (str.length() / 2) + 1);
    }

    public boolean endsLy(String str) {
        return str.endsWith("ly");
    }

    public String nTwice(String str, int n) {
        return str.substring(0, n) + str.substring(str.length() - n);
    }

    public String twoChar(String str, int index) {
        if (index < 0) {
            return str.substring(0, 2);
        }
        index = Math.abs(index);
        if (index > 2) {
            return str.substring(0, 2);
        }
        return str.substring(index, index + 2);
    }

    public String middleThree(String str) {
        return str.substring((str.length() / 2) - 1, (str.length() / 2) + 1);
    }

    public boolean hasBad(String str) {
        if (str.length() > 4) {
            return str.substring(0, 4).contains("bad");

        }
        if (str.length() == 3) {
            return str.substring(0, 3).contains("bad");

        }
        return false;
    }

    public String atFirst(String str) {
        if (str.length() >= 2) {
            return str.substring(0, 2);

        }
        StringBuilder strBuilder = new StringBuilder(str);
        for (int i = 0; i <= 2 - strBuilder.length(); i++) {
            strBuilder.append("@");
        }
        return strBuilder.toString();

    }

    public String lastChars(String a, String b) {
        String aFirst = "";
        String bLast = "";
        if (a.length() >= 2 && b.length() >= 2) {
            aFirst = String.valueOf(a.charAt(0));
            bLast = b.substring(b.length() - 1);
            return aFirst + bLast;
        }
        if (!a.isEmpty() && b.isEmpty()) {
            aFirst = String.valueOf(a.charAt(0));
            return aFirst + "@";
        }
        if (a.isEmpty() && !b.isEmpty()) {
            bLast = b.substring(b.length() - 1);
            return "@" + bLast;
        }
        return "@@";
    }

    public static String conCatT(String a, String b) {
        Set<String> collect = Arrays.stream((a + b).split("")).collect(Collectors.toSet());
        return String.join("", collect);
    }

    public static String conCat(String a, String b) {
        String aLast = "";
        String bFirst = "";
        if (a.isEmpty() || b.isEmpty()) {
            return a.isEmpty() ? b : a;
        }
        aLast = a.substring(a.length() - 1);
        bFirst = b.substring(0, 1);
        if (aLast.equals(bFirst)) {
            return a + b.substring(1);
        }


        return a + b;
    }

    public String lastTwo(String str) {
        if (str.length() >= 2) {
            return str.substring(0, str.length() - 2) + new StringBuilder(str.substring(str.length() - 2)).reverse();
        }
        return str;
    }

    public String seeColor(String str) {
        if (str.startsWith("red")) {
            return "red";
        }
        if (str.startsWith("blue")) {
            return "blue";
        }
        return "";
    }

    public boolean frontAgain(String str) {
        if (str.length() >= 2) {
            return str.substring(0, 2).equals(str.substring(str.length() - 2));
        }
        return false;
    }

    public String minCat(String a, String b) {
        if (a.isEmpty() || b.isEmpty()) {
            return "";
        }
        if (a.length() == b.length()) {
            return a + b;
        }
        if (a.length() > b.length()) {
            return a.substring(a.length() - b.length()) + b;
        }
        return a + b.substring(b.length() - a.length());
    }

    public String extraFront(String str) {
        StringBuilder builder = new StringBuilder();
        if (str.length() >= 2) {
            for (int i = 0; i < 3; i++) {
                builder.append(str, 0, 2);
            }
            return builder.toString();
        }
        for (int i = 0; i < 3; i++) {
            builder.append(str);
        }
        return builder.toString();

    }

    public String without2(String str) {
        if (str.length() >= 4) {
            if (str.substring(0, 2).equals(str.substring(str.length() - 2))) {
                return str.substring(2);
            }
            return str;
        }
        if (str.length() == 1) {
            return str;
        }
        return "";
    }

    public static String deFront(String str) {
        StringBuilder builder = new StringBuilder();
        if (str.length() >= 2) {
            for (int i = 0; i < str.length(); i++) {
                if (i == 0 && str.charAt(i) == 'a' || str.charAt(i) == 'A') {
                    builder.append(str.charAt(i));
                    continue;
                }
                if (i == 1 && str.charAt(i) == 'b' || str.charAt(i) == 'B') {
                    builder.append(str.charAt(i));
                    continue;
                }
                if (i < 2) {
                    continue;
                }
                builder.append(str.charAt(i));

            }
            return builder.toString();
        }
        return str;
    }

    public String startWord(String str, String word) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (i == 0 && str.contains(word.substring(1))) {
                builder.append(str.charAt(i));
                continue;
            }
            if (i <= word.length() && str.charAt(i) == word.charAt(i) && str.contains(word.substring(1))) {
                builder.append(str.charAt(i));
            }

        }
        return builder.toString();


    }

    public String withoutX(String str) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (i == 0 || i == str.length() - 1 && str.charAt(i) == 'x') {
                continue;
            }
            builder.append(str.charAt(i));
        }
        return builder.toString();
    }

    public String withoutX2(String str) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if ((i == 0 || i == 1) && str.charAt(i) == 'x') {
                continue;
            }
            builder.append(str.charAt(i));
        }
        return builder.toString();
    }


}
