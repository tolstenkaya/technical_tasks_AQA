package org.example;

import org.junit.jupiter.api.Test;

import static org.example.Main.greet;
import static org.junit.jupiter.api.Assertions.*;

public class PositiveAndNegativeTests {
    @Test
    void testValidName(){
        String res = greet("Olena");
        assertDoesNotThrow(()->res);
    }

    @Test
    void testInvalidName(){
        assertThrows(IllegalArgumentException.class,()->greet(""));
        assertThrows(IllegalArgumentException.class, ()->greet(null));
    }
}
