package lesson2;

import java.util.ArrayList;
import java.util.List;

public class Train3 {

    private static List<String> list;


    static void main() {

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                list = new ArrayList<>();
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                long before = System.currentTimeMillis();
                try {
                    thread1.join();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(list.size());

                long after = System.currentTimeMillis();
                System.out.println("Times : "+ (after-before));
            }
        });


        thread1.start();
        thread2.start();
    }
}
