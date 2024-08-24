package terry;

import java.util.function.Predicate;

/**
 * 35. Search Insert Position [Easy]
 * <p>
 * Given a sorted array and a target value, return the index if the target is
 * found. If not, return the index where it would be if it were inserted in
 * order. You may assume no duplicates in the array.
 */
public class SearchInsertPosition extends BinarySearchTemplate {

    public int searchInsertPosition(int[] values, int input) {
        int left = 0;
        int right = values.length;
        Predicate<Integer> isPositionAfterValue = index -> values[index] >= input;

        return search(left, right, isPositionAfterValue);
    }
}