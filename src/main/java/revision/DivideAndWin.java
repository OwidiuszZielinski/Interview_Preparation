package revision;

import java.util.Arrays;

public class DivideAndWin {
    public static void main(String[] args) {
        int[] ints = new int[]{ 1, 5, 6, 22, 33, 11, 2, 3, 4, 89, 200, 12 };
        sorter(ints);
        System.out.println(Arrays.toString(ints));
        System.out.println(check(89, ints));
        System.out.println(checkInBetterWay(89,ints));

    }

    private static void sorter(int[] ints) {
        for (int i = 0; i < ints.length; i++) {
            for (int j = i; j < ints.length; j++) {
                int temp = ints[i];
                if (ints[j] < temp) {
                    ints[i] = ints[j];
                    ints[j] = temp;
                }
            }
        }
    }

    private static String check(int n, int[] ints) {
        String result = "YES";
        int counter = 0;
        for (int i = 0; i < ints.length; i++) {
            System.out.println(" Przejscie petli nr " + ++counter);
            if (ints[i] == n) {
                return result + " INDEX : " + i;
            }
        }
        return "NO";
    }

    private static String checkInBetterWay(int n, int[] ints) {
        int startIndex = 0;
        int endIndex = ints.length - 1;
        int counter = 0;
        String result = "YES";
        int avgIndex = 0;
        int number = 0;
        while (true){
            System.out.println("Przejscie petli nr " + ++counter);
            avgIndex = (startIndex + endIndex) / 2;
            number = ints[avgIndex];
            if(number == n){
                return result + " INDEX " + avgIndex;
            }
            if(number > n){
                endIndex = avgIndex;
            }
            if(number < n){
                startIndex = avgIndex;
            }

        }


    }


}
