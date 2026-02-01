package interfaces;

import сollection.classes.Car;

public interface CarQueue extends CarCollection{

    boolean add(Car car);
    Car peek();
    Car poll();

}
