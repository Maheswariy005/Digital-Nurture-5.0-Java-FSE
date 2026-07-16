
import com.cognizant.MathOperations;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MathOperationsTest {

    MathOperations math = new MathOperations();

    @Test
    public void testAdd() {
        assertEquals(10, math.add(7, 3));
    }

    @Test
    public void testSubtract() {
        assertEquals(4, math.subtract(7, 3));
    }

    @Test
    public void testMultiply() {
        assertEquals(21, math.multiply(7, 3));
    }

    @Test
    public void testDivide() {
        assertEquals(2, math.divide(6, 3));
    }
}