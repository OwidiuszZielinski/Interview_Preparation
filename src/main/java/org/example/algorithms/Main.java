package org.example.algorithms;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        //1
        List<Integer> list = Arrays.asList(1 ,2 ,3 ,4 ,5 ,6);
        sortArrays(list ,new LinkedList<>(list));

        //2
        treeIterator(new TreeSet<>(Arrays.asList("g" ,"z" ,"y" ,"p" ,"e")));

        //3
        System.out.println(fibo(10));

        //4
        System.out.println(mergeTwoListWithoutSorting(Arrays.asList(15 ,40 ,50 ,33 ,11) ,Arrays.asList(2 ,3 ,4 ,5 ,6 ,7)));
        System.out.println(mergeTwoListWithSorting(Arrays.asList(15 ,40 ,50 ,33 ,11) ,Arrays.asList(2 ,3 ,4 ,5 ,6 ,7)));

        swapVariableWithoutTemp(10 ,15);

        System.out.println(countValues(Arrays.asList("Owi","Owi","Ela","Ela","Ela","Ela")));

    }

    public static void sortArrays(List<Integer> list ,LinkedList<Integer> linkedList) {
        Collections.reverse(linkedList);
        Collections.reverse(list);
        System.out.println(linkedList + " LINKEDLIST");
        System.out.println(list + " LIST");

    }

    public static void treeIterator(TreeSet<String> treeSet) {
        for (String x : treeSet) {
            System.out.print(x);
        }
    }

    public static int fibo(int n) {
        if (n == 1 || n == 0) {
            return 1;
        } else
            return fibo(n - 1) + fibo(n - 2);
    }

    public static List<Integer> mergeTwoListWithoutSorting(List<Integer> listA ,List<Integer> listB) {
        List<Integer> result = new ArrayList<>();
        result.addAll(listA);
        result.addAll(listB);
        return result;
    }

    public static List<Integer> mergeTwoListWithSorting(List<Integer> listA ,List<Integer> listB) {
        List<Integer> result = new ArrayList<>();
        result.addAll(listA);
        result.addAll(listB);
        return result.stream()
                .sorted(Integer::compareTo)
                .toList();
    }

    private static HashMap<String, Integer> countLetters(String[] letters) {
        HashMap<String, Integer> map = new HashMap<>();
        for (String x : letters) {
            Integer integer = map.containsKey(x) ? map.put(x ,map.get(x) + 1) : map.put(x ,1);
        }
        return map;
    }

    private static HashMap<String,Integer> countValues(List<String> strings){
        HashMap<String,Integer> map = new HashMap<>();
        for (String x : strings) {
            map.put(x ,map.getOrDefault(x ,0) + 1);

        }
        return map;
    }

    //1.Swap variables
    private static void swapVariableWithoutTemp(int a ,int b) {
        System.out.println("BEFORE " + a);
        System.out.println("BEFORE " + b);
        b = a + b;
        a = b - a;
        b = b - a;
        System.out.println("AFTER " + a);
        System.out.println("AFTER " + b);
    }

    private static void stringReverser(String x) {
        StringBuilder result = new StringBuilder();
        for (int i = x.length() - 1; i >= 0; i--) {
            result.append(x.charAt(i));
        }
        System.out.println(result);
    }

    private static int[] sorter(int[] ints) {
        for (int i = 0; i < ints.length; i++) {
            for (int j = i; j < ints.length; j++) {
                if (ints[j] < ints[i]) {
                    int temp = ints[i];
                    ints[i] = ints[j];
                    ints[j] = temp;
                }
            }
        }
        return ints;
    }



}
