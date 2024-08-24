package terry;

import java.util.function.Predicate;
import java.util.stream.IntStream;

/**
 * 1011. Capacity To Ship Packages Within D Days [Medium]
 * <p>
 * A conveyor belt has packages that must be shipped from one port to another
 * within D days. The i-th package on the conveyor belt has a weight of
 * weights[i]. Each day, we load the ship with packages on the conveyor belt (in
 * the order given by weights). We may not load more weight than the maximum
 * weight capacity of the ship.
 * <p>
 * Return the least weight capacity of the ship that will result in all the
 * packages on the conveyor belt being shipped within D days.
 * <p>
 * 410. Split Array Largest Sum [Hard]
 * Given an array which consists of non-negative integers and an integer m, you
 * can split the array into m non-empty continuous subarrays. Write an
 * algorithm to minimize the largest sum among these m subarrays.
 */
public class CapacityToShipPackages extends BinarySearchTemplate {

    public int calculateCapacityToShipPackages(int[] weights, final int numberOfDays) {
        int left = IntStream.of(weights).reduce(0, Math::max);
        int right = IntStream.of(weights).sum();
        Predicate<Integer> hasCapacityToShipPackages = testCapacity -> {
            int total = 0;
            int day = 1;
            for (int weight : weights) {
                total += weight;
                if (total > testCapacity) {
                    total = weight;
                    if (++day > numberOfDays) {
                        return false;
                    }
                }
            }
            return true;
        };

        return search(left, right, hasCapacityToShipPackages);
    }
}