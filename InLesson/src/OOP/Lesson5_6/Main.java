package OOP.Lesson5_6;

public class Main {

    static void main() {
        Box box = new Box(2,2,2);
        Box box1= box.increase();
        box.showInfo();
        box1.showInfo();
    }

}
