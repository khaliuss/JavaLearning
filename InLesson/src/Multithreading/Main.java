package Multithreading;

public class Main {

    static boolean isFive = false;

    static void main() {
        /*Timer timer = new Timer();
        Thread thread = new Thread(timer);
        thread.start();*/

        /*for (int i = 0; i < 1000; i++) {
            System.out.println("2");
        }*/


        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    if (i == 5){
                        isFive = true;
                    }
                    System.out.println(i);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        });
        thread.start();

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    if (isFive){
                        break;
                    }
                    System.out.println(i);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        });
        thread2.start();




    }
}
