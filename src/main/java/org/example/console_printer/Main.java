package org.example.console_printer;

public class Main {
    public static void main(String[] args) {



    }

    private static void drawTree(int height) {
        String ANSI_RESET = "\u001B[0m";
        final String ANSI_GREEN = "\u001B[32m";

        for (int i = 0; i < height; i++) {

            for (int j = 0; j < height - i; j++) {
                System.out.print("  ");
            }

            for (int j = 0; j <= i; j++) {
                if (j % 2 == 0) {
                    System.out.print(ANSI_GREEN + " *" + ANSI_RESET);
                } else {
                    System.out.print(" *");
                }
            }
            for (int j = 0; j < i; j++) {
                if (j % 2 == 0) {
                    System.out.print(ANSI_GREEN + " *" + ANSI_RESET);
                } else {
                    System.out.print(" *");
                }
            }


            System.out.println();
        }
    }
}
