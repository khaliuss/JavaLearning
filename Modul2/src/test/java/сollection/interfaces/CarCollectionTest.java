package сollection.interfaces;

import lesson.interfaces.CarCollection;
import org.junit.Before;
import org.junit.Test;
import lesson.сollection.classes.Car;
import lesson.сollection.list.LinkedCarList;

import static org.junit.Assert.*;

public class CarCollectionTest {

    CarCollection carCollection;

    @Before
    public void setUp() throws Exception {
        carCollection = new LinkedCarList();
        for (int i = 0; i <100; i++) {
            carCollection.add(new Car("Brand "+i,i));
        }
    }

    @Test
    public void whenCollectionContainsElementThenReturnTrue() {
        assertTrue(carCollection.contains(new Car("Brand 1",1)));
        assertFalse(carCollection.contains(new Car("Brand 1001",1123)));

    }

    @Test
    public void testForEach(){
        int index = 0;
        for (Car car : carCollection){
            index++;
        }

        assertEquals(100,index);
    }
}