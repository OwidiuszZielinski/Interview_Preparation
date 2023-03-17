package org.example.algorithms;

public class IntegerCounter {

    private int count = 0;

    public void countByThreeThreads(int maxCount) {
        // Create three threads to count the integers
        Thread thread1 = new Thread(new CountRunnable(1, maxCount, 3));
        Thread thread2 = new Thread(new CountRunnable(2, maxCount, 3));
        Thread thread3 = new Thread(new CountRunnable(3, maxCount, 3));

        // Start the threads
        thread1.start();
        thread2.start();
        thread3.start();

        try {
            // Wait for the threads to finish
            thread1.join();
            thread2.join();
            thread3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private class CountRunnable implements Runnable {
        private int threadId;
        private int maxCount;
        private int incrementBy;

        public CountRunnable(int threadId, int maxCount, int incrementBy) {
            this.threadId = threadId;
            this.maxCount = maxCount;
            this.incrementBy = incrementBy;
        }

        @Override
        public void run() {
            // Count integers in increments of incrementBy until maxCount is reached
            while (count < maxCount) {
                synchronized (IntegerCounter.this) {
                    if ((count % 3) == (threadId - 1)) {
                        System.out.println("Thread " + threadId + ": " + count);
                        count += incrementBy;
                        IntegerCounter.this.notifyAll();
                    } else {
                        try {
                            IntegerCounter.this.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }
    }
}
