public class MyThreadMethod1 extends Thread{

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.print("M1-"+i);
        }
    }
}
