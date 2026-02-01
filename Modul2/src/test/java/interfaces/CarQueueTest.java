package interfaces;

import org.junit.Before;
import org.junit.Test;
import сollection.classes.Car;
import сollection.list.LinkedCarList;

import static org.junit.Assert.*;

public class CarQueueTest {

    CarQueue carQueue;

    @Before
    public void setUp() throws Exception {

        carQueue = new LinkedCarList();

        for (int i = 0; i < 10; i++) {
            Car car = new Car("Brand "+i,i);
            carQueue.add(car);
        }
    }

    @Test
    public void add() {
        assertEquals(10,carQueue.size());
    }

    @Test
    public void peek() {
        Car car = carQueue.peek();
        assertEquals("Brand 0",car.getBrand());
        assertEquals(10,carQueue.size());
    }

    @Test
    public void poll() {
        Car carPooled = carQueue.poll();
        assertEquals("Brand 0",carPooled.getBrand());
        assertEquals(9,carQueue.size());

    }
}