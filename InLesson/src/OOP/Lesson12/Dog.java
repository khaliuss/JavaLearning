package OOP.Lesson12;

public class Dog extends Animal implements AbleToRun{


    @Override
    public void eat() {
        System.out.println("Dog food");
    }


    public void run() {
        System.out.println("Dog runs");
    }
}
