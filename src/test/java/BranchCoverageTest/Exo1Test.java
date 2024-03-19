package BranchCoverageTest;

import org.example.Anagram;
import org.example.Palindrome;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class Exo1Test {
    public Palindrome palindrome;
    @BeforeEach
    void SetUp() {
        palindrome = new Palindrome();
    }

    @Test
    public void testIsPalindrome() {
        assertEquals(true, palindrome.isPalindromeCorected("abcdcba"));
    }

    @Test
    public void testIsPalindrome2() {
        assertEquals(true, palindrome.isPalindromeCorected("abba"));
    }

    @Test
    public void testIsPalindromeNull() {
        assertThrows(NullPointerException.class,  () ->palindrome.isPalindromeCorected(null));
    }





    @Test
    public void testNonPalindromeWord() {
        String nonPalindrome = "abcde";
        assertEquals(false, palindrome.isPalindromeCorected(nonPalindrome));
    }
}