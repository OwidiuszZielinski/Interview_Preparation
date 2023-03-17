package revision;

public class AlgorithmsTwo {
    public static void main(String[] args) {
        System.out.println(countPairs(new int[]{ -7, -4, -2, 1, 4, 6, 7, 13 }));
        System.out.println(countPairsBestAlgo(new int[]{ -7, -4, -2, 1, 4, 6, 7, 13 }));
        System.out.println(countPairsBestAlgoo(new int[]{ -7, -4, -2, 1, 6, 7, 13, 4 }));
        searchNumberStepsTwo(9, new int[]{ 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 9, 14, 66, 77, 99, 100 });
        check(9, new int[]{ 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 9, 14, 66, 77, 99, 100 });
    }

    private static int countPairs(int[] ints) {
        int counter = 0;
        int steps = 0;
        for (int i = 0; i < ints.length; i++) {
            for (int j = i; j < ints.length; j++) {
                System.out.println("STEP " + ++steps);
                if (ints[i] + ints[j] == 0) {
                    counter++;
                }
            }
        }
        return counter;
    }

    private static int countPairsBestAlgo(int[] ints) {
        int counter = 0;
        int steps = 0;
        int len = ints.length / 2;
        for (int i = 0; i < len; i++) {
            for (int j = len; j < ints.length; j++) {
                System.out.println("STEP " + ++steps);
                if (ints[i] + ints[j] == 0) {
                    counter++;
                }
            }
            len -= 2;
        }

        return counter;
    }

    private static int countPairsBestAlgoo(int[] ints) {
        int counter = 0;
        int steps = 0;
        int left = 0;
        int right = ints.length - 1;
        while (left < right) {
            System.out.println("STEP: " + ++steps);
            int temp = ints[left];
            if (temp + ints[right] == 0) {
                left++;
                right = ints.length;
                counter++;
            }
            right--;


        }

        return counter;
    }

    private static void searchNumberSteps(int n, int[] array) {
        int step = 1;
        int last = array.length - 1;
        int mid = array.length / 2;
        for (int i = 0; i < array.length / 2; i++) {
            System.out.println("STEP NR " + step++);
            if (array[i] == n || array[last - i] == n) {
                System.out.println("YES");
            }
        }
    }

    private static void searchNumberStepsTwo(int n, int[] array) {
        int startIndex = 0;
        int endIndex = array.length - 1;
        int step = 0;
        while (true) {
            System.out.println("STEP NR " + ++step);
            int avgIndex = (endIndex + startIndex) / 2;
            int num = array[avgIndex];
            if (num == n) {
                System.out.println("YES");
                return;
            }
            if (array[avgIndex] < n) {
                startIndex = avgIndex;
            }
            if (array[avgIndex] > n) {
                endIndex = avgIndex;
            }
        }

    }


    public static void check(int n, int[] array) {
        int start = 0;
        int end = array.length - 1;
        int avgIndx = 0;
        int num = 0;
        int count = 1;
        while (true) {
            System.out.println("STEP " + count++);
            avgIndx = (start + end) / 2;
            num = array[avgIndx];
            if (num == n) {
                System.out.println("YES");
                return;
            }
            if (num < n) {
                start = avgIndx;
            }
            if (num > n) {
                end = avgIndx;
            }

        }

    }

}
