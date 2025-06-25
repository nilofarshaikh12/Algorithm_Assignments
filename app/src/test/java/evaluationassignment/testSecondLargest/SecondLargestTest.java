package evaluationassignment.testSecondLargest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import evaluationassignment.secondLargestElement.SecondLargestElement;

public class SecondLargestTest {

    @Test
    public void testSingleElement() {
        int[] input = { 30 };
        assertEquals(-1, SecondLargestElement.findSecondLargest(input, input.length));
    }

    @Test
    public void testTwoElement() {
        int[] input = { 20, 50 };
        assertEquals(20, SecondLargestElement.findSecondLargest(input, input.length));
    }

    @Test
    public void testAllSameElements() {
        int[] input = { 5, 5, 5, 5 };
        assertEquals(-1, SecondLargestElement.findSecondLargest(input, input.length));
    }

    @Test
    public void testNormalCase() {
        int[] input = { 30, 50, 20, 70, 60 };
        assertEquals(60, SecondLargestElement.findSecondLargest(input, input.length));
    }

    @Test
    public void testWithNegativeNumbers() {
        int[] input = { -8, -4, -3, -2, -9 };
        assertEquals(-3, SecondLargestElement.findSecondLargest(input, input.length));
    }
}
