package revision;

import java.util.ArrayList;
import java.util.List;

public class Algo {

    public static void main(String[] args) {
        long a = 1;
        long b = 1;
        long fib = 0;
        List<Long> list = new ArrayList<>();
        list.add(a);
        list.add(b);
        for (int i = 0; i < 55; i++) {
            fib = a + b;
            list.add(fib);
            a = b;
            b = fib;

        }
        System.out.println(list);

    }
}
