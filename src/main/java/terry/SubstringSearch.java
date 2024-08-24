package terry;

import java.util.HashSet;
import java.util.Set;

/*
For a String, how many substrings exists that have no repeating characters.
Substrings are different if different start/end index.

Constaints
- 1 <= s.length <= 10^5
- lowercase letters a to z

bcada = 12
abcd = 10
 */
public class SubstringSearch {

    public static int findSubstrings0(String s) {
        if (s == null || s.isEmpty()) {
            return 0;cd ..
        }
        if (s.length() == 1) {
            return 1;
        }
        // main loop, only loop to next-to-last character,
        // it is a substring, initializing count to 1
        int count = 1;
        for (int i = 0; i < s.length() - 1; ++i) {
            int end = s.length();
            for (int j = i; j < end; ++j) {
                for (int k = j + 1; k < end; ++k) {
                    if (s.charAt(j) == s.charAt(k)) {
                        end = k;
                    }
                }
            }
            // the length of non-dupe substring
            // equals the number of substrings
            count += end - i;
        }
        return count;
    }
    public static int findSubstrings(String s) {
        int count = 0, n = s.length();
        Set<Character> set = new HashSet<>();
        int left = 0;
        for (int right = 0; right < n; ++right) {
            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left++));
            }
            set.add(s.charAt(right));
            count += right - left + 1;
        }
        return count;
    }

}
