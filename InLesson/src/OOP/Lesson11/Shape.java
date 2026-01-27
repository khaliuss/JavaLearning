package OOP.Lesson11;

public abstract class Shape {

    private double a;
    private double b;

    public  Shape(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public abstract double perimeter();

    public final double getA() {
        return a;
    }

    public final double getB() {
        return b;
    }
}
