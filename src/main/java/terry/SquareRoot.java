package terry;

import java.util.function.Predicate;

/**
 * 69. Sqrt(x) [Easy]
 * <p>
 * Implement int sqrt(int x). Compute and return the square root of x,
 * where x is guaranteed to be a non-negative integer. Since the return
 * type is an integer, the decimal digits are truncated and only the
 * integer part of the result is returned.
 */
public class SquareRoot extends BinarySearchTemplate {

    public int sqrt(final int input) {
        int left = 0;
        int right = input + 1;
        Predicate<Integer> isLargeEnoughSquared = value -> value * value > input;

        return search(left, right, isLargeEnoughSquared) - 1;
    }
}