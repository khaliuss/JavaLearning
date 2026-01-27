package OOP.Lesson12;

import java.util.ArrayList;

public class Main {
    static void main() {
        Cat cat = new Cat();
        Dog dog = new Dog();
        Bird bird = new Bird();
        Fish fish = new Fish();

        ArrayList<Animal> animals = new ArrayList<>();

        animals.add(cat);
        animals.add(dog);
        animals.add(bird);
        animals.add(fish);

        for (Animal animal : animals){
            animal.eat();
        }

        Animal animal = new Dog();
        animal.eat();


        ArrayList<AbleToRun> animals2 = new ArrayList<>();

        animals2.add(cat);
        animals2.add(dog);

        for (AbleToRun ableToRun : animals2 ){
            ableToRun.run();
        }

        ArrayList<AbleToFly> animals3 = new ArrayList<>();

        animals3.add(bird);

        for (AbleToFly ableToFly : animals3 ){
            ableToFly.toFly();
        }


    }
}
