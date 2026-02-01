package interfaces;

import сollection.classes.Car;

public interface CarSet extends CarCollection {

    boolean add(Car car);
    boolean remove(Car car);
    int size();
    void clear();
}
