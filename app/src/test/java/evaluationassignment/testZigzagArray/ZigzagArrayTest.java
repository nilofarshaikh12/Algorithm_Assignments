package evaluationassignment.testZigzagArray;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;
import evaluationassignment.zigzagArray.ZigzagArray;

public class ZigzagArrayTest {

    @Test
    public void testZigZag() {
        int[] input = { 4, 3, 7, 8, 6, 2, 1 };
        int[] expected = { 3, 7, 4, 8, 2, 6, 1 };
        assertArrayEquals(expected, ZigzagArray.zigZagArr(input, input.length));
    }

    @Test
    public void testAlreadyZigzag() {
        int[] input = { 1, 3, 2, 5, 4 };
        int[] expected = { 1, 3, 2, 5, 4 };
        assertArrayEquals(expected, ZigzagArray.zigZagArr(input, input.length));
    }

    @Test
    public void testAscendingOrder() {
        int[] input = { 1, 2, 3, 4, 5 };
        int[] expected = { 1, 3, 2, 5, 4 };
        assertArrayEquals(expected, ZigzagArray.zigZagArr(input, input.length));
    }

    @Test
    public void testDescendingOrder() {
        int[] input = { 5, 4, 3, 2, 1 };
        int[] expected = { 4, 5, 2, 3, 1 };
        assertArrayEquals(expected, ZigzagArray.zigZagArr(input, input.length));
    }

    @Test
    public void testWithDuplicate() {
        int[] input = { 6, 6, 6, 6 };
        int[] expected = { 6, 6, 6, 6 };
        assertArrayEquals(expected, ZigzagArray.zigZagArr(input, input.length));
    }
}
