package OOP.Lesson1;

public class Main {
    static void main() {
        Box box1 = new Box();
        box1.height = 10;
        box1. length = 10;
        box1.width = 10;
        Box box2 = new Box();
        Box box3 = box2;
        box2.height = 20;
        box2.length = 20;
        box2.width = 20;
        box3.width =0;
        double volume = box1.height * box1.length * box1.width;
        System.out.println(volume);
        double volume2 = box2.height * box2. length * box2.width;
        System.out.println(volume2);
    }
}
