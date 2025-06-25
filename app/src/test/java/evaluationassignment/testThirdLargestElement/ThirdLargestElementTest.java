package evaluationassignment.testThirdLargestElement;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import evaluationassignment.thirdLargestElement.ThirdLargestElement;

public class ThirdLargestElementTest {

    @Test
    public void testThreeDistinct() {
        int[] input = { 10, 20, 30 };
        assertEquals(10, ThirdLargestElement.getThirdLargestElement(input, input.length));
    }

    @Test
    public void testDuplicates() {
        int[] input = { 10, 20, 40, 30, 20, 10 };
        assertEquals(20, ThirdLargestElement.getThirdLargestElement(input, input.length));
    }

    @Test
    public void testLessThanThreeDistinct() {
        int[] input = { 1, 1, 2 };
        assertEquals(-1, ThirdLargestElement.getThirdLargestElement(input, input.length));
    }

    @Test
    public void testEmptyArray() {
        int[] input = {};
        assertEquals(-1, ThirdLargestElement.getThirdLargestElement(input, input.length));
    }

    @Test
    public void testNegativeNumbers() {
        int[] input = { -2, -1, -5, -7, -2, -1 };
        assertEquals(-5, ThirdLargestElement.getThirdLargestElement(input, input.length));
    }
}
