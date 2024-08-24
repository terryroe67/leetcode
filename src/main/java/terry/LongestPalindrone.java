package terry;

/**
 * Given a string s, return the longest palindromic substring in s. [Medium]
 */
public class LongestPalindrone {

    public String longestPalindrome(String s) {
        char[] c = s.toCharArray();
        String palindrome = "";
        for (int i = 0; i < c.length; ++i) {
            for (int j = 0; j < 2 && i + j < c.length; ++j) {
                int x = i;
                int y = i + j;
                while (c[x] == c[y]
                        && x - 1 >= 0
                        && y + 1 < c.length
                        && c[x-1] == c[y+1]) {
                    --x;
                    ++y;
                }
                if (c[x] == c[y] && y - x + 1 > palindrome.length()) {
                    palindrome = new String(c, x, y - x + 1);
                }
            }
        }
        return palindrome;
    }
}