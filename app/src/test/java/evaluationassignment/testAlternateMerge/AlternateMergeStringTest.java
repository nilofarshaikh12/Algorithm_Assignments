package evaluationassignment.testAlternateMerge;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import evaluationassignment.alternateMerge.AlternateMergeString;

public class AlternateMergeStringTest {

    @Test
    public void testEqualLengthStrings(){
        String str1="abc";
        String str2="xyz";
        assertEquals("axbycz", AlternateMergeString.getAlternativeMergedString(str1, str2));
    }

    @Test
    public void testStr1Longer(){
        String str1="abcde";
        String str2="abc";
        assertEquals("aabbccde", AlternateMergeString.getAlternativeMergedString(str1, str2));
    }

    @Test
    public void testStr2Longer(){
        String str1="abc";
        String str2="uythfys";
        assertEquals("aubycthfys", AlternateMergeString.getAlternativeMergedString(str1, str2));
    }

    @Test
    public void testStr1Empty(){
        String str1="";
        String str2="abc";
        assertEquals("abc", AlternateMergeString.getAlternativeMergedString(str1, str2));
    }

    @Test
    public void testStr2Empty(){
        String str1="abcde";
        String str2="";
        assertEquals("abcde", AlternateMergeString.getAlternativeMergedString(str1, str2));
    }

    @Test
    public void testBothEmptyStrings(){
        String str1="";
        String str2="";
        assertEquals("", AlternateMergeString.getAlternativeMergedString(str1, str2));
    }
}
