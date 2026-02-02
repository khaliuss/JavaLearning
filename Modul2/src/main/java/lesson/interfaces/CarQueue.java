package lesson.interfaces;

import lesson.сollection.classes.Car;

public interface CarQueue extends CarCollection{

    boolean add(Car car);
    Car peek();
    Car poll();

}
