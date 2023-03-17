package org.example.algorithms;

import java.util.Arrays;

public class PalindromTest {

    public static void main(String[] args) {

        System.out.println(isPalindrom("civic"));
        int[] ints = { 2, 3, 5, 7, 2, 1, 11 };
        System.out.println(countTime(ints,3));

    }

    public static boolean isPalindrom(String toCheck) {
        int startIndex = 0;
        int lastIndex = toCheck.length() - 1 ;
        while (startIndex < toCheck.length() / 2) {
            if (toCheck.charAt(startIndex) != toCheck.charAt(lastIndex)) {
                return false;
            }
            startIndex++;
            lastIndex --;
        }
        return true;
    }
    
    public static int countTime(int[] ints, int n){
        int[] kasy = new int[n];

        for (int i = 0; i < ints.length; i++) {
            kasy[0] += ints[i];
            Arrays.sort(kasy);
        }
        return kasy[n-1];
    }
}
