package lesson.сollection.list;

import lesson.сollection.classes.Car;
import lesson.interfaces.CarList;

import java.util.Arrays;
import java.util.Iterator;

public class CarArrayList implements CarList {

    private Car[] array = new Car[10];
    private int size = 0;



    @Override
    public Car get(int index) {
        checkIndex(index);
        return array[index];
    }

    @Override
    public boolean add(Car car) {
       updateSizeOfArray();
        array[size] = car;
        size++;
        return true;
    }

    @Override
    public boolean add(Car car, int index) {
        updateSizeOfArray();
        /*for (int i = size; i > index; i--) {
                array[i] = array[i-1];
        }*/
        if (index<0 || index > size){
            throw new IndexOutOfBoundsException();
        }
        System.arraycopy(array,index,array,index+1,size-index);
        array[index] = car;
        size++;
        return true;
    }

    /*@Override
    public void add(Car car, int index) {
        for (int i = index; i <= size; i++) {
            if (i != size){
                array[i+1] = array[i];
            }else {
                array[index] = car;
                break;
            }
        }
        size++;
    }*/

    @Override
    public boolean remove(Car car){
        for (int i = 0; i < size; i++) {
            if (array[i].equals(car)){
                return removeAt(i);
            }
        }
        return false;
    }

    @Override
    public boolean removeAt(int index) {
        checkIndex(index);
        /*for (int i = index; i < size-1; i++) {
            array[i] = array[i+1];
        }*/

        System.arraycopy(array,index,array,index-1,size-index);

        size--;
        return true;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void clear() {
        size = 0;
        array = new Car[10];
    }

    @Override
    public boolean contains(Car car) {
        for (int i = 0; i < size; i++) {
            if (array[i].equals(car)){
                return removeAt(i);
            }
        }
        return false;
    }

    private void checkIndex(int index){
        if (index<0 || index>=size){
            throw new IndexOutOfBoundsException();
        }
    }

    private void updateSizeOfArray(){
        if (size >= array.length){
            /*Car[] newArray = new Car[array.length*2];
            for (int a = 0; a < array.length; a++) {
                newArray[a] = array[a];
            }
            array = newArray;*/
            array = Arrays.copyOf(array,array.length*2);
        }
    }

    @Override
    public Iterator<Car> iterator() {

        return new Iterator<Car>() {

            int index = 0;

            @Override
            public boolean hasNext() {
                return index<size;
            }

            @Override
            public Car next() {
                Car car = array[index];
                index++;
                return car;
            }
        };
    }
}
