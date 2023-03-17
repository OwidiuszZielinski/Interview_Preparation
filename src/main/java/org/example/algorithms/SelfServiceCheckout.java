package org.example.algorithms;

import java.text.DecimalFormat;
import java.util.*;
import java.util.stream.Collectors;

public class SelfServiceCheckout {

    public static void main(String[] args) {

        int[] queue = new int[]{ 2, 5, 11, 7, 6, 4, 2, 17, 12, 13, 14, 11, 3, 4, 5 };
        int checkout = 4;

        System.out.println(calculateTime(queue, checkout));

        List<String> words = List.of("apple", "banana", "cherry", "date", "elderberry", "fig", "grape");


        Map<Integer, Long> map = words.stream().collect(Collectors.groupingBy(String::length, Collectors.counting()));

        System.out.println(map);
        System.out.println(countryLanguages());


    }

    public static double squareArea(double A) {
        return Double.parseDouble(new DecimalFormat("#.##").format(Math.pow((4 * A) / (2 * Math.PI), 2)));
    }

    public static String greet(String language) {
        if(countryLanguages().containsKey(language)){
            return countryLanguages().get(language);
        }
        return countryLanguages().get("english");
    }

    public static Map<String, String> countryLanguages() {
        String[][] countryAndLanguages = new String[][]{
                { "english", "Welcome" },
                { "czech", "Vitejte" },
                { "danish", "Velkomst" },
                { "dutch", "Welkom" },
                { "estonian", "Tere tulemast" },
                { "finnish", "Tervetuloa" },
                { "flemish", "Welgekomen" },
                { "french", "Bienvenue" },
                { "german", "Willkommen" },
                { "irish", "Failte" },
                { "italian", "Benvenuto" },
                { "latvian", "Gaidits" },
                { "lithuanian", "Laukiamas" },
                { "polish", "Witamy" },
                { "spanish", "Bienvenido" },
                { "swedish", "Valkommen" },
                { "welsh", "Croeso" } };
        System.out.println(countryAndLanguages.length);
        Map<String, String> stringStringMap = new HashMap<>();
        for (String[] countryAndLanguage : countryAndLanguages) {
            for (int j = 0; j < countryAndLanguage.length - 1; j++) {
                stringStringMap.put(countryAndLanguage[j], countryAndLanguage[j + 1]);
            }
        }
        return stringStringMap;
    }

    private static int calculateTime(int[] queue, int checkout) {
        int[] checkouts = new int[checkout];

        for (int i = 0; i < queue.length; i++) {
            checkouts[0] += queue[i];
            Arrays.sort(checkouts);

        }
        return checkouts[checkout - 1];

    }

}
