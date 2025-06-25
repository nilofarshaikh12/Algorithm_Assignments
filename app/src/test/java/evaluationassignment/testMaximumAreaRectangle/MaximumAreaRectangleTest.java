package evaluationassignment.testMaximumAreaRectangle;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import evaluationassignment.maximumAreaRectangle.MaximumAreaRectangle;
import evaluationassignment.maximumAreaRectangle.Rectangle;

public class MaximumAreaRectangleTest {

    @Test
    public void testSingleReactangle() {
        Rectangle[] rect = { new Rectangle(4, 5) };
        assertEquals(20, MaximumAreaRectangle.calculateArea(rect, 1));
    }

    @Test
    public void testMultipleRectangle() {
        Rectangle[] rect = {
                new Rectangle(3, 4),
                new Rectangle(5, 10),
                new Rectangle(10, 10)
        };
        assertEquals(100, MaximumAreaRectangle.calculateArea(rect, 3));
    }

    @Test
    public void testAllSameArea() {
        Rectangle[] rect = {
                new Rectangle(3, 4),
                new Rectangle(2, 6),
                new Rectangle(12, 1)
        };
        assertEquals(12, MaximumAreaRectangle.calculateArea(rect, 3));
    }

    @Test
    public void testEmptyArray() {
        Rectangle[] rect = new Rectangle[0];
        assertEquals(0, MaximumAreaRectangle.calculateArea(rect, 0));
    }

    @Test
    public void testForNegative() {
        Rectangle[] rect = {
                new Rectangle(-2, -9),
                new Rectangle(4, 5)
        };
        assertEquals(20, MaximumAreaRectangle.calculateArea(rect, 2));
    }

    @Test
    public void testForAllNegative() {
        Rectangle[] rect = {
                new Rectangle(-8, 3),
                new Rectangle(-3, 2)
        };
        assertEquals(0, MaximumAreaRectangle.calculateArea(rect, 2));

    }
}
