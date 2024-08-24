package terry;

import java.util.HashMap;
import java.util.Map;

/**
 * Regular Expression Matcher [Hard]
 * <p>
 * Given an input string s and a pattern p, implement regular expression matching with support for '.' and '*' where:
 * <p>
 * '.' Matches any single character
 * '*' Matches zero or more of the preceding element
 * <p>
 * The matching should cover the entire input string (not partial).
 */
public class RegularExpressionMatcher {

    Map<Integer, Boolean> memoMap = new HashMap<>();

    public boolean isMatch(String s, String p) {
        return dp(0, 0, s.toCharArray(), p.toCharArray());
    }

    public boolean dp(int i, int j, char[] s, char[] p) {
        int key = i * (p.length + 1) + j;
        if (memoMap.containsKey(key)) {
            return memoMap.get(key);
        }
        boolean memo;
        if (j == p.length) {
            memo = i == s.length;
        } else {
            boolean first_match = i < s.length && (p[j] == s[i] || p[j] == '.');
            if (j + 1 < p.length && p[j + 1] == '*') {
                memo = dp(i, j + 2, s, p) || first_match && dp(i + 1, j, s, p);
            } else {
                memo = first_match && dp(i + 1, j + 1, s, p);
            }
        }
        memoMap.put(key, memo);
        return memo;
    }
}