package evaluationassignment.testSievePrintPrime;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;
import org.junit.jupiter.api.Test;
import evaluationassignment.sievePrintPrime.SievePrintPrime;

public class SievePrintPrimeTest {

    @Test
    public void testLimitEquals0() {
        List<Integer> result = SievePrintPrime.sieveOfEratosthenes(0);
        assertTrue(result.isEmpty(), "There is no prime number for given limit");
    }

    @Test
    public void testLimitEquals10() {
        List<Integer> expected = List.of(2, 3, 5, 7);
        List<Integer> result = SievePrintPrime.sieveOfEratosthenes(10);
        assertEquals(expected, result);
    }

    @Test
    public void testLimitEquals1() {
        List<Integer> result = SievePrintPrime.sieveOfEratosthenes(1);
        assertTrue(result.isEmpty(), "There is no prime number for given limit");
    }

    @Test
    public void testNegativeLimit() {
        List<Integer> result = SievePrintPrime.sieveOfEratosthenes(-4);
        assertTrue(result.isEmpty(), "There is no prime number for given limit");
    }
}
