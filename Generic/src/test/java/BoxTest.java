import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class BoxTest {

    @Test
    public void testBox() {
        Box<Integer> box = new Box<>(5,10,15);
        assertEquals(10,box.avg(),000001);
    }

    @Test
    public void comparing2SameBoxesThenReturn0() {
        Box<Integer> box = new Box<>(5,10,15);
        Box<Float> box2 = new Box<>(5f,10f,15f);
        assertEquals(0,box.compare(box2));
    }

    @Test
    public void comparingWhenFirstBoxBiggerThenSecondBoxReturn1() {
        Box<Integer> box = new Box<>(52,110,15);
        Box<Integer> box2 = new Box<>(5,10,15);
        assertEquals(1,box.compare(box2));
    }

    @Test
    public void comparingWhenFirstBoxSmallerThenSecondBoxReturnMinus1() {
        Box<Integer> box = new Box<>(5,5,10);
        Box<Integer> box2 = new Box<>(5,15,15);
        assertEquals(-1,box.compare(box2));
    }

    /*@Test
    public void method1Called(){
        List<Integer> numbers = new ArrayList<>();
        Box.method1(numbers);
    }*/

    @Test
    public void method2Called(){
        List<Integer> numbers = new ArrayList<>();
        Box.method2(numbers);
    }

    @Test
    public void methodTransferCalled(){
        List<Integer> integers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            integers.add(i);
        }

        List<Number> numbers = new ArrayList<>();
        for (int i = 50; i < 60; i++) {
            numbers.add(i);
        }
        assertEquals(10,integers.size());
        Box.transfer(integers,numbers);
        assertEquals(0,integers.size());
        assertEquals(20,numbers.size());

    }

}