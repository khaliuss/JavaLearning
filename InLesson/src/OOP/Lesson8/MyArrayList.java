package OOP.Lesson8;

import java.util.Arrays;
import java.util.Objects;

public class MyArrayList {

    private String[] array = new String[10];
    private int size =0;

    public String get(int index) {
        return array[index];
    }

    public void add(String string){
        array[size] = string;

        size++;

        if (size == array.length) {
            String[] newArray = new String[array.length * 2];
            for (int i = 0; i < array.length; i++) {
                newArray[i] = array[i];
            }
            array = newArray;
        }
    }

    public void removeAt(int index){
        for (int i = index; i < size -1; i++) {
            array[i] = array[i+1];
        }
        array[size -1] = null;
        size--;
    }

    public void removeAt(String string){
        for (int i = 0; i < array.length; i++) {
            if (Objects.equals(array[i], string)){
                removeAt(i);
                return;
            }
        }
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "MyArrayList{" +
                "array=" + Arrays.toString(array) +
                '}';
    }
}
