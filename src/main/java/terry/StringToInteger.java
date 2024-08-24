package terry;

/**
 * String to Integer (atoi) [Medium]
 * <p>
 * Implement the myAtoi(string s) function, which converts a string
 * to a 32-bit signed integer (similar to C/C++'s atoi function).
 * <p>
 * The algorithm for myAtoi(string s) is as follows:
 * <p>
 * Read in and ignore any leading whitespace.
 * Check if the next character (if not already at the end of the string)
 * is '-' or '+'. Read this character in if it is either. This determines
 * if the final result is negative or positive respectively. Assume the
 * result is positive if neither is present.
 * Read in next the characters until the next non-digit character or the
 * end of the input is reached. The rest of the string is ignored.
 * Convert these digits into an integer
 * (i.e. "123" -> 123, "0032" -> 32).
 * If no digits were read, then the integer is 0. Change the sign as
 * necessary (from step 2).
 * If the integer is out of the 32-bit signed integer range [-231, 231 - 1],
 * then clamp the integer so that it remains in the range. Specifically,
 * integers less than -231 should be clamped to -231, and integers greater
 * than 231 - 1 should be clamped to 231 - 1.
 * Return the integer as the final result.
 */
public class StringToInteger {

    /**
     * Runtime 1 ms; Memory 41.37 MB
     *       100%           55.18%
     */
    public int myAtoi(String s) {
        long value = 0;
        boolean positive = true;
        char[] c = s.toCharArray();
        int i = 0;
        while (i < c.length && c[i] == ' ') {
            ++i;
        }
        if (i < c.length && (c[i] == '+' || c[i] == '-')) {
            positive = c[i++] == '+';
        }
        while (i < c.length && Character.isDigit(c[i])) {
            int digit = c[i++] - '0';
            value = value * 10;
            if (positive) {
                value += digit;
            } else {
                value -= digit;
            }
            if (value < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }
            if (value > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }
        }
        return Long.valueOf(value).intValue();
    }
}