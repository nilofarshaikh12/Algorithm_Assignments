package evaluationassignment.testGoodOrBadString;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import evaluationassignment.goodOrBadString.GoodOrBadString;

public class GoodOrBadStringTest {

    @Test
    public void testGoodString() {
        String str = "abehok";
        assertEquals("Good String", GoodOrBadString.checkGoodOrBad(str));
    }

    @Test
    public void testBadWithVowel() {
        String str = "aeiouihg";
        assertEquals("Bad String", GoodOrBadString.checkGoodOrBad(str));
    }

    @Test
    public void testBadWithConsonant() {
        String str = "acdkluihg";
        assertEquals("Bad String", GoodOrBadString.checkGoodOrBad(str));
    }

    @Test
    public void testBadWithQuestionMark() {
        String str = "ae??ouihg";
        assertEquals("Bad String", GoodOrBadString.checkGoodOrBad(str));
    }

    @Test
    public void testGoodWithQuestionMark() {
        String str = "a?hki?k";
        assertEquals("Good String", GoodOrBadString.checkGoodOrBad(str));
    }

    @Test
    public void testEmptyString() {
        String str = "";
        assertEquals("Good String", GoodOrBadString.checkGoodOrBad(str));
    }
}
