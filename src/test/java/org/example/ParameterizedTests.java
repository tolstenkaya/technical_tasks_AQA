package org.example;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class ParameterizedTests {

    @ParameterizedTest
    @ValueSource(ints={1,2,3,4})
    void testIsNumberEven(Integer arg){
        assertTrue(arg%2==0, arg+" is even");
//        assertFalse(arg%2==0, arg+" is odd");
    }
}
