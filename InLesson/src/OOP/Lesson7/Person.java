package OOP.Lesson7;

public class Person {
    private String name;
    private int age;
    private int height;

    public Person(String name, int age, int height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }


    public void setAge(int age){
        if (age>=0){
            this.age = age;
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }


    public String getInform() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                '}';
    }

    @Override
    public String toString() {
        return String.format("Name: %s Age: %s Height: %s",name,age,height);
    }
}
