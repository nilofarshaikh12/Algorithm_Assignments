package evaluationassignment.testAlternateMerge;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
import evaluationassignment.alternateMerge.AlternateMergeString;

public class AlternateMergeStringTest {

    @Test
    public void testEqualLengthStrings() {
        assertEquals("axbycz", AlternateMergeString.getAlternativeMergedString("abc", "xyz"));
    }

    @Test
    public void testStr1Longer() {
        assertEquals("aabbccde", AlternateMergeString.getAlternativeMergedString("abcde", "abc"));
    }

    @Test
    public void testStr2Longer() {
        assertEquals("aubycthfys", AlternateMergeString.getAlternativeMergedString("abc", "uythfys"));
    }

    @Test
    public void testStr1Empty() {
        assertEquals("abc", AlternateMergeString.getAlternativeMergedString("", "abc"));
    }

    @Test
    public void testStr2Empty() {
        assertEquals("abcde", AlternateMergeString.getAlternativeMergedString("abcde", ""));
    }

    @Test
    public void testBothEmptyStrings() {
        assertEquals("", AlternateMergeString.getAlternativeMergedString("", ""));
    }

    @Test
    public void testWhenFirstStringNull() {
        assertThrows(NullPointerException.class, () -> AlternateMergeString.getAlternativeMergedString(null, "abc"));
    }

    @Test
    public void testWhenSecondStringNull() {
        assertThrows(NullPointerException.class, () -> AlternateMergeString.getAlternativeMergedString("abc", null));
    }
}
