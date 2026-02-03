package lesson3.home;

public class Main {
    static void main() {

        AtmMachine atmMachine = new AtmMachine();
        //with .join method
        /*Thread thread = new Thread(new Runnable() {

            @Override
            public void run() {
                atmMachine.withdrawal("Thread 1",900_000);
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    thread.join();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                atmMachine.withdrawal("Thread 2",900_000);
            }
        });

        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    thread2.join();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                atmMachine.withdrawal("Thread 3",900_000);
            }
        });*/

        Thread thread = new Thread(new Runnable() {

            @Override
            public void run() {
                atmMachine.withdrawal("Thread 1",1_900_000);
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                atmMachine.withdrawal("Thread 2",900_000);
            }
        });

        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                atmMachine.withdrawal("Thread 3",900_000);
            }
        });

        thread.start();
        thread2.start();
        thread3.start();


    }
}
