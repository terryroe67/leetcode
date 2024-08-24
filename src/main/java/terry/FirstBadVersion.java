package terry;

import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

/**
 * 278. First Bad Version [Easy]
 * <p>
 * You are a product manager and currently leading a team to develop
 * a new product. Since each version is developed based on the previous
 * version, all the versions after a bad version are also bad. Suppose
 * you have n versions [1, 2, ..., n] and you want to find out the
 * first bad one, which causes all the following ones to be bad. You
 * are given an API bool isBadVersion(version) which will return
 * whether version is bad.
 */
public class FirstBadVersion extends BinarySearchTemplate {

    public int firstBadVersion(List<Integer> versions, final int firstBadVersion) {
        int left = Collections.min(versions);
        int right = Collections.max(versions);
        Predicate<Integer> isBadVersion = version -> version >= firstBadVersion;

        return search(left, right, isBadVersion);
    }
}
