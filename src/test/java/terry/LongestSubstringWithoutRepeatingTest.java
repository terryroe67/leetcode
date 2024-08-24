package terry;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LongestSubstringWithoutRepeatingTest {

    LongestSubstringWithoutRepeating test = new LongestSubstringWithoutRepeating();

    /*
     * Explanation: The answer is "abc", with the length of 3.
     */
    @Test
    void findSubstringTest0() {
        String s = "abcabcbb";
        int expectedLength = 3;

        int actualLength = test.lengthOfLongestSubstring(s);

        assertEquals(expectedLength, actualLength);
    }

    /*
     * The answer is "b", with the length of 1.
     */
    @Test
    void findSubstringTest1() {
        String s = "bbbbb";
        int expectedLength = 1;

        int actualLength = test.lengthOfLongestSubstring(s);

        assertEquals(expectedLength, actualLength);
    }

    /*
     * Explanation: The answer is "wke", with the length of 3.
     */
    @Test
    void findSubstringTest2() {
        String s = "pwwkew";
        int expectedLength = 3;

        int actualLength = test.lengthOfLongestSubstring(s);

        assertEquals(expectedLength, actualLength);
    }

    @Test
    void findSubstringTest3() {
        String s = " ";
        int expectedLength = 1;

        int actualLength = test.lengthOfLongestSubstring(s);

        assertEquals(expectedLength, actualLength);
    }

    @Test
    void findSubstringTest4() {
        String s = "";
        int expectedLength = 0;

        int actualLength = test.lengthOfLongestSubstring(s);

        assertEquals(expectedLength, actualLength);
    }

    @Test
    void findSubstringTest5() {
        String s = "a";
        int expectedLength = 1;

        int actualLength = test.lengthOfLongestSubstring(s);

        assertEquals(expectedLength, actualLength);
    }
}