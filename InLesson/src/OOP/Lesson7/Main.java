package OOP.Lesson7;

public class Main {
    static void main() {
        Person person  = new Person("John",23,173);
        person.setAge(30);

        System.out.println(person.getInform());
    }
}
