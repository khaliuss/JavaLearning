package OOP.Lesson4;

public class Box {

    double length;
    double width;
    double height;

    Box(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    Box() {
        this.length = 0;
        this.width = 0;
        this.height = 0;
    }



    double result() {
        return length * width * height;
    }

}
