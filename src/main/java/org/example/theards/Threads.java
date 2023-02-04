package org.example.theards;

import java.util.Random;

public class Threads {

    public static void main(String[] args) throws InterruptedException {

        MyThread threadOne = new MyThread();
        MyRunnable threadTwo = new MyRunnable();
        Thread threadTree = new Thread(threadTwo);

//        threadOne.start();
//        threadTwo.run();
//        threadTree.start();
//
        StringBuffer stringBuffer = new StringBuffer("xD");
        System.out.println(stringBuffer.capacity());
        stringBuffer.append(5);
        System.out.println(stringBuffer.toString());

        System.out.println(printPotrojny(19));
        Random random = new Random();
        int rand = random.nextInt(0,10);
        System.out.println(rand);

        int x = 1;

        switch (x){
            case 1:
                System.out.println("siema");
                break;
            case 2 :
                System.out.println("siema 2");
                break;
            case 5 :
                System.out.println("Mamy 5 ");
                break;

            default:
                System.out.println("to nam sie zawsze wyswietli");
        }



//
//        for (int i = 3; i >0 ; i--) {
//            System.out.println(i);
//            Thread.sleep(1000);
//        }


    }


    public static String printPotrojny(int age){

        return age<18 ? "Nie mozesz kupic alko" : "Mozesz kupic alko";

    }


}
