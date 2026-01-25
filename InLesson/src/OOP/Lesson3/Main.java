package OOP.Lesson3;

public class Main {
    static void main() {
        Test test = new Test();
        System.out.println(test.square(20));

        Box box = new Box();
        box.setDimens(12,23,10);
        System.out.println(box.result());

        Rect rec = new Rect();
        rec.setDimens(12,23);
        System.out.println(rec.square());

    }
}
