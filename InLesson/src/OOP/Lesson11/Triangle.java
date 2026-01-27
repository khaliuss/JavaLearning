package OOP.Lesson11;

public class Triangle extends Shape{

    private double c;

    public Triangle(double a, double b, double c) {
        super(a, b);
        this.c = c;
    }

    @Override
    public double perimeter() {
        return getA()+getB()+c;

    }
}
