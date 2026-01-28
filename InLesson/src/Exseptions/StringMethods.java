package Exseptions;

import OOP.Lesson7.Person;

import java.util.Random;

public class StringMethods {
    static void main() {
        Person person = new Person("John",17,190);

        System.out.println(person);

        Random random = new Random();

        for (int i = 0; i < 100; i++) {
            int a = random.nextInt(5,11 );
            System.out.print(a+" ");
        }
        System.out.println();


        Random cub = new Random();

        for (int i = 0; i < 100; i++) {
            int play = cub.nextInt(1,7);
            System.out.println(String.format("You score is %d",play));
        }



    }
}
