package terry;

/**
 * ReverseInteger [Medium]
 * <p>
 * Given a string s, return the longest palindromic substring in s. [Medium]
 */
public class ReverseInteger {

    public int reverse(int value) {
        long result = 0L;
        while (value != 0) {
            result = result * 10L + value % 10;
            value = value / 10;
        }
        if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) {
            result = 0L;
        }
        return Math.toIntExact(result);
    }

    public int reverse0(int value) {
        char[] c = Integer.toString(value).toCharArray();
        for (int i = 0, j = c.length - 1; i < j; ++i, --j) {
            char t = c[i]; c[i] = c[j]; c[j] = t;
        }
        return Integer.parseInt(new String(c));
    }
}