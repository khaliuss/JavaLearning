package lesson5.home;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    static void main() {

//        ExecutorService executorService3 = Executors.newFixedThreadPool(3);
        ExecutorService executorService3 = Executors.newSingleThreadExecutor();
        CountDownLatch countDownLatch = new CountDownLatch(3);

        Runnable task1 = new Runnable() {
            @Override
            public void run() {
                long sum = 0;
                for (int i = 0; i < 50_000_000; i++) {
                    if (i % 2 == 0) {
                        sum += i;
                    }
                }
                System.out.println("method1 = " + sum);
                countDownLatch.countDown();
            }
        };

        Runnable task2 = new Runnable() {
            @Override
            public void run() {
                long sum = 0;

                for (int i = 0; i < 51_000_000; i++) {
                    if (i % 7 == 0) {
                        sum += i;
                    }
                }

                System.out.println("method2 = " + sum);
                countDownLatch.countDown();
            }
        };

        Runnable task3 = new Runnable() {
            @Override
            public void run() {
                List<Integer> array = new ArrayList<>();

                for (int i = 0; i < 1_000; i++) {
                    array.add(new Random().nextInt(1000));
                }
                int count = 0;
                for (int ar : array) {
                    if (ar % 2 == 0) {
                        count++;
                    }
                }
                System.out.println("method3 = "+count);
                countDownLatch.countDown();
            }
        };

        long startTime = System.currentTimeMillis();
        executorService3.execute(task1);
        executorService3.execute(task2);
        executorService3.execute(task3);
        executorService3.shutdown();
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        long entTime = System.currentTimeMillis();



        System.out.println("\n" + (entTime - startTime));


    }
}
