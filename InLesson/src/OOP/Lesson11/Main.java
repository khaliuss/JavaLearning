package OOP.Lesson11;

import org.w3c.dom.UserDataHandler;

import java.util.ArrayList;

public class Main {

    static void main() {

        Rectangle rectangle = new Rectangle(2,6);
        ColorRect colorRect = new ColorRect(2,6);
        Triangle triangle = new Triangle(3,3,4);

        ArrayList<Shape> figures = new ArrayList<>();

        figures.add(rectangle);
        figures.add(triangle);

        for(Shape figure : figures){
            System.out.println(figure.perimeter());
        }
    }

}
