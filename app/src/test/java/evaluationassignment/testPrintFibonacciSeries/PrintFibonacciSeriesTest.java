package evaluationassignment.testPrintFibonacciSeries;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.junit.jupiter.api.Test;
import evaluationassignment.fibonacciSeries.FibonacciSeries;

public class PrintFibonacciSeriesTest {

    @Test
    public void testZeroLimit() {
        List<Integer> expected = Collections.emptyList();
        assertEquals(expected, FibonacciSeries.series(0));
    }

    @Test
    public void testOneLimit() {
        List<Integer> expected = Arrays.asList(0);
        assertEquals(expected, FibonacciSeries.series(1));
    }

    @Test
    public void testFiveLimit() {
        List<Integer> expected = Arrays.asList(0, 1, 1, 2, 3);
        assertEquals(expected, FibonacciSeries.series(5));
    }

    @Test
    public void testNegativeLimit() {
        List<Integer> expected = Collections.emptyList();
        assertEquals(expected, FibonacciSeries.series(-6));
    }
}
