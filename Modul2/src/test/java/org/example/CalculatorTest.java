package org.example;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    private Calculator calculator;


    @Before
    public void setUp(){
        calculator = new Calculator();
    }

    @Test
    public  void when10AddTo5ThenResult15() {
        int exp = 15;
        int result = calculator.add(10,5);
        assertEquals(exp,result);
    }

    @Test
    public void when20AddTo5ThenResult25(){
        int exp2 = 25;
        int result2 = calculator.add(20,5);
        assertEquals(exp2,result2);
    }

    @Test
    public void whenIncorrectStringAddThenTrowError(){
        boolean incorrect = false;
        try {
            calculator.add("asdaf","3");
        }catch (Exception e){
            incorrect = true;
        }
        assertTrue(incorrect);
    }


    @Test
    public void when20MinusTo10ThenResult10() {
        double exp = 10;
        double res = calculator.min(20.0,10.0);
        assertEquals(exp,res,000.7);
    }

    @Test
    public void whenIncorrectStringMinusThenTrowError(){
        assertThrows(Exception.class, () -> {
            calculator.min("as", "1.2");
        });
    }

    @Test
    public void mul() {
        double exp = 10;
        double res = calculator.mul(5.0,2.0);
        assertEquals(exp,res,000.7);
    }

    @Test
    public void div() {
        double exp = 2;
        double res = calculator.div(20.0,10.0);
        assertEquals(exp,res,000.7);
    }

    @After
    public  void  clous(){
        calculator = null;
    }
}