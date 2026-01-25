package OOP.Lesson1.Home;

public class Main {

    static void main() {
        Person person1 = new Person();
        person1.name =  "Kick";
        person1.age =  22;
        person1.height =  180;

        Person person2 = new Person();
        person2.name =  "John";
        person2.age =  42;
        person2.height =  189;

        Person person3 = new Person();
        person3.name =  "Bob";
        person3.age =  29;
        person3.height =  168;

        float averageAge = (person1.age + person2.age + person3.age)/3f;


        System.out.println(averageAge);
    }
}
