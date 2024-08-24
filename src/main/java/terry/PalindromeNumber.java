package terry;

/**
 * Palindrome Number [Easy]
 * <p>
 * Given an integer x, return true if x is a
 * palindrome, and false otherwise.
 * <p>
 */
public class PalindromeNumber {

    /**
     * Runtime 4 ms; Memory 42.6 MB
     * 100%;       78.31%
     */
    public boolean isPalindrome(int x) {
        int t = x, y = 0, i;
        while (t > 0) {
            i = t % 10;
            y = y * 10 + i;
            t /= 10;
        }
        return x == y;
    }

    /**
     * Runtime 6 ms; Memory 42.80 MB
     * 39.83%;        52.86%
     */
    public boolean isPalindrome0(int x) {
        if (x < 0) {
            return false;
        }
        if (x < 10) {
            return true;
        }
        char[] c = Integer.toString(x).toCharArray();
        for (int i = 0, j = c.length - 1; i < j; ++i, --j) {
            if (c[i] != c[j]) {
                return false;
            }
        }
        return true;
    }
}