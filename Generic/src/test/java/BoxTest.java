import org.junit.Test;

import static org.junit.Assert.*;

public class BoxTest {

    @Test
    public void testBox() {
        Box<String,Integer,Float> box1 = new Box("String1",20,1.2f);
        Box<String,Integer,Float> box2 = new Box("String1",10,5.5f);

        float expected = 36.7f;
        float res = (box1.getValue2()+box2.getValue2())+(box1.getValue3()+box2.getValue3());
        assertEquals(expected,res,000.1);

    }
}