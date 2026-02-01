import org.junit.Test;

import static org.junit.Assert.*;

public class PracticeTest {

    @Test
    public void checkTestWork(){
        Practice<String,Integer> prc1 = new Practice<>("ABC",1);
        Practice<String,Integer> prc2 = new Practice<>("DFG",2);
        int res = prc1.getValue() + prc2.getValue();
        assertEquals (3,res);


    }

}