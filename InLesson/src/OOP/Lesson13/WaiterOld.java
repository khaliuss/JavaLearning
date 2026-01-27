package OOP.Lesson13;

public class WaiterOld implements Waiter{
    @Override
    public void bringOrder(String dish) {
        System.out.println("Brings "+dish);
    }
}
