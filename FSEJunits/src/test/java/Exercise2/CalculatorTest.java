package Exercise2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    Caluculator c = new Caluculator();

    @Test
    void testAdd(){

        assertEquals(5 , c.add(2,3));
    }   
    @Test
    void testSub(){
        assertEquals(7 , c.subtract(8,1));
    }
    @Test
    void testMul(){
        assertEquals(4 , c.multiply(2,2));
    }
    @Test
    void testDiv(){
        assertEquals(10 , c.divide(100  , 10));
    }
}
