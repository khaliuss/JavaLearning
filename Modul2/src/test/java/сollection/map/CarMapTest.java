package сollection.map;

import lesson.map.CarHashMap;
import org.junit.Before;
import org.junit.Test;
import lesson.сollection.classes.Car;
import lesson.сollection.classes.CarOwner;
import lesson.interfaces.CarMap;

import static org.junit.Assert.*;

public class CarMapTest {

    CarMap carMap;


    @Before
    public void setUp() throws Exception {
        carMap = new CarHashMap();
    }

    @Test
    public void whenPut100ElementsThenSizeIncrease100() {
        for (int i = 0; i < 100; i++) {
            CarOwner carOwner = new CarOwner(i,"Name "+i,"Last Name "+i);
            Car car = new Car("Brand "+i,i);
            carMap.put(carOwner,car);
        }
        assertEquals(100,carMap.size());
    }

    @Test
    public void whenPut100ElementWith10DifferentKeysThenSize10() {
        for (int i = 0; i < 100; i++) {
            int index = i % 10;
            CarOwner carOwner = new CarOwner(index,"Name "+index,"Last Name "+index);
            Car car = new Car("Brand "+index,index);
            carMap.put(carOwner,car);
        }
        assertEquals(10,carMap.size());
    }

    @Test
    public void whenRemove1CarThenSizeDecrease1() {
        for (int i = 0; i < 100; i++) {
            CarOwner carOwner = new CarOwner(i,"Name "+i,"Last Name "+i);
            Car car = new Car("Brand "+i,i);
            carMap.put(carOwner,car);
        }
        assertEquals(100,carMap.size());

        CarOwner elementForDeleting = new CarOwner(5,"Name 5","Last Name 5");
        assertTrue(carMap.remove(elementForDeleting));
        assertEquals(99,carMap.size());
        assertFalse(carMap.remove(elementForDeleting));
    }

    @Test
    public void countOfKeysMustBeEqualsToCountOfValues() {
        for (int i = 0; i < 100; i++) {
            CarOwner carOwner = new CarOwner(i,"Name "+i,"Last Name "+i);
            Car car = new Car("Brand "+i,i);
            carMap.put(carOwner,car);
        }
        assertEquals(100,carMap.size());
        assertEquals(100,carMap.keySet().size());
        assertEquals(100,carMap.values().size());
    }


    @Test
    public void methodGetMustReturnRightValue() {
        for (int i = 0; i < 100; i++) {
            CarOwner carOwner = new CarOwner(i,"Name "+i,"Last Name "+i);
            Car car = new Car("Brand "+i,i);
            carMap.put(carOwner,car);
        }
        CarOwner key = new CarOwner(0,"Name 0","Last Name 0");
        Car value = carMap.get(key);

        assertEquals("Brand 0",value.getBrand());
    }





    @Test
    public void whenClearCalledThenSize0() {
        carMap.clear();
        assertEquals(0,carMap.size());
    }
}