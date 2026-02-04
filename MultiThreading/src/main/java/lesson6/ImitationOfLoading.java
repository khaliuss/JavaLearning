package lesson6;

import java.util.concurrent.*;

public class ImitationOfLoading {

    static void main() {

        ExecutorService executorService = Executors.newFixedThreadPool(3,new ThreadFactory() {
            @Override
            public Thread newThread(Runnable r) {
                Thread thread = new Thread(r);
                thread.setDaemon(true);
                return thread;
            }
        });

        Runnable dots = new Runnable() {
            @Override
            public void run() {
                while (true){
                    System.out.print(".");
                    try {
                        Thread.sleep(300);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        };
        executorService.execute(dots);

        Future<String> futureName = executorService.submit(new Callable<>() {
            @Override
            public String call() throws Exception {
                Thread.sleep(5000);
                return "John";
            }
        });
        Future<Integer> futureAge = executorService.submit(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                return 25;
            }
        });


        try {
            String name = futureName.get();
            int age = futureAge.get();
            System.out.println("\nName: "+name+" Age: "+age);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }


        executorService.shutdown();
    }

}
