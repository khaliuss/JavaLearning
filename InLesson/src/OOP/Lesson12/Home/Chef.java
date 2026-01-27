package OOP.Lesson12.Home;

public class Chef implements Worker,Driver{
    @Override
    public void work() {
        System.out.println("Chef is working");
    }

    @Override
    public void drive() {
        System.out.println("Chef is driving");
    }
}
