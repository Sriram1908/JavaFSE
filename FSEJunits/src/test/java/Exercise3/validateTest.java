package Exercise3;

import Exercise2.Caluculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class validateTest {

    Caluculator c = new Caluculator();

    @Test
    void testAdd() {
        assertEquals(3, c.add(1, 2));

        assertNotEquals(6, c.multiply(3, 4));

        assertTrue(c.add(4, 4) == 8);

        assertFalse(c.multiply(3, 3) == 10);
    }
}

