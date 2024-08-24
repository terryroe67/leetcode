package terry;

import java.util.Arrays;
import java.util.TreeSet;
import java.util.function.Predicate;

public class KthPairDistance extends BinarySearchTemplate {

    public int findKthPairDistance(int[] numbers, int kthSmallestDistance) {
        int[] nums = Arrays.copyOf(numbers, numbers.length);
        Arrays.sort(nums);
        int left = 0;
        int right = nums[nums.length - 1] - nums[0];
        Predicate<Integer> enough = distance -> {
            int i = 0;
            int j = 0;
            int count = 0;
            while (i < nums.length || j < nums.length) {
                while (j < nums.length && nums[j] - nums[i] <= distance) {
                    ++j;
                }
                // count pairs
                count += j - i - 1;
                ++i;
            }
            return count >= kthSmallestDistance;
        };

        return search(left, right, enough);
    }

    public int findKthPairDistance1(int[] nums, int kthSmallestDistance) {
        TreeSet<Integer> distance = new TreeSet<>();
        for (int i = 0; i < nums.length - 1; ++i) {
            for (int j = i + 1; j < nums.length; ++j) {
                distance.add(Math.abs(nums[j] - nums[i]));
            }
        }
        return distance.toArray(new Integer[0])[kthSmallestDistance - 1];
    }

    public int findKthPairDistance2(int[] nums, int kthSmallestDistance) {
        int left = 0;
        int right = nums[nums.length - 1] - nums[0];
        Predicate<Integer> enough = distance -> {
            int count = 0;
            for (int i = 0; i < nums.length - 1; ++i) {
                for (int j = i + 1; j < nums.length; ++j) {
                    if (Math.abs(nums[i] - nums[j]) <= distance) {
                        ++count;
                        if (count >= kthSmallestDistance) {
                            return true;
                        }
                    }
                }
            }
            return false;
        };

        return search(left, right, enough);
    }
}