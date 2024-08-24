package terry;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 * Longest Substring Without Repeating Characters [Medium]
 * <p>
 * Given a string s, find the length of the longest substring
 * without repeating characters.
 */
public class LongestSubstringWithoutRepeating extends BinarySearchTemplate {

    private char[] c = null;

    public int lengthOfLongestSubstringTerry(String s) {
        c = s.toCharArray();
        int left = 1;
        int right = c.length + 1;
        return search(left, right, this::substringNotFoundForLength) - 1;
    }

    public boolean substringNotFoundForLength(Integer length) {
        boolean substringFound = false;
        for (int i = 0, end = c.length - length + 1; !substringFound && i < end; ++i) {
            boolean hasDuplicate = false;
            for (int j = i, jEnd = i + length - 1; !hasDuplicate && j < jEnd; ++j) {
                for (int k = j + 1, kEnd = i + length; !hasDuplicate && k < kEnd; ++k) {
                    hasDuplicate = c[j] == c[k];
                }
            }
            substringFound = !hasDuplicate;
        }
        return !substringFound;
    }

    public int lengthOfLongestSubstringAlt(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int i = 0;
        int j = 0;
        int max = 0;
        while (j < s.length()) {
            map.put(s.charAt(j), map.getOrDefault(s.charAt(j), 0) + 1);
            if (map.size() == j - i + 1) {
                max = Math.max(max, j - i + 1);
            } else {
                while (map.size() < j - i + 1) {
                    map.put(s.charAt(i), map.get(s.charAt(i)) - 1);
                    if (map.get(s.charAt(i)) == 0) map.remove(s.charAt(i));
                    i++;
                }
            }
            ++j;
        }
        return max;
    }

    public int lengthOfLongestSubstring(String s) {
        int lengthOfLongest = 0;
        HashSet<Character> set = new HashSet<>();
        for (int i = 0, j = 0; i < s.length(); ++i) {
            Character c = s.charAt(i);
            if (set.contains(c)) {
                lengthOfLongest = Math.max(lengthOfLongest, set.size());
                Character r = s.charAt(j++);
                while (!r.equals(c)) {
                    set.remove(r);
                    r = s.charAt(j++);
                }
            } else {
                set.add(c);
            }
        }
        lengthOfLongest = Math.max(lengthOfLongest, set.size());
        return lengthOfLongest;
    }
}