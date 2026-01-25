package OOP.Lesson2.Home;

public class Dog {

    public String name;
    public String breed;
    public double wight;
    public double speed;

    public String getDogInformation(){
        return "Name: "+name +" Breed: "+ breed +" Weight: "+ wight;
    }

    public void run(){
        for (int i = 0; i < speed; i++) {
            System.out.print("Run ");
        }
    }

}
