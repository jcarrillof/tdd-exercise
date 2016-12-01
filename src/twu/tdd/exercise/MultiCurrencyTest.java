package twu.tdd.exercise;

import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class MultiCurrencyTest {

    @Test
    public void testMultiplication(){
        Dollar five = new Dollar(5);
        Dollar product = five.times(2);
//        five.times(2);
        assertEquals(10, product.amount);
        product = five.times(3);
//        five.times(3);
        assertEquals(15, product.amount);
    }

    @Test
    public void testEquality(){
        assertTrue(new Dollar(5).equals(new Dollar(5)));
        assertFalse(new Dollar(5).equals(new Dollar(6)));
    }

}