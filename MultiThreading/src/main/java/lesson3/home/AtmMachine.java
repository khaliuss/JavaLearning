package lesson3.home;

public class AtmMachine {

    private long funds = 1_000_000;
    private final Object monitor = new Object();

    //for .join method
    /*public  void withdrawal(String name, long amount) {
        System.out.println(name + " подошел к банкомату");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        if (amount <= funds) {
            funds -= amount;
            System.out.println(name + " вывел " + amount + " сумма рублей.");
            System.out.println("В банкомате осталось: "+funds+" рублей");
        } else {
            System.out.println("В банкомате недостаточно средств для " + name);
        }
    }*/

    //for sync method with this
    /*public synchronized void withdrawal(String name, long amount) {
        System.out.println(name + " подошел к банкомату");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        if (amount <= funds) {
            funds -= amount;
            System.out.println(name + " вывел " + amount + " сумма рублей.");
            System.out.println("В банкомате осталось: "+funds+" рублей");
        } else {
            System.out.println("В банкомате недостаточно средств для " + name);
        }
    }*/

    public void withdrawal(String name, long amount) {
        synchronized (monitor){
            System.out.println(name + " подошел к банкомату");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            if (amount <= funds) {
                funds -= amount;
                System.out.println(name + " вывел " + amount + " сумма рублей.");
                System.out.println("В банкомате осталось: "+funds+" рублей");
            } else {
                System.out.println("В банкомате недостаточно средств для " + name);
            }
        }
    }
}
