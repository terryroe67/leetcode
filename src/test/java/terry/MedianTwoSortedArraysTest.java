package terry;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MedianTwoSortedArraysTest {

    MedianTwoSortedArrays sut = new MedianTwoSortedArrays();

    @Test
    void findMedianSortedArraysTest1() {
        int[] nums1 = {1, 3}, nums2 = {2};
        double expected = 2.0d;
        double actual = sut.findMedianSortedArrays(nums1, nums2);
        assertEquals(expected, actual);
    }

    @Test
    void findMedianSortedArraysTest2() {
        int[] nums1 = {1, 2}, nums2 = {3, 4};
        double expected = 2.5d;
        double actual = sut.findMedianSortedArrays(nums1, nums2);
        assertEquals(expected, actual);
    }

    @Test
    void findMedianSortedArraysTest3() {
        int[] nums1 = new int[0], nums2 = {1, 2, 3, 4};
        double expected = 2.5d;
        double actual = sut.findMedianSortedArrays(nums1, nums2);
        assertEquals(expected, actual);
    }

    @Test
    void findMedianSortedArraysTest4() {
        int[] nums1 = new int[0], nums2 = {1};
        double expected = 1d;
        double actual = sut.findMedianSortedArrays(nums1, nums2);
        assertEquals(expected, actual);
    }
}