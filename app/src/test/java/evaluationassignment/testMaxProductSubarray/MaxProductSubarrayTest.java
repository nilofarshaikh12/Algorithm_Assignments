package evaluationassignment.testMaxProductSubarray;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;
import evaluationassignment.maxProductSubarray.MaxProductSubarray;

public class MaxProductSubarrayTest {

    @Test
    public void testPositiveNumbersOnly() {
        int[] arr = { 1, 2, 3, 4 };
        assertEquals(24, MaxProductSubarray.maxProduct(arr, arr.length));
    }

    @Test
    public void testWithNegativeAndPositive() {
        int[] arr = { 2, 3, -2, 4 };
        assertEquals(6, MaxProductSubarray.maxProduct(arr, arr.length));
    }

    @Test
    public void testContainsZero() {
        int[] arr = { -2, 0, -1 };
        assertEquals(0, MaxProductSubarray.maxProduct(arr, arr.length));
    }

    @Test
    public void testAllNegativeEvenCount() {
        int[] arr = { -1, -2, -3, -4 };
        assertEquals(24, MaxProductSubarray.maxProduct(arr, arr.length));
    }

    @Test
    public void testAllNegativeOddCount() {
        int[] arr = { -1, -2, -3 };
        assertEquals(6, MaxProductSubarray.maxProduct(arr, arr.length));
    }

    @Test
    public void testAllZeroes() {
        int[] arr = { 0, 0, 0 };
        assertEquals(0, MaxProductSubarray.maxProduct(arr, arr.length));
    }

    @Test
    public void testSingleElementPositive() {
        int[] arr = { 9 };
        assertEquals(9, MaxProductSubarray.maxProduct(arr, arr.length));
    }

    @Test
    public void testEmptyArrayThrowsException() {
        int[] arr = {};
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            MaxProductSubarray.maxProduct(arr, arr.length);
        });
        assertEquals("Array must not be null or empty", exception.getMessage());
    }

}
