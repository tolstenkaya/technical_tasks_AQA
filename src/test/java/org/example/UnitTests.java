package org.example;

import org.junit.jupiter.api.Test;
import static org.example.Main.calculatePrice;
import static org.junit.jupiter.api.Assertions.*;

public class UnitTests {
    @Test
    void testCorrectPriceForVIP(){
        double res = calculatePrice(100, true);
        assertEquals(90.0,res,0.0001,"VIP price should be 10% off");
    }

    @Test
    void testCorrectPriceForNonVIP(){
        double res = calculatePrice(100,false);
        assertEquals(100.0,res,0.0001,"Non-VIP price should stay the same");
    }

    @Test
    void testZeroPrice(){
        double res = calculatePrice(0,true);
        assertTrue(res==0);
    }

    @Test
    void testNegativePrice(){
        double res = calculatePrice(-100,false);
        assertFalse(res>0,"The price should be positive");
    }

    @Test
    void testLargePriceForVIP(){
        double res = calculatePrice(Long.MAX_VALUE,true);
        double expected = Long.MAX_VALUE*0.9;
        assertEquals(expected,res,1e10);
    }

    @Test
    void testLargePriceForNonVIP(){
        double res = calculatePrice(Long.MAX_VALUE,false);
        assertEquals((double)Long.MAX_VALUE,res,1e10);
    }
}
