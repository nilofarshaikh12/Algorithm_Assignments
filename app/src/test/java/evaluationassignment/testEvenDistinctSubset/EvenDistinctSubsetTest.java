package evaluationassignment.testEvenDistinctSubset;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import evaluationassignment.evenDistinctSubset.EvenDistinctSubset;

public class EvenDistinctSubsetTest {

    @Test
    public void testAllEven() {
        int[] input = { 2, 4, 2, 6 };
        assertEquals(7, EvenDistinctSubset.getCountForEvenSubset(input, input.length));
    }

    @Test
    public void testMixedEvenOdd() {
        int[] input = { 1, 2, 3, 4, 5 };
        assertEquals(3, EvenDistinctSubset.getCountForEvenSubset(input, input.length));
    }

    @Test
    public void testNoEvenNumber() {
        int[] input = { 1, 3, 5, 7, 9 };
        assertEquals(0, EvenDistinctSubset.getCountForEvenSubset(input, input.length));
    }

    @Test
    public void testEmptyArray() {
        int[] input = {};
        assertEquals(0, EvenDistinctSubset.getCountForEvenSubset(input, input.length));
    }
}
