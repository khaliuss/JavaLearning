package OOP.Lesson12;

public class Cat extends Animal implements  AbleToRun{
    @Override
    public void eat() {
        System.out.println("Cat food");
    }

    @Override
    public void run() {
        System.out.println("Cat runs");
    }
}
