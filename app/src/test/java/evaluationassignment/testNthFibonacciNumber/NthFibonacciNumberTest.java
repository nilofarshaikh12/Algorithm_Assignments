package evaluationassignment.testNthFibonacciNumber;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;
import evaluationassignment.nthFibonacciNumber.NthFibonacciNumber;

public class NthFibonacciNumberTest {

    @Test
    public void testFibonacci1st() {
        assertEquals(0, NthFibonacciNumber.nthFibonacci(1));
    }

    @Test
    public void testFibonacci2nd() {
        assertEquals(1, NthFibonacciNumber.nthFibonacci(2));
    }

    @Test
    public void testFibonacci10th() {
        assertEquals(34, NthFibonacciNumber.nthFibonacci(10));
    }

    @Test
    public void testZeroInputThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> NthFibonacciNumber.nthFibonacci(0));
    }

    @Test
    public void testNegativeInputThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> NthFibonacciNumber.nthFibonacci(-6));
    }
}
