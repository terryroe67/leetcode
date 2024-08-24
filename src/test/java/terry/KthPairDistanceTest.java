package terry;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KthPairDistanceTest {

    @Test
    void findKthPairDistanceTest() {
        KthPairDistance calculator = new KthPairDistance();
        int[] nums = {1, 3, 1};
        int kthSmallestDistance = 1;
        int expectedDistance = 0;

        int actualDistance = calculator.findKthPairDistance(nums, kthSmallestDistance);

        assertEquals(expectedDistance, actualDistance);
    }

    @Test
    void findKthPairDistance1Test() {
        KthPairDistance calculator = new KthPairDistance();
        int[] nums = {1, 3, 1};
        int kthSmallestDistance = 1;
        int expectedDistance = 0;

        int actualDistance = calculator.findKthPairDistance1(nums, kthSmallestDistance);

        assertEquals(expectedDistance, actualDistance);
    }

    @Test
    void findKthPairDistance2Test() {
        KthPairDistance calculator = new KthPairDistance();
        int[] nums = {1, 3, 1};
        int kthSmallestDistance = 1;
        int expectedDistance = 0;

        int actualDistance = calculator.findKthPairDistance2(nums, kthSmallestDistance);

        assertEquals(expectedDistance, actualDistance);
    }
}