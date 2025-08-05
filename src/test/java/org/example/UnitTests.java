package org.example;

import org.junit.jupiter.api.Test;
import static org.example.Main.calculatePrice;
import static org.junit.jupiter.api.Assertions.*;

public class UnitTests {
    @Test
    void testCorrectPriceForVIP(){
        double res = calculatePrice(100, true);
        assertEquals(90,res);
    }

    @Test
    void testCorrectPriceForUsual(){
        double res = calculatePrice(100,false);

    }
}
