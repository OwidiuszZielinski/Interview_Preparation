package revision;

import java.util.Arrays;

public class NextLearn {
    public static void main(String[] args) {
        int[] ints = new int[]{ 3, 4, 7, 11, 2, 33, 5, 8, 9, 10 };
        int lookingFor = 16;

        System.out.println(Arrays.toString(ints));
        sorter(ints);
        System.out.println(Arrays.toString(ints));
        System.out.println(checkExists(lookingFor, ints));
        String name = "Elzbieta";
        stringReverser(name);

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

    private static boolean checkExists(int n, int[] ints) {
        int startIndex = 0;
        int endIndex = ints.length - 1;
        int counter = 1;
        int avgIndex = 0;
        int numberInIndex = 0;
        while (counter < ints.length / 2) {
            avgIndex = (startIndex + endIndex) / 2;
            numberInIndex = ints[avgIndex];
            System.out.println("STEP : " + counter++);

            if (numberInIndex == n) {
                return true;
            }
            if (numberInIndex < n) {
                startIndex = avgIndex;
            }
            if (numberInIndex > n) {
                endIndex = avgIndex;
            }


        }
        return false;

    }
        private static void stringReverser(String s){
            char[] chars = s.toCharArray();
            char[] res = new char[chars.length];
            for (int i = 0; i < chars.length; i++) {
                char temp = chars[i];
                 res[i] = chars[chars.length-1-i];
            }
            System.out.println(new String(res));

        }

}
