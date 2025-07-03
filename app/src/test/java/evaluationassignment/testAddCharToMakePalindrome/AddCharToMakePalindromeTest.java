package evaluationassignment.testAddCharToMakePalindrome;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;
import evaluationassignment.addMinCharToMakePalindrome.AddMinCharToMakePalindrome;

public class AddCharToMakePalindromeTest {

    @Test
    void whenGivenEmptyString_thenReturnsZero() {
        assertEquals(0, AddMinCharToMakePalindrome.addMinChar(""));
    }

    @Test
    void whenGivenSingleCharacter_thenReturnsZero() {
        assertEquals(0, AddMinCharToMakePalindrome.addMinChar("x"));
    }

    @Test
    void whenGivenWhitespaceOnly_thenReturnsZero() {
        assertEquals(0, AddMinCharToMakePalindrome.addMinChar("   "));
    }

    @Test
    void whenGivenNonPalindromeWithSpaces_thenReturnsCorrectValue() {
        assertEquals(4, AddMinCharToMakePalindrome.addMinChar("abc d"));
    }

    @Test
    void whenGivenPalindromeWithSpecialCharacters_thenReturnsZero() {
        assertEquals(0, AddMinCharToMakePalindrome.addMinChar("@!!@"));
    }

    @Test
    void whenGivenSpecialCharactersOnly_thenReturnsCorrectValue() {
        assertEquals(2, AddMinCharToMakePalindrome.addMinChar("!@#"));
    }

    @Test
    void whenGivenStringWithMixedCase_thenReturnsRequiredChar() {
        assertEquals(0, AddMinCharToMakePalindrome.addMinChar("Aba"));
    }

    @Test
    void whenGivenNullString_thenThrowException() {
        assertThrows(NullPointerException.class, () -> AddMinCharToMakePalindrome.addMinChar(null));
    }

}
