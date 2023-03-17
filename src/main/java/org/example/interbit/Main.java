package org.example.interbit;

import java.util.Arrays;

public class Main {

    {
        System.out.println("Twoja stara bez statica");
    }
    static {
        System.out.println("Twoja stara z stanikiem");
    }

    public static void main(String[] args) {
        System.out.println("Hello");
        Main main = new Main();
        int[][] ints = new int[3][5];
        System.out.print(Arrays.deepToString(ints));

    }

}
