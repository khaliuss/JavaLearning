package lesson3;

public class RaceCondition {
    static void main() {
        Counter counter = new Counter();
       /*
        for (int i = 0; i < 1000; i++) {
            counter.inc();
        }

        for (int i = 0; i < 1000; i++) {
            counter.dec();
        }

        System.out.println(counter.getValue());*/

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    counter.inc();
                }
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    counter.dec();
                }
            }
        });

        thread1.start();
        thread2.start();
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(counter.getValue());

    }
}
