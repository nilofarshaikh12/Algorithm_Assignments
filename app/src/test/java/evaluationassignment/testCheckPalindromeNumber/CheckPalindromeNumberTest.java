package evaluationassignment.testCheckPalindromeNumber;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import evaluationassignment.checkPalindromeNumber.CheckPalindromeNumber;

public class CheckPalindromeNumberTest {

    @Test
    public void testPalindromeNumber() {
        assertEquals("yes", CheckPalindromeNumber.isPalindrome(121));
        assertEquals("yes", CheckPalindromeNumber.isPalindrome(1234321));
        assertEquals("yes", CheckPalindromeNumber.isPalindrome(1));
        assertEquals("yes", CheckPalindromeNumber.isPalindrome(0));
    }

    @Test
    public void testNonPalindromeNumber() {
        assertEquals("no", CheckPalindromeNumber.isPalindrome(123));
        assertEquals("no", CheckPalindromeNumber.isPalindrome(10));
        assertEquals("no", CheckPalindromeNumber.isPalindrome(123456));
    }

    @Test
    public void testNegativeNumber() {
        assertEquals("no", CheckPalindromeNumber.isPalindrome(-121));
    }
}
