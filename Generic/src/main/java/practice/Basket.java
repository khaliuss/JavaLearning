package practice;

import java.util.ArrayList;
import java.util.List;

public class Basket<T extends Fruit> {

    private List<T> fruits;

    public Basket() {
        fruits = new ArrayList<>();
    }

    public double getWeight() {
        double fullWeight = 0;
        for (T fruit : fruits) {
            fullWeight += fruit.getWeight();
        }
        return fullWeight;
    }

    public void add(T fruit) {
        fruits.add(fruit);
    }

    public int compare(Basket<?> another) {
        return Double.compare(this.getWeight(), another.getWeight());
    }


    public static <U extends Fruit> void transfer(Basket<? extends U> src,Basket<? super U> dst) {
        /*dst.fruits.addAll(src.fruits);*/

        for (int i =0;i<src.fruits.size();i++){
            dst.fruits.add(src.fruits.get(i));
        }

        src.fruits.clear();
    }
}
