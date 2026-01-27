package OOP.Lesson9;

import OOP.Lesson7.Person;

public class Main {
    static void main() {

        String str = "This is John.He is 27 years old";

        WrapperClasses w= new WrapperClasses();
        System.out.println(w.res);

        String name = str.substring(8,12);
        int age = Integer.parseInt(str.substring(19,21));
        Person person = new Person(name,age,176);
        System.out.println(person.getInform());


    }
}
