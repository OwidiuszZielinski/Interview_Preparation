package org.example.codingbat;

import java.util.*;
import java.util.stream.Collectors;

public class Map2 {
    public static void main(String[] args) {
        wordAppendT(new String[]{ "a", "b", "b", "b", "a", "c", "a", "a", "a", "b", "a" });
        allSwap(new String[]{ "ax", "bx", "cx", "cy", "by", "ay", "aaa", "azz" });
    }

    public Map<String, Integer> word0(String[] strings) {
        Map<String, Integer> stringIntegerMap = new HashMap<>();
        for (String x : strings) {
            stringIntegerMap.put(x, 0);
        }
        return stringIntegerMap;
    }

    public Map<String, Integer> word02(String[] strings) {
        return Arrays.stream(strings)
                .distinct()
                .collect(Collectors.toMap(s -> s, value -> 0));
    }

    public Map<String, Integer> wordLen(String[] strings) {
        return Arrays.stream(strings)
                .distinct()
                .collect(Collectors.toMap(s -> s.substring(0, 1), String::length));
    }


    public Map<String, String> pairs(String[] strings) {
        Map<String, String> map = new HashMap<>();
        for (String x :
                strings) {
            map.put(x.substring(0, 1), x.substring(x.length() - 1));
        }
        return map;
    }

    public Map<String, Integer> wordCount(String[] strings) {
        Map<String, Integer> map = new HashMap<>();

        for (String x : strings) {
            if (map.containsKey(x)) {
                map.put(x, map.get(x) + 1);
                continue;
            }
            map.put(x, 1);

        }
        return map;

    }

    public Map<String, String> firstChar(String[] strings) {
        Map<String, String> map = new HashMap<>();
        for (String x : strings) {
            String substring = x.substring(0, 1);
            if (map.containsKey(substring)) {
                map.put(substring, map.get(substring).concat(x));
                continue;
            }
            map.put(substring, x);
        }
        return map;
    }

    public static String wordAppendT(String[] strings) {
        Map<String, Integer> map = new HashMap<>();
        StringBuilder builder = new StringBuilder();
        int counter = 0;
        for (String x : strings) {
            if (map.containsKey(x)) {
                map.put(x, map.get(x) + 1);
                if (map.get(x) % 2 == 0) {
                    builder.append(x);
                }
                continue;
            }
            map.put(x, 1);

        }
        return builder.toString();

    }

    public Map<String, Boolean> wordMultiple(String[] strings) {
        Map<String, Integer> map = new HashMap<>();
        Map<String, Boolean> mapRes = new HashMap<>();

        for (String x : strings) {
            if (map.containsKey(x)) {
                map.put(x, map.get(x) + 1);
                continue;
            }
            map.put(x, 1);

        }
        for (Map.Entry<String, Integer> x : map.entrySet()) {
            if (x.getValue() >= 2) {
                mapRes.put(x.getKey(), true);
                continue;
            }
            mapRes.put(x.getKey(), false);
        }
        return mapRes;
    }

    public static String[] allSwap(String[] strings) {
        String[] result = new String[strings.length];
        List<String> listFirst = new ArrayList<>();
        for (int i = 0; i < strings.length; i++) {
            for (int j = i + 1; j < strings.length; j++) {
                String prefix = strings[j].substring(0, 1);
                if (strings[i].startsWith(prefix)) {
                    if(listFirst.contains(prefix)){
                        continue;
                    }
                    if (result[i] == null) {
                        result[i] = strings[j];
                        result[j] = strings[i];
                        listFirst.add(prefix);
                        break;
                    }
                }
            }
        }
        for (int i = 0; i < result.length; i++) {
            if(result[i]==null){
                result[i] = strings[i];
            }
        }

        return result;
    }

}
