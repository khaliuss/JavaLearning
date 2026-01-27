package OOP.Lesson10;

public class Lion  extends CatFamily{

    public Lion(){
        super(4,2,true);
    }

    @Override
    public void eat(){
        super.eat();
        System.out.println("a Human");
    }

}
