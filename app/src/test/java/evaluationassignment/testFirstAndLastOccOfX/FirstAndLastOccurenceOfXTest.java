package evaluationassignment.testFirstAndLastOccOfX;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.List;
import org.junit.jupiter.api.Test;
import evaluationassignment.firstAndLastOccurenceOfX.FirstAndLastOccurenceOfX;

public class FirstAndLastOccurenceOfXTest {

    @Test
    public void testValueOccursOnce() {
        int[] input = { 1, 2, 3, 4, 5 };
        List<Integer> result = FirstAndLastOccurenceOfX.firstAndLastOccIndex(input, input.length, 3);
        assertEquals(List.of(2, 2), result);
    }

    @Test
    public void testValueOccursMultipleTimes() {
        int[] input = { 1, 2, 2, 3, 4 };
        List<Integer> result = FirstAndLastOccurenceOfX.firstAndLastOccIndex(input, input.length, 2);
        assertEquals(List.of(1, 2), result);
    }

    @Test
    public void testValueNotFound() {
        int[] input = { 1, 2, 3, 4, 5 };
        List<Integer> result = FirstAndLastOccurenceOfX.firstAndLastOccIndex(input, input.length, 8);
        assertEquals(List.of(-1), result);
    }

    @Test
    public void testAllElementsSameAsValue() {
        int[] input = { 5, 5, 5, 5 };
        List<Integer> result = FirstAndLastOccurenceOfX.firstAndLastOccIndex(input, input.length, 5);
        assertEquals(List.of(0, 3), result);
    }

    @Test
    public void testEmptyArray() {
        int[] input = {};
        List<Integer> result = FirstAndLastOccurenceOfX.firstAndLastOccIndex(input, 0, 5);
        assertEquals(List.of(-1), result);
    }

}
