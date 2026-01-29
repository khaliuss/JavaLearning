package сollection;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CarSetTest {

    private CarSet carSet;
    private Car car;


    @Before
    public void setUp() {
        carSet = new CarHashSet();
        for (int i = 0; i < 100; i++) {
            carSet.add(new Car("Brand " + i, i));
        }
    }

    /*@Test
    public void whenAdd3SimilarObjectsThenSizeIncreaseBy1() {
        assertEquals(100, carSet.size());
        assertTrue(carSet.add(new Car("Toyota", 123)));
        assertFalse(carSet.add(new Car("Toyota", 123)));
        assertFalse(carSet.add(new Car("Toyota", 123)));
        assertEquals(101, carSet.size());
    }*/

    @Test
    public void whenAdd3SimilarObjectsThenSizeIncreaseBy1() {
        assertEquals(100, carSet.size());
        assertTrue(carSet.add(new Car("BMW", 10)));
        assertFalse(carSet.add(new Car("BMW", 10)));
        assertFalse(carSet.add(new Car("BMW", 10)));
        assertEquals(101, carSet.size());
    }



    @Test
    public void whenObjectRemoveThenSizeDecreased() {
        assertTrue(carSet.remove(new Car("Brand 33",33)));
        assertEquals(99,carSet.size());
        assertFalse(carSet.remove(new Car("Brand 33",33)));
        assertEquals(99,carSet.size());
    }


    @Test
    public void whenSetClearThenSize0() {
        carSet.clear();
        assertEquals(0, carSet.size());
    }
}