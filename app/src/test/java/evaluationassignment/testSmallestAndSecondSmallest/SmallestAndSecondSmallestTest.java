package evaluationassignment.testSmallestAndSecondSmallest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import evaluationassignment.smallestAndSecondSmallest.SmallestAndSecondSmallest;

public class SmallestAndSecondSmallestTest {

    @Test
    public void testNormalCase() {
        int[] input = { 4, 2, 6, 3, 8 };
        String expected = "Smallest element:2\nSecond smallest element:3";
        assertEquals(expected, SmallestAndSecondSmallest.getSmallestAndSecondSmallest(input, input.length));
    }

    @Test
    public void testAllSameElements() {
        int[] input = { 6, 6, 6, 6 };
        String expected = "No second smallest element found all elements might be equal";
        assertEquals(expected, SmallestAndSecondSmallest.getSmallestAndSecondSmallest(input, input.length));
    }

    @Test
    public void testWithDuplicates() {
        int[] input = { 7, 3, 2, 3, 9, 5 };
        String expected = "Smallest element:2\nSecond smallest element:3";
        assertEquals(expected, SmallestAndSecondSmallest.getSmallestAndSecondSmallest(input, input.length));
    }

    @Test
    public void testNegativeNumbers() {
        int[] input = { -3, -6, -1, -8, -3 };
        String expected = "Smallest element:-8\nSecond smallest element:-6";
        assertEquals(expected, SmallestAndSecondSmallest.getSmallestAndSecondSmallest(input, input.length));
    }

    @Test
    public void testSingleElement() {
        int[] input = { 7 };
        String expected = "Array must have at least two elements...";
        assertEquals(expected, SmallestAndSecondSmallest.getSmallestAndSecondSmallest(input, input.length));
    }

}
