package evaluationassignment.testCheckPrime;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import evaluationassignment.checkPrime.CheckPrimeNum;

public class CheckPrimeNumTest {

    @Test
    public void testPrimeNumber() {
        assertEquals(1, CheckPrimeNum.isPrime(5));
    }

    @Test
    public void testNonPrimeNumber() {
        assertEquals(0, CheckPrimeNum.isPrime(8));
    }

    @Test
    public void testZero() {
        assertEquals(0, CheckPrimeNum.isPrime(0));
    }

    @Test
    public void testOne() {
        assertEquals(0, CheckPrimeNum.isPrime(1));
    }

    @Test
    public void testTwo() {
        assertEquals(1, CheckPrimeNum.isPrime(2));
    }

    @Test
    public void testNegative() {
        assertEquals(0, CheckPrimeNum.isPrime(-9));
    }

}
