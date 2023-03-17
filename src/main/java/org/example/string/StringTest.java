package org.example.string;

import java.util.*;
import java.util.stream.Collectors;

public class StringTest {

    public static void main(String[] args) {


        String your = "mother";
        StringBuffer sb = new StringBuffer();
        sb.append(your).append(your).append(your);
        System.out.println(sb.toString());
        System.out.println(sb.reverse());
        sb.ensureCapacity(2);
        sb.delete(1,10);
        System.out.println(sb);
        System.out.println(sb.capacity());

        String a = "Owi";
        String b = "Owi";
        String c = new String("Owi");
        System.out.println(a==b);
        System.out.println(a==c);
        System.out.println(a.equals(c));
        System.out.println(a.equals(b));
        String d = c.intern();
        System.out.println(d==a);

        Collection<Integer> col = new ArrayList<>();
        col.add(4);
        col.add(3);
        col.add(5);


        System.out.println(Collections.min(col));
        List<Integer> collect = col.stream().sorted(Comparator.naturalOrder()).toList();
        System.out.println(col);
        System.out.println(collect);

    }
}
