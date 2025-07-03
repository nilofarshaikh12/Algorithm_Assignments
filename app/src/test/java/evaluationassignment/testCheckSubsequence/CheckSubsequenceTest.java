package evaluationassignment.testCheckSubsequence;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;
import evaluationassignment.checkSubsequence.CheckSubsequence;

public class CheckSubsequenceTest {

    @Test
    public void testIsSubsequence() {
        String str1 = "abc";
        String str2 = "atbdcr";
        assertEquals("yes", CheckSubsequence.checkForSubsequence(str1, str2));
    }

    @Test
    public void testNotSubsequence() {
        String str1 = "pqr";
        String str2 = "abp";
        assertEquals("no", CheckSubsequence.checkForSubsequence(str1, str2));
    }

    @Test
    public void testEqualStrings() {
        String str1 = "hello";
        String str2 = "hello";
        assertEquals("yes", CheckSubsequence.checkForSubsequence(str1, str2));
    }

    @Test
    public void testEmptyStringFirst() {
        String str1 = "";
        String str2 = "abc";
        assertEquals("yes", CheckSubsequence.checkForSubsequence(str1, str2));
    }

    @Test
    public void testEmptyStringSecond() {
        String str1 = "abc";
        String str2 = "";
        assertEquals("no", CheckSubsequence.checkForSubsequence(str1, str2));
    }

    @Test
    public void testWithNullString() {
        assertThrows(NullPointerException.class, () -> CheckSubsequence.checkForSubsequence(null, "abc"));
        assertThrows(NullPointerException.class, () -> CheckSubsequence.checkForSubsequence("abc", null));
    }
}
