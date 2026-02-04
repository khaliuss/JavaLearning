package lesson6;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

public class Main {
    static void main() {

        ExecutorService executorService = Executors.newSingleThreadExecutor(new ThreadFactory() {
            @Override
            public Thread newThread(Runnable r) {
                Thread thread = new Thread(r);
                thread.setDaemon(true);
                return thread;
            }
        });

        Runnable timer = new Runnable() {
            @Override
            public void run() {
                int seconds = 0;
                try {
                    while (true) {
                        System.out.println(seconds);
                        seconds++;
                        Thread.sleep(1000);
                    }
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };


        executorService.execute(timer);

        for (int i = 0; i < 10; i++) {
            System.out.println(".....");
            try{
                Thread.sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }

        executorService.shutdown();

    }
}
