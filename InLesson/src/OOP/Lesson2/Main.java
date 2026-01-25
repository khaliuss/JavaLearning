package OOP.Lesson2;

import OOP.Lesson2.Home.Dog;

public class Main {
    static void main() {
        Box box1 = new Box();
        box1.height = 10;
        box1. length = 10;
        box1.width = 10;

        System.out.println(box1.getVolume());

        Dog dogy = new Dog();
        dogy.name  = "Benjamin";
        dogy.breed = "Dolma";
        dogy.wight = 12;
        dogy.speed = 25;

        System.out.println(dogy.getDogInformation());

        dogy.run();


    }
}
