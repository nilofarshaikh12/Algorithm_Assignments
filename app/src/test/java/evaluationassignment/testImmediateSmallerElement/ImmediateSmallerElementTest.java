package evaluationassignment.testImmediateSmallerElement;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;
import evaluationassignment.immediateSmallerElement.ImmediateSmallerElement;

public class ImmediateSmallerElementTest {

    @Test
    public void testAllDescending() {
        int[] input = { 5, 4, 3, 2, 1 };
        int[] expected = { 4, 3, 2, 1, -1 };
        assertArrayEquals(expected, ImmediateSmallerElement.immediateSmaller(input, input.length));
    }

    @Test
    public void testAllAscending() {
        int[] input = { 1, 2, 3, 4, 5 };
        int[] expected = { -1, -1, -1, -1, -1 };
        assertArrayEquals(expected, ImmediateSmallerElement.immediateSmaller(input, input.length));
    }

    @Test
    public void testMixedElements() {
        int[] input = { 5, 2, 8, 9, 4 };
        int[] expected = { 2, -1, -1, 4, -1 };
        assertArrayEquals(expected, ImmediateSmallerElement.immediateSmaller(input, input.length));
    }

    @Test
    public void testSingleElement() {
        int[] input = { 4 };
        int[] expected = { -1 };
        assertArrayEquals(expected, ImmediateSmallerElement.immediateSmaller(input, input.length));
    }

    @Test
    public void testArrayWithDuplicateElement() {
        int[] input = { 8, 8, 2, 2 };
        int[] expected = { -1, 2, -1, -1 };
        assertArrayEquals(expected, ImmediateSmallerElement.immediateSmaller(input, input.length));
    }

    @Test
    public void testArrayWithNegativeElement() {
        int[] input = { -1, -3, 0, -2 };
        int[] expected = { -3, -1, -2, -1 };
        assertArrayEquals(expected, ImmediateSmallerElement.immediateSmaller(input, input.length));
    }

}
