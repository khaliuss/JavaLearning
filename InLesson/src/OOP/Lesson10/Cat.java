package OOP.Lesson10;

public class Cat extends CatFamily{

    public Cat(){
        super(4,2,false);
    }

    @Override
    public void eat(){
        super.eat();
        System.out.println("Wisskas");
    }
}
