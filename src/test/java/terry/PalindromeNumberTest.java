package terry;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PalindromeNumberTest {

    PalindromeNumber sut = new PalindromeNumber();

    @Test
    void isPalindromeTest121() {
        assertTrue(sut.isPalindrome(121));
    }

    @Test
    void isPalindromeTestNegative121() {
        assertFalse(sut.isPalindrome(-121));
    }

    @Test
    void isPalindromeTest10() {
        assertFalse(sut.isPalindrome(10));
    }

    @Test
    void isPalindromeTest10001() {
        assertTrue(sut.isPalindrome(10001));
    }
}