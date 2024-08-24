package terry;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumTest {

    @Test
    void twoSumTest0() {
        TwoSum twoSum = new TwoSum();
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] expectedOutput = {0, 1};

        int[] actualOutput = twoSum.twoSum(nums, target);

        Arrays.sort(actualOutput);
        assertArrayEquals(expectedOutput, actualOutput);
    }

    @Test
    void twoSumTest1() {
        TwoSum twoSum = new TwoSum();
        int[] nums = {3, 2, 4};
        int target = 6;
        int[] expectedOutput = {1, 2};

        int[] actualOutput = twoSum.twoSum(nums, target);

        Arrays.sort(actualOutput);
        assertArrayEquals(expectedOutput, actualOutput);
    }

    @Test
    void twoSumTest2() {
        TwoSum twoSum = new TwoSum();
        int[] nums = {3, 3};
        int target = 6;
        int[] expectedOutput = {0, 1};

        int[] actualOutput = twoSum.twoSum(nums, target);

        Arrays.sort(actualOutput);
        assertArrayEquals(expectedOutput, actualOutput);
    }
}