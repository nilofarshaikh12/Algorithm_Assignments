package evaluationassignment.testKthSmallestElement;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import evaluationassignment.kthSmallestElement.KthSmallestElement;

public class KthSmallestElementTest {

    @Test
    void whenGivenIndex_thenReturnsKthSmallest() {
        assertEquals("2th smallest element:2",
                KthSmallestElement.findKthSmallestElement(new int[] { 1, 2, 3, 4, 5 }, 5, 2));
    }

    @Test
    void whenIndexGreaterThanArraySize_thenReturnsNegativeOne() {
        assertEquals("Invalid value of k",
                KthSmallestElement.findKthSmallestElement(new int[] { 1, 2, 3, 4, 5 }, 5, 7));
    }

    @Test
    void whenIndexLessThanZero_thenReturnsNegativeOne() {
        assertEquals("Invalid value of k",
                KthSmallestElement.findKthSmallestElement(new int[] { 1, 2, 3, 4, 5 }, 5, -3));
    }

}
