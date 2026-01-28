package Multithreading;

import java.util.Random;

public class GuessNum {

    static Random random = new Random();
    static int guess = random.nextInt(1_000_000_000);
    static boolean isNotGuessed = true;

    static void main() {

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                Random random2 = new Random();
                int guess2 =0;

                while (isNotGuessed){
                    guess2 = random.nextInt(1_000_000_000);
                    if (guess == guess2){
                        isNotGuessed = false;
                        System.out.println("YOU GUESSED: "+guess);
                    }
                }
            }
        });
        thread1.start();

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
               int count = 0;
               try{
                   while (isNotGuessed) {
                       System.out.println(count++);
                       Thread.sleep(1000);
                   }
               }catch (Exception e){
                   System.out.println("Exception: "+e.getClass());
               }
            }
        });
        thread2.start();


    }
}
