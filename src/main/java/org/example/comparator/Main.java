package org.example.comparator;

import java.util.*;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {

        List<Animal> list = new ArrayList<>();

        list.add(new Animal(14, "O"));
        list.add(new Animal(15, "Ob"));
        list.add(new Animal(17, "Oc"));
        list.add(new Animal(11, "Od"));
        list.add(new Animal(13, "Ox"));

//        for (Animal x : list) {
//            if (x.getAge() > 11) {
//                list.remove(x);
//            }
//        }
//        System.out.println(list);


        Iterator<Animal> iterator = list.iterator();
        while (iterator.hasNext()) {
            Animal x = iterator.next();
            if (x.getAge() > 11) {
                iterator.remove();
            }
        }
        System.out.println(list);



        Function<Integer,String> function = x -> x + "Siema";
        System.out.println(function.apply(15));

    }
}
