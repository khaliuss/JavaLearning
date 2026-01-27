package OOP.Lesson10;

public class Main {

    static void main() {
        Cat cat =  new Cat();
        Lion lion = new Lion();
        WeightBox weightBox = new WeightBox(12);

        weightBox.showInfo();

        System.out.println(cat.isCanEatAHuman());
        System.out.println(lion.isCanEatAHuman());

        cat.eat();
        lion.eat();


    }


}
