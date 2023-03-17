package org.example.codingbat;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        //System.out.println(altPairs("Chocolate"));
        //System.out.println(noTriplesT(new int[]{ 1, 1, 2, 2, 2, 1 }));
        System.out.println(has271(new int[]{ 2, 7, -1 }));

        HashMap<String, String> map = new HashMap<>();
        map.put("a", "Hi");
        map.put("b", "There");
        System.out.println(mapAB(map));

        System.out.println(bunnyEars2(10));
        System.out.println(triangle(5));
        System.out.println(sumDigits(7307658));
    }


    public static String altPairs(String str) {
        int counter = 0;
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < str.length(); i++) {
            if (counter == 2) {
                i += 1;
                counter = 0;
                continue;
            }
            counter++;
            stringBuffer.append(str.charAt(i));
        }
        return stringBuffer.toString();
    }

    public String stringYak(String str) {
        return str.replaceAll("yak", "");
    }

    public int array667(int[] nums) {
        int counter = 0;
        for (int n = 0; n < nums.length - 1; n++) {
            if (nums[n] == 6 && (nums[n + 1] == 6 || nums[n + 1] == 7)) {
                counter++;
            }
        }
        return counter;
    }

    public static boolean noTriples(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int n = 0; n < nums.length; n++) {
            if (map.containsKey(nums[n])) {
                int value = map.get(nums[n]) + 1;
                map.put(nums[n], value);
                continue;
            }
            map.put(nums[n], 1);
        }
        System.out.println(map);

        return map.containsValue(3);
    }

    public static boolean noTriplesT(int[] nums) {
        int value = 0;
        int counter = 1;
        for (int i = 0; i < nums.length - 1; i++) {
            if (counter == 3) {
                return false;
            }
            value = nums[i];
            if (value == nums[i + 1]) {
                counter++;
                continue;
            }
            counter = 1;
        }
        return counter != 3;
    }

    public static boolean has271(int[] nums) {
        int first = 0;
        int second = 0;
        int third = 0;
        for (int i = 0; i < nums.length - 2; i++) {
            first = nums[i];
            second = nums[i + 1];
            third = nums[i + 2];
            int diff = second - first;
            System.out.println(first - (third));
            if (diff == 5 && first - (third) <= 3 && first - third >= -1) {
                return true;
            }

        }
        return false;
    }

    public Map<String, String> mapBully(Map<String, String> map) {
        String a = "";
        if (map.containsKey("a")) {
            a = map.get("a");
            map.put("a", "");
            map.put("b", a);
        }
        return map;
    }

    public Map<String, String> mapShare(Map<String, String> map) {
        String a = "";
        if (map.containsKey("a")) {
            a = map.get("a");
            map.put("b", a);
        }
        map.remove("c");
        return map;
    }

    public static Map<String, String> mapAB(Map<String, String> map) {
        if (map.containsKey("a") && map.containsKey("b")) {
            map.put("ab", map.get("a").concat(map.get("b")));
        }
        return map;
    }

    public static Map<String, String> topping1(Map<String, String> map) {
        String a = "";
        if (map.containsKey("ice cream")) {
            a = map.get("ice cream");
            map.put("yogurt", a);
        }
        if (map.containsKey("spinach")) {
            map.put("spinach", "nuts");
        }
        return map;
    }

    public Map<String, String> topping3(Map<String, String> map) {
        String a = "";
        if (map.containsKey("potato")) {
            a = map.get("potato");
            map.put("fries", a);
        }
        if (map.containsKey("salad")) {
            a = map.get("salad");
            map.put("spinach", a);
        }
        return map;
    }

    public Map<String, String> mapAB2(Map<String, String> map) {
        if (map.containsKey("a") && map.containsKey("b")) {
            String a = map.get("a");
            String b = map.get("b");
            if (a.equals(map.get("c")) && a.length() > 0) {
                return map;
            }
            if (a.length() > 1 && map.size() > 2) {
                map.remove("a");
                map.remove("b");
            }

        }

        return map;
    }

    public Map<String, String> mapAB3(Map<String, String> map) {
        String a1 = map.get("a");
        String b1 = map.get("b");
        if (a1 != null && b1 != null) {
            int a = a1.length();
            int b = b1.length();

            if (a > b) {
                map.put("c", a1);

            }
            if (b > a) {
                map.put("c", map.get("b"));

            }
            if (a == b) {
                map.put("a", "");
                map.put("b", "");
            }
        }
        return map;

    }

    public int factorial(int n) {
        if (n == 0) {
            return 1;
        } else
            return n * factorial(n - 1);
    }

    public static int bunnyEars2(int bunnies) {
        int b = 0;
        if (bunnies == 0) {
            return 0;
        }
        b = bunnies - 1;
        if (b % 2 == 0) {
            return 2 + bunnyEars2(bunnies - 1);
        }
        return 3 + bunnyEars2(bunnies - 1);

    }

    public int fibonacci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1 || n == 2) {
            return 1;
        } else
            return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static int triangle(int rows) {
        if (rows == 0) {
            return 0;
        } else
            return rows + triangle(rows - 1);
    }

    public static int sumDigits(int n) {

        if (n < 10) {
            return n;
        } else {
            int i = n % 10 + sumDigits(n / 10);
            System.out.println(i);
            return i;
        }
    }

}

