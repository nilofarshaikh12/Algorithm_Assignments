package evaluationassignment.testPalindromeString;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;
import evaluationassignment.checkPalindromeString.CheckPalindromeString;

public class checkPalindromeStringTest {

    @Test
    public void testPalindromeLowerCase() {
        assertEquals(1, CheckPalindromeString.isPalindrome("ababa"));
    }

    @Test
    public void testPalindromeMixedCase() {
        assertEquals(1, CheckPalindromeString.isPalindrome("RaceCar"));
    }

    @Test
    public void testNotPalindrome() {
        assertEquals(0, CheckPalindromeString.isPalindrome("abc"));
    }

    @Test
    public void testSingleCharacter() {
        assertEquals(1, CheckPalindromeString.isPalindrome("a"));
    }

    @Test
    public void testEmptyString() {
        assertEquals(1, CheckPalindromeString.isPalindrome(""));
    }

    @Test
    public void testPalindromeWithSpaces() {
        assertEquals(0, CheckPalindromeString.isPalindrome("car start"));
    }

    @Test
    public void testPalindromeWithSpecialCharacter() {
        assertEquals(0, CheckPalindromeString.isPalindrome("madam!"));
    }

    @Test
    public void testNullInput() {
        assertThrows(IllegalArgumentException.class, () -> CheckPalindromeString.isPalindrome(null));
    }
}
