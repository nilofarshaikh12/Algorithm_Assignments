package evaluationassignment.testAnagramString;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
import evaluationassignment.anagramString.AnagramString;

public class AnagramStringTest {

    @Test
    public void testSimpleAnagram(){
        String str1= "abc";
        String str2= "bac";
        assertEquals(0, AnagramString.countAnagram(str1, str2));
    }

    @Test
    public void testWithDuplicate(){
        String str1= "dhcdt";
        String str2= "cd";
        assertEquals(3, AnagramString.countAnagram(str1, str2));
    }

    @Test
    public void testBothEmptyStrings(){
        String str1= "";
        String str2= "";
        assertEquals(0, AnagramString.countAnagram(str1, str2));
    }

    @Test
    public void testOneEmptyString(){
        String str1= "";
        String str2= "htufhd";
        assertEquals(6, AnagramString.countAnagram(str1, str2));
    }

    @Test
    public void testMixedCaseStrings(){
        String str1= "hGTfd";
        String str2= "hgf";
        assertEquals(2, AnagramString.countAnagram(str1, str2));
    }

    @Test
    public void testBothDifferentStrings(){
        String str1= "abc";
        String str2= "xyz";
        assertEquals(6, AnagramString.countAnagram(str1, str2));
    }

    @Test
    public void testWithNullStrings(){
        assertThrows(NullPointerException.class, ()->AnagramString.countAnagram(null, "abc"));
        assertThrows(NullPointerException.class, ()->AnagramString.countAnagram("ab", null));
    }
}
