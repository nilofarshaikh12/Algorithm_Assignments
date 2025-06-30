package evaluationassignment.testEquilibriumPoint;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import evaluationassignment.equilibriumPoint.EquilibriumPoint;

public class EquilibriumPointTest {

    @Test
    void whenArrayContainsEquiPoint_thenReturnsPosition() {
        assertEquals(3, EquilibriumPoint.equilibriumPoint(new Integer[] { 5, -2, 11, 0, 3 }, 5));
    }

    @Test
    void whenArrayNotContainsEquiPoint_thenReturnsNegativeOne() {
        assertEquals(-1, EquilibriumPoint.equilibriumPoint(new Integer[] { 5, -2, 11, 7, 3 }, 5));
    }

    @Test
    void whenArrayContainsOneElement_thenReturnsOne() {
        assertEquals(1, EquilibriumPoint.equilibriumPoint(new Integer[] { 5 }, 1));
    }

    @Test
    void whenArrayContainsTwoElements_thenReturnsNegativeOne() {
        assertEquals(-1, EquilibriumPoint.equilibriumPoint(new Integer[] { 5, -2 }, 2));
    }
}
