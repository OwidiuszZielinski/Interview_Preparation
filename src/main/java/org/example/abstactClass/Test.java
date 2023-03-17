package org.example.abstactClass;

import java.sql.Time;
import java.util.*;
import java.util.stream.Collectors;

public class Test {

    public static void main(String[] args) {


        String amazonTest = "aaaaaaaaaaaaaabbbbbbbbbbbbccccccccccccccddddddddddddefffffffffffggggggghhhhhh";

        HashMap<String,Integer> hashMap = new HashMap<>();


        for (int i = 0; i < amazonTest.length(); i++) {
            if(hashMap.containsKey(Character.toString(amazonTest.charAt(i)))){
                hashMap.put(String.valueOf(amazonTest.charAt(i)),hashMap.get(Character.toString(amazonTest.charAt(i)))+1);
                continue;
            }
            hashMap.put(String.valueOf(amazonTest.charAt(i)),1);
        }
        System.out.println(hashMap);
        System.out.println(hashMap.entrySet().stream().min(Comparator.comparingDouble(Map.Entry::getValue)).get());
        System.out.println(Runtime.getRuntime().availableProcessors());

        System.out.println(getDelayTo4PM());
        System.out.println(24 * 60 * 60 * 1000);
        final int[] counter = { 0 };
        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                System.out.println("xD"+ counter[0]++);
            }
        },10000,1000);

    }

    private static long getDelayTo4PM() {
        Calendar now = Calendar.getInstance();
        System.out.println(now);

        Calendar fourPm = Calendar.getInstance();
        fourPm.set(Calendar.HOUR_OF_DAY, 16);
        fourPm.set(Calendar.MINUTE, 0);
        fourPm.set(Calendar.SECOND, 0);
        fourPm.set(Calendar.MILLISECOND, 0);
        if (fourPm.before(now)) {
            fourPm.add(Calendar.DATE, 1);
        }
        return fourPm.getTimeInMillis() - now.getTimeInMillis();
    }

}
