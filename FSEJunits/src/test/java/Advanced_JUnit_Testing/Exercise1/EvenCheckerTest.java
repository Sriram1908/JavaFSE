package Advanced_JUnit_Testing.Exercise1;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertTrue;


public class EvenCheckerTest {

    protected final EvenChecker e = new EvenChecker();

    @ParameterizedTest
    @ValueSource(ints = {2,4,6,22})
    void testisEven(int num)
    {
        boolean res = e.isEven(num);
        assertTrue(res);
    }
}
