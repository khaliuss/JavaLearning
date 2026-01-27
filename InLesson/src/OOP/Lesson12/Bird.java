package OOP.Lesson12;

public class Bird extends Animal implements AbleToRun,AbleToFly{
    @Override
    public void eat() {
        System.out.println("Bird food");
    }

    @Override
    public void toFly() {
        System.out.println("Bird is flying");
    }

    @Override
    public void run() {
        System.out.println("Bird is running");
    }
}
