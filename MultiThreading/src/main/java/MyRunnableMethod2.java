public class MyRunnableMethod2 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.print("M2-"+i);
        }
    }
}
