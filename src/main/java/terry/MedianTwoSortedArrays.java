package terry;

import java.util.Arrays;

/**
 * Median of Two Sorted Arrays [Hard
 * <p>
 * Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.
 * <p>
 * The overall run time complexity should be O(log (m+n)).
 */
public class MedianTwoSortedArrays {

    /**
     * Runtime 1 ms, Memory 44.50 MB
     * beats 100%           74.33%
     */
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if (nums1.length + nums2.length == 1) {
            return nums1.length == 1 ? nums1[0] : nums2[0];
        }

        int i1 = 0;
        int i2 = 0;
        int length = nums1.length + nums2.length;
        int mid = (length + 1) / 2 - 1;
        double lower = 0.0d;
        double upper = 0.0d;

        for (int i = 0; i <= mid + 1; i = i1 + i2) {
            if (i2 >= nums2.length || i1 < nums1.length && nums1[i1] <= nums2[i2]) {
                if (i == mid) {
                    lower = nums1[i1];
                }
                if (i > mid) {
                    upper = nums1[i1];
                }
                ++i1;
            } else {
                if (i == mid) {
                    lower = nums2[i2];
                }
                if (i > mid) {
                    upper = nums2[i2];
                }
                ++i2;
            }
        }

        return (nums1.length + nums2.length) % 2 > 0
                ? lower : (upper + lower) / 2;
    }

    /**
     * Runtime 5 ms, Memory 44.2 MB
     * Beats  20.28%        91.99%
     */
    public double findMedianSortedArrays0(int[] nums1, int[] nums2) {
        // leetcode Runtime: 5ms; Memory 44.23mb
        int[] all = new int[nums1.length + nums2.length];
        System.arraycopy(nums1, 0, all, 0, nums1.length);
        System.arraycopy(nums2, 0, all, nums1.length, nums2.length);
        Arrays.sort(all);
        return all.length % 2 > 0
                ? all[all.length / 2]
                : all[all.length / 2 - 1] + all[all.length / 2] / 2d;
    }
}