import java.io.Serializable;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public class Box<T extends Number & Comparable<T> & Serializable> {
    private T[]   array;


    public Box(T... array) {
        this.array = array;
    }

    public double avg(){
        double result = 0;
        for (T elemnt : array){
            result += elemnt.doubleValue();
        }
        return result/array.length;
    }

    public int compare(Box<?> box){
        if (this.avg() == box.avg()){
            return 0;
        }else if (this.avg() > box.avg()){
            return 1;
        } else{
            return -1;
        }
    }

   /* public static void method1(List<Number> numbers){

    }*/

    public static void method2(List<? extends Number> numbers){

    }


    public static <U> U getFirstElement(List<U> list){
        return list.get(0);
    }

    public static <U> void transfer(List<? extends U> src,List<? super U> dist){
        dist.addAll(src);
        src.clear();
    }

    public T[] getArray() {
        return array;
    }

    public void setArray(T[] array) {
        this.array = array;
    }
}
