package practice;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BasketTest {

    Basket<Fruit> fruitBasket;
    Basket<Orange> orangeBasket;
    Basket<Apple> appleBasket;

    @Before
    public void setUp() throws Exception {
        fruitBasket = new Basket<>();
        orangeBasket = new Basket<>();
        appleBasket = new Basket<>();

        for (int i = 0; i < 5; i++) {
            orangeBasket.add(new Orange());
            appleBasket.add(new Apple());
        }

    }

    @Test
    public void getWeight() {
        assertEquals(7.5,orangeBasket.getWeight(),00000.1);
    }

    @Test
    public void add() {
        orangeBasket.add(new Orange());
        assertEquals(9.0,orangeBasket.getWeight(),00000.1);
    }

    @Test
    public void compare() {
        assertEquals(1,orangeBasket.compare(appleBasket));
        assertEquals(0,orangeBasket.compare(orangeBasket));
        for (int i = 0; i < 5; i++) {
            fruitBasket.add(new Orange());
            fruitBasket.add(new Apple());
        }
        assertEquals(-1,orangeBasket.compare(fruitBasket));
    }

    @Test
    public void transfer() {
        Basket.transfer(orangeBasket,fruitBasket);
        Basket.transfer(appleBasket,fruitBasket);
        assertEquals(12.5,fruitBasket.getWeight(),00000.1);
        assertEquals(0.0,orangeBasket.getWeight(),00000.1);
        assertEquals(0.0,appleBasket.getWeight(),00000.1);
    }
}