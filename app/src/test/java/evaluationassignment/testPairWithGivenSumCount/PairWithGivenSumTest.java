package evaluationassignment.testPairWithGivenSumCount;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import evaluationassignment.pairsWithGivenSum.PairsWithGivenSum;

public class PairWithGivenSumTest {

    @Test
    void whenArrayAndTargetGiven_thenReturnsCount() {
        assertEquals(2, PairsWithGivenSum.getPairCount(new int[] { 1, 5, 7, 1 }, 4, 6));
    }

    @Test
    void whenArrayGivenTargetNotMatched_thenReturnsNegativeOne() {
        assertEquals(-1, PairsWithGivenSum.getPairCount(new int[] { 1, 5, 7, 1 }, 4, 10));
    }

    @Test
    void whenArrayElementSameAndTargetGiven_thenReturnsCOunt() {
        assertEquals(6, PairsWithGivenSum.getPairCount(new int[] { 1, 1, 1, 1 }, 4, 2));
    }
}
