package lesson5;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchMethod2 {

    static void main() {

        CountDownLatch countDownLatch = new CountDownLatch(10);


        for (int i = 0; i < 10; i++) {
            final int index = i;
            new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.println("Start - " + index);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println("Finish - " + index);
                    countDownLatch.countDown();
                }
            }).start();
        }

        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("All threads are terminated");

    }
}
