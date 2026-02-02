public class Main {
    static void main() {
        System.out.println("Start");

        Thread method1 = new MyThreadMethod1();
        method1.start();

        MyRunnableMethod2 myRunnable = new MyRunnableMethod2();

        Thread method2 = new Thread(myRunnable);
        method2.start();

        for (int i = 0; i < 1000; i++) {
            System.out.print("A");
        }
        System.out.println("\nFinish");

    }
}
