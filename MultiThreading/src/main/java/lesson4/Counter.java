package lesson4;

import java.util.concurrent.atomic.AtomicInteger;

public class Counter {


    private AtomicInteger value = new AtomicInteger();

//    Говорит потоку чтобы он не кешировал а брал из основной памяти
//    private volatile int value = new AtomicInteger();


    public void inc() {
        value.getAndIncrement();
    }

    public void dec() {
        value.getAndDecrement();
    }

    public int getValue() {
        return value.intValue();
    }


}
