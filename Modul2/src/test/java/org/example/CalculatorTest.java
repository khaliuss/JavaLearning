package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private Calculator calculator;


    @BeforeEach
    public void setUp(){
        calculator = new Calculator();
    }

    @Test
    void when10AddTo5ThenResult15() {
        int exp = 15;
        int result = calculator.add(10,5);
        assertEquals(exp,result);
    }

    @Test
    void when20AddTo5ThenResult25(){
        int exp2 = 25;
        int result2 = calculator.add(20,5);
        assertEquals(exp2,result2);
    }

    @Test
    void whenIncorrectStringAddThenTrowError(){
        boolean incorrect = false;
        try {
            calculator.add("asdaf","3");
        }catch (Exception e){
            incorrect = true;
        }
        assertTrue(incorrect);
    }


    @Test
    void when20MinusTo10ThenResult10() {
        double exp = 10;
        double res = calculator.min(20.0,10.0);
        assertEquals(exp,res);
    }

    @Test
    void whenIncorrectStringMinusThenTrowError(){
        assertThrows(Exception.class, () -> {
            calculator.min("as", "1.2");
        });
    }

    @Test
    void mul() {
        double exp = 10;
        double res = calculator.mul(5.0,2.0);
        assertEquals(exp,res);
    }

    @Test
    void div() {
        double exp = 2;
        double res = calculator.div(20.0,10.0);
        assertEquals(exp,res);
    }

    @AfterEach
    public void  clous(){
        calculator = null;
    }
}