package OOP.Lesson11;

public final class Rectangle extends Shape{



    public Rectangle(double a, double b) {
        super(a, b);
    }

    @Override
    public double perimeter() {
        return (getA()+getB())*2;
    }


}
