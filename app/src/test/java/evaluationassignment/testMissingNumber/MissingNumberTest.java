package evaluationassignment.testMissingNumber;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;
import evaluationassignment.missingNumber.MissingNumber;

public class MissingNumberTest {

    @Test
    public void testSmallArray() {
        int n = 2;
        int[] input = { 1 };
        assertEquals(2, MissingNumber.findMissingNumber(input, n));
    }

    @Test
    public void testSortedArray() {
        int n = 5;
        int[] input = { 1, 2, 4, 5 };
        assertEquals(3, MissingNumber.findMissingNumber(input, n));
    }

    @Test
    public void testUnsortedArray() {
        int n = 6;
        int[] input = { 6, 1, 4, 2, 3 };
        assertEquals(5, MissingNumber.findMissingNumber(input, n));
    }

    @Test
    public void testMissingFirst() {
        int n = 5;
        int[] input = { 2, 3, 4, 5 };
        assertEquals(1, MissingNumber.findMissingNumber(input, n));
    }

    @Test
    public void testMissingLast() {
        int n = 6;
        int[] input = { 1, 2, 3, 4, 5 };
        assertEquals(6, MissingNumber.findMissingNumber(input, n));
    }

    @Test
    public void testNullArrayThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> MissingNumber.findMissingNumber(null, 5));
    }

    @Test
    public void testIncorrectArrayLengthThrowsException() {
        int[] input = { 1, 2 }; // length 2, but n = 5, expecting 4 elements
        assertThrows(IllegalArgumentException.class, () -> MissingNumber.findMissingNumber(input, 5));
    }
}
