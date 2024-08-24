package terry;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SmallestDivisorForThresholdTest {

    @Test
    void findSmallestDivisorTest() {
        SmallestDivisorForThreshold smallestDivisorForThreshold = new SmallestDivisorForThreshold();
        List<Integer> numberList = Arrays.asList(1, 2, 5, 9);
        int threshold = 6;
        int expectedDivisor = 5;

        int actualDivisor = smallestDivisorForThreshold.findSmallestDivisor(numberList, threshold);

        assertEquals(expectedDivisor, actualDivisor);
    }
}