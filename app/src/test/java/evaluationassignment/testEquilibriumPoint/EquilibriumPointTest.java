package evaluationassignment.testEquilibriumPoint;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import evaluationassignment.equilibriumPoint.EquilibriumPoint;

public class EquilibriumPointTest {

    @Test
    void whenArrayContainsEquiPoint_thenReturnsPosition() {
        assertEquals(3, EquilibriumPoint.equilibriumPoint(new Integer[] { 5, 2, 11, 4, 3 }, 5));
    }

    @Test
    void whenArrayNotContainsEquiPoint_thenReturnsNegativeOne() {
        assertEquals(-1, EquilibriumPoint.equilibriumPoint(new Integer[] { 5, 6, 11, 7, 3 }, 5));
    }

    @Test
    void whenArrayContainsOneElement_thenReturnsOne() {
        assertEquals(1, EquilibriumPoint.equilibriumPoint(new Integer[] { 5 }, 1));
    }

    @Test
    void whenArrayContainsTwoElements_thenReturnsNegativeOne() {
        assertEquals(-1, EquilibriumPoint.equilibriumPoint(new Integer[] { 5, 3 }, 2));
    }

    @Test
    void whenArrayContainsNegativeElements_thenReturnsNegativeOne() {
        assertEquals(3, EquilibriumPoint.equilibriumPoint(new Integer[] { -1, -2, -5, -2, -1 }, 5));
    }

    @Test
    void whenArrayAllZero_thenReturnsMiddlePosition() {
        assertEquals(2, EquilibriumPoint.equilibriumPoint(new Integer[] { 0, 0, 0, 0, 0 }, 5));
    }
}
