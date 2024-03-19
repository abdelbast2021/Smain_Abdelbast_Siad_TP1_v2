package BranchCoverageTest;

import BranchCoverageTest.Anagram;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class Exo2Test {

    @Test
    void testIsAnagram_True() {
        assertTrue(BranchCoverageTest.Anagram.isAnagramCorrected("listen", "silent"));
        assertTrue(BranchCoverageTest.Anagram.isAnagramCorrected("railsafety", "fairytales"));
        assertTrue(BranchCoverageTest.Anagram.isAnagramCorrected("debitcard", "badcredit"));
        assertTrue(BranchCoverageTest.Anagram.isAnagramCorrected("anagram", "nagaram"));
    }

    @Test
    void testIsAnagram_False() {

        assertFalse(BranchCoverageTest.Anagram.isAnagramCorrected("test", "tests"));
        assertFalse(BranchCoverageTest.Anagram.isAnagramCorrected("foo", "bar"));

    }

    @Test
    void testIsAnagram_NullStrings() {
        assertThrows(NullPointerException.class, () -> BranchCoverageTest.Anagram.isAnagramCorrected(null, "test"));
        assertThrows(NullPointerException.class, () -> BranchCoverageTest.Anagram.isAnagramCorrected("test", null));
        assertThrows(NullPointerException.class, () -> Anagram.isAnagramCorrected(null, null));
    }




}
