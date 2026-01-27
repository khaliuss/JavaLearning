package OOP.Lesson13;

public class Programmer implements Worker, Driver {
    @Override
    public void work() {
        System.out.println("Programmer is working");
    }

    @Override
    public void drive() {
        System.out.println("Programmer is driving");
    }
}
