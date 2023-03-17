package org.example.codingbat;

import org.example.InterviewBit;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class Arrayss {
    public static void main(String[] args) {

    }

    public boolean firstLast6(int[] nums) {
        if (nums.length > 1) {
            return nums[0] == nums[nums.length - 1];
        }
        return false;
    }

    public int[] makePi() {
        return new int[]{ 3, 1, 4 };
    }

    public boolean commonEnd(int[] a, int[] b) {
        if (a.length >= 1 && b.length >= 1) {
            return a[0] == b[0] || a[a.length - 1] == b[b.length - 1];
        }
        return false;
    }

    public int sum3(int[] nums) {
        return Arrays.stream(nums).sum();
    }

    public int[] rotateLeft3(int[] nums) {
        int[] ints = new int[nums.length];
        if (nums.length - 1 >= 0) System.arraycopy(nums, 1, ints, 0, nums.length - 1);
        ints[ints.length - 1] = nums[0];
        return ints;
    }

    public int[] reverse3(int[] nums) {
        int[] ints = new int[nums.length];
        int couneter = 0;
        for (int i = nums.length - 1; i > 0; i--) {
            ints[couneter] = nums[i];
            couneter++;
        }
        return ints;
    }

    public int[] maxEnd3(int[] nums) {
        int biggest = Math.max(nums[0], nums[nums.length - 1]);
        Arrays.fill(nums, biggest);
        return nums;
    }

    public int sum2(int[] nums) {
        if (nums.length >= 2) {
            return Arrays.stream(nums).limit(2).sum();
        }
        if (nums.length == 0) {
            return 0;
        }
        return Arrays.stream(nums).sum();
    }

    public int[] middleWay(int[] a, int[] b) {
        return new int[]{ a[a.length / 2], b[b.length / 2] };
    }

    public int[] makeEnds(int[] nums) {
        return new int[]{ nums[0], nums[nums.length - 1] };
    }

    public boolean has23(int[] nums) {
        return Arrays.stream(nums).noneMatch(value -> value == 2 || value == 3);
    }

    public int[] makeLast(int[] nums) {
        int[] ints = new int[nums.length];
        ints[ints.length - 1] = nums[nums.length - 1];
        return ints;
    }

    public boolean double23(int[] nums) {
        long count2 = Arrays.stream(nums).filter(value -> value == 2).count();
        long count3 = Arrays.stream(nums).filter(value -> value == 3).count();

        return count2 == 2 || count3 == 2;
    }

    public int[] fix23(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 2 && nums[i + 1] == 3) {
                nums[i + 1] = 0;
            }

        }
        return nums;
    }

    public int start1(int[] a, int[] b) {
        int counter = 0;
        if (a[0] == 1 && a.length > 1) {
            counter++;
        }
        if (b[0] == 1 && b.length > 1) {
            counter++;
        }
        return counter;
    }

    public int[] biggerTwo(int[] a, int[] b) {
        int sumA = Arrays.stream(a).sum();
        int sumB = Arrays.stream(b).sum();
        if (sumB > sumA) {
            return b;
        }
        return a;

    }

    public int[] makeMiddle(int[] nums) {
        return new int[]{ nums[(nums.length / 2) - 1], nums[nums.length / 2] };
    }

    public int[] plusTwo(int[] a, int[] b) {
        int[] ints = new int[a.length + b.length];
        for (int i = 0; i < a.length; i++) {
            ints[i] = a[i];
        }
        int counter = 0;
        for (int i = a.length; i < ints.length; i++) {
            ints[i] = b[counter];
            counter++;
        }
        return ints;

    }

    public int[] swapEnds(int[] nums) {
        int temp = nums[0];
        nums[0] = nums[nums.length - 1];
        nums[nums.length - 1] = temp;
        return nums;
    }

    public int[] midThree(int[] nums) {
        return new int[]{ nums[(nums.length / 2) - 1], nums[nums.length / 2], nums[(nums.length / 2) + 1] };
    }

    public int maxTriple(int[] nums) {
        int first = nums[0];
        int last = nums[nums.length - 1];
        int middle = nums[nums.length / 2];

        return Math.max(last, Math.max(first, middle));
    }

    public int[] frontPiece(int[] nums) {
        if (nums.length < 2) {
            return nums;
        }
        return new int[]{ nums[0], nums[1] };
    }

    public boolean unlucky1(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (i <= 1 || i >= nums.length - 1) {
                if (nums[i] == 1 && nums[i + 1] == 3) {
                    return true;
                }
            }

        }
        return false;

    }

    public int[] make2(int[] a, int[] b) {
        int[] ints = new int[2];
        int counter = 0;
        for (int i = 0; i < a.length; i++) {
            if (counter <= 2) {
                ints[counter] = a[i];
                counter++;
            }
        }
        for (int i = 0; i < b.length; i++) {
            if (counter <= 2) {
                ints[counter] = b[i];
                counter++;
            }
        }
        return ints;

    }

    public int[] front11(int[] a, int[] b) {
        int firstA = 0;
        int firstB = 0;
        if (a.length > 0) {
            firstA = a[0];
        }
        if (b.length > 0) {
            firstB = b[0];
        }
        if (firstA != 0 && firstB != 0) {
            return new int[]{ firstA, firstB };
        }
        if (firstA != 0 && firstB == 0) {
            return new int[]{ firstA };
        }
        if(firstA == 0 && firstB == 0){
            return new int[]{};
        }
        return new int[]{ firstB };
    }


}
