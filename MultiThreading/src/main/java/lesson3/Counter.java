package lesson3;

import java.util.Objects;

public class Counter {

    private final Object monitor = new Object();
    private final Object monitor2 = new Object();
    private int value;
    private int value2;


    /* В качестве монитора используются тот объект У которого вызывается данный метод

    public synchronized void inc() {
        value++;
    }

    public synchronized void dec() {
        value--;
    }*/

    public  void inc() {
        synchronized (monitor) {
            value++;
        }
    }

    public  void dec() {
        synchronized (monitor) {
            value--;
        }
    }

    public  int getValue() {
        return value;
    }


    public  void inc2() {
        synchronized (monitor2) {
            value2++;
        }
    }

    public  void dec2() {
        synchronized (monitor2) {
            value2--;
        }
    }

    public int getValue2() {
        return value2;
    }
}
