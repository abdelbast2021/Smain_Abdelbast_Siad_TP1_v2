package LineCoverageTest;
import org.example.Palindrome;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PalindromeTest {
    private Palindrome palindrome;
    @BeforeEach
    void SetUp() {
        palindrome = new Palindrome();
    }


    @Test
    public void testIsPalindrome() {
        assertEquals(true, palindrome.isPalindrome("abcdcba"));
    }

    @Test
    public void testIsPalindromeWithOneWord() {
        assertEquals(true, palindrome.isPalindrome("aba"));
    }

    @Test
    public void testIsPalindromeWithNullString() {
        String a = null;
        assertEquals(true, palindrome.isPalindrome(a));
    }


    @Test
    public void testIsPalindromeWithNonPalindromeWord() {
        String nonPalindrome = "abcde";
        assertEquals(false, palindrome.isPalindrome(nonPalindrome));
    }
}
