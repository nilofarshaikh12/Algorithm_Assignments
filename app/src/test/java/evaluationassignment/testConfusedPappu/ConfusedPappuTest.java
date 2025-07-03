package evaluationassignment.testConfusedPappu;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;
import evaluationassignment.confusedPappu.ConfusedPappu;

public class ConfusedPappuTest {

    @Test
    public void testWithSingle6() {
        assertEquals(3, ConfusedPappu.findDiff(6));
    }

    @Test
    public void testWithMuliple6s() {
        assertEquals(333, ConfusedPappu.findDiff(666));
    }

    @Test
    public void testWithNo6() {
        assertEquals(0, ConfusedPappu.findDiff(45));
    }

    @Test
    public void testWithZero() {
        assertEquals(0, ConfusedPappu.findDiff(0));
    }

    @Test
    public void testNegativeAmount() {
        assertThrows(IllegalArgumentException.class, () -> ConfusedPappu.findDiff(-66));
    }

}
