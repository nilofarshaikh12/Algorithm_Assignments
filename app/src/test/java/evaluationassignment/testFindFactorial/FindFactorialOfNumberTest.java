package evaluationassignment.testFindFactorial;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;
import evaluationassignment.findFactorial.FindFactorialOfNumber;

public class FindFactorialOfNumberTest {

    @Test
    public void testFactorialOfZero() {
        assertEquals(1, FindFactorialOfNumber.factorial(0));
    }

    @Test
    public void testFactorialOfOne() {
        assertEquals(1, FindFactorialOfNumber.factorial(1));
    }

    @Test
    public void testFactorialForNumber() {
        assertEquals(120, FindFactorialOfNumber.factorial(5));
    }

    @Test
    public void testFactorialForNegative() {
        IllegalArgumentException ex = assertThrows(IllegalArgumentException.class, () -> {
            FindFactorialOfNumber.factorial(-4);
        });
        assertEquals("Factorial is not defined for negative numbers", ex.getMessage());
    }

}
