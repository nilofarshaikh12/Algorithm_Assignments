package evaluationassignment.testUniqueNoOfOccurences;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import evaluationassignment.uniqueNoOfOccurences.UniqueNoOfOccurences;

public class UniqueNoOfOccurencesTest {

    @Test
    void testUniqueFreqency_thenRetuensTrue() {
        assertEquals(true, UniqueNoOfOccurences.isFrequencyUnique(new int[] { 5, 1, 2, 1, 2, 8, 2, 8, 8, 8 }, 10));
    }

    @Test
    void testNotUniqueFreqency_thenRetuensFalse() {
        assertEquals(false, UniqueNoOfOccurences.isFrequencyUnique(new int[] { 5, 5, 1, 2, 1, 2, 8, 2, 8, 8, 8 }, 11));
    }

    @Test
    void testOneFreqency_thenRetuensTrue() {
        assertEquals(true, UniqueNoOfOccurences.isFrequencyUnique(new int[] { 5 }, 1));
    }
}
