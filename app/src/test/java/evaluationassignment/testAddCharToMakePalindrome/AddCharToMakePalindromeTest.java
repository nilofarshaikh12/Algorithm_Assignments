package evaluationassignment.testAddCharToMakePalindrome;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import evaluationassignment.addMinCharToMakePalindrome.AddMinCharToMakePalindrome;

public class AddCharToMakePalindromeTest {

    @Test
    void whenStringGiven_thenReturnsRequiredChar() {
        assertEquals(2, AddMinCharToMakePalindrome.addMinChar("abc"));
    }

    @Test
    void whenGivenStringIsPallindrome_thenReturnsZero() {
        assertEquals(0, AddMinCharToMakePalindrome.addMinChar("cbaabc"));
    }

    @Test
    void whenGivenStringWithMixedCase_thenReturnsRequiredChar() {
        assertEquals(0, AddMinCharToMakePalindrome.addMinChar("Aba"));
    }
}
