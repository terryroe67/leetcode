package terry;

import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

/**
 * 1283. Find the Smallest Divisor Given a Threshold [Medium]
 * Given an array of integers nums and an integer threshold, we will
 * choose a positive integer divisor and divide all the array by it
 * and sum the result of the division. Find the smallest divisor
 * such that the result mentioned above is less than or equal to
 * threshold.
 * <p>
 * Each result of division is rounded to the nearest integer
 * greater than or equal to that element. (For example: 7/3 = 3
 * and 10/2 = 5). It is guaranteed that there will be an answer.
 */
public class SmallestDivisorForThreshold extends BinarySearchTemplate {

    public int findSmallestDivisor(List<Integer> numberList, int threshold) {
        int left = 1;
        int right = Collections.max(numberList);
        Predicate<Integer> condition = value -> numberList
                .stream()
                .mapToInt(number -> (number - 1) / value + 1)
                .sum() <= threshold;

        return search(left, right, condition);
    }
}