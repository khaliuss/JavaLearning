package OOP.Lesson4;

import OOP.Lesson3.Rect;
import OOP.Lesson3.Test;

public class Main {
    static void main() {
        Test test = new Test();
        System.out.println(test.square(20));

        Box box = new Box(12,23,10);
        System.out.println(box.result());


        Employee employee = new Employee("Kir","Coder",2_000);
        employee.showInfo();

    }
}
