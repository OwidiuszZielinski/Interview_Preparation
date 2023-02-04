package org.example.theards;

public class MyRunnable implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i <10 ; i++) {
            System.out.println("Thread #1 : " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Thread number one finished");
    }
}
