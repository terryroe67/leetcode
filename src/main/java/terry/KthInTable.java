package terry;

import java.util.function.Predicate;
import java.util.stream.IntStream;

/**
 * 668. Kth Smallest Number in Multiplication Table [Hard]
 * <p>
 * Nearly every one have used the Multiplication Table. But
 * could you find out the k-th smallest number quickly from
 * the multiplication table? Given the height m and the
 * length n of a m * n Multiplication Table, and a positive
 * integer k, you need to return the k-th smallest number
 * in this table.
 */
public class KthInTable extends BinarySearchTemplate {

    public int findKthInTable(int rows, int columns, int k) {
        int left = 1;
        int right = rows + 1;
        Predicate<Integer> condition = value -> {
            int count = 0;
            int add;
            for (int row = 1; row <= rows; ++row) {
                add = Math.min(value / row, columns);
                if (add == 0) {
                    break;
                }
                count += add;
            }
            return count >= k;
        };

        return search(left, right, condition);
    }

    public int findKthInTableAlt(int rows, int columns, int k) {
        int left = 1;
        int right = rows + 1;
        Predicate<Integer> condition = value -> IntStream
                .range(1, value + 1)
                .map(row -> Math.min(value / row, columns))
                .sum()
                >= k;

        return search(left, right, condition);
    }
}