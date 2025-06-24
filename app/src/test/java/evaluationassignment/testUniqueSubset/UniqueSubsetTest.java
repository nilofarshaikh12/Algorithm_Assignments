package evaluationassignment.testUniqueSubset;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.List;
import org.junit.jupiter.api.Test;
import evaluationassignment.uniqueSubset.UniqueSubset;

public class UniqueSubsetTest {

    @Test
    public void testEmptyArray() {
        int[] input = {};
        List<List<Integer>> result = UniqueSubset.getAllSubsets(input, input.length);
        List<List<Integer>> expected = List.of(List.of());
        assertEquals(expected, result);
    }

    @Test
    public void testSingleElementArray() {
        int[] input = { 1 };
        List<List<Integer>> result = UniqueSubset.getAllSubsets(input, input.length);
        List<List<Integer>> expected = List.of(
                List.of(), List.of(1));
        assertTrue(result.containsAll(expected));
        assertEquals(2, result.size());
    }

    @Test
    public void testMultipleElementsArray() {
        int[] input = { 1, 2, 2 };
        List<List<Integer>> result = UniqueSubset.getAllSubsets(input, input.length);
        List<List<Integer>> expected = List.of(
                List.of(), List.of(1), List.of(2), List.of(1, 2), List.of(2, 2), List.of(1, 2, 2));
        assertTrue(result.containsAll(expected));
        assertEquals(6, result.size());
    }

    @Test
    public void testWithDuplicateElement() {
        int[] input = { 1, 1 };
        List<List<Integer>> result = UniqueSubset.getAllSubsets(input, input.length);
        List<List<Integer>> expected = List.of(
                List.of(), List.of(1), List.of(1, 1));
        assertTrue(result.containsAll(expected));
        assertEquals(3, result.size());
    }
}
