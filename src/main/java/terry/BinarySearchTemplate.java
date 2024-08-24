package terry;

import java.util.function.Predicate;

public class BinarySearchTemplate {

    public int search(int left, int right, Predicate<Integer> condition) {
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (condition.test(mid)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
}