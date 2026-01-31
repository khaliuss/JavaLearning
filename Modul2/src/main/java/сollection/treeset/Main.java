package сollection.treeset;

import сollection.Car;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    static void main() {
        Set<Car> cars = new TreeSet<>(new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                return o1.getBrand().compareTo(o2.getBrand());
            }
        });

        for (int i = 0; i < 100; i++) {
            cars.add(new Car("Bra "+i,i+2000));
        }

        for(Car car : cars){
            System.out.println(car);
        }


        Set<Integer> numbers = new TreeSet<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                /*int num1 = (int) o1;
                int num2 = (int) o2;
                if (num1 < num2){
                    return 1;
                }else if (num1 > num2){
                    return -1;
                }else {
                    return 0;
                }*/
                return -o1.compareTo(o2);
            }
        });


        for (int i = 0; i < 100; i++) {
            numbers.add((int)(Math.random()*10));
        }

        for(int number : numbers){
            System.out.print(number+" ");
        }


    }

}
