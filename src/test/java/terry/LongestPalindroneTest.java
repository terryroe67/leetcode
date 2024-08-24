package terry;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestPalindroneTest {

    LongestPalindrone test = new LongestPalindrone();

    @Test
    void longestPalindromeTest0() {
        String input = "babad";
        String expected = "bab"; // or "aba"

        String actual = test.longestPalindrome(input);

        assertEquals(expected, actual);
    }

    @Test
    void longestPalindromeTest1() {
        String input = "cbbd";
        String expected = "bb";

        String actual = test.longestPalindrome(input);

        assertEquals(expected, actual);
    }

    @Test
    void longestPalindromeTest2() {
        String input = "a";
        String expected = "a";

        String actual = test.longestPalindrome(input);

        assertEquals(expected, actual);
    }

    @Test
    void longestPalindromeTest3() {
        String input = "aa";
        String expected = "aa";

        String actual = test.longestPalindrome(input);

        assertEquals(expected, actual);
    }

    @Test
    void longestPalindromeTest4() {
        String input = "";
        String expected = "";

        String actual = test.longestPalindrome(input);

        assertEquals(expected, actual);
    }

    @Test
    void longestPalindromeTest5() {
        String input = "aaaabbbbb";
        String expected = "bbbbb";

        String actual = test.longestPalindrome(input);

        assertEquals(expected, actual);
    }
}