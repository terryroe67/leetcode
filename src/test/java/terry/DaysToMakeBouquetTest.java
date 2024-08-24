package terry;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DaysToMakeBouquetTest {

    @Test
    void calculateMinimumDaysToMakeBouquet() {
        DaysToMakeBouquet daysToMakeBouquet = new DaysToMakeBouquet();
        List<Integer> bloomDay = Arrays.asList(1, 10, 3, 10, 2);
        int bouquetCount = 3;
        int flowers = 1;
        int expectedDays = 3;

        int actualDays = daysToMakeBouquet.calculateMinimumDaysToMakeBouquet(bloomDay, bouquetCount, flowers);

        assertEquals(expectedDays, actualDays);
    }

    @Test
    void impossibleBouquet() {
        DaysToMakeBouquet daysToMakeBouquet = new DaysToMakeBouquet();
        List<Integer> bloomDay = Arrays.asList(1, 10, 3, 10, 2);
        int bouquetCount = 3;
        int flowers = 2;
        int expectedDays = -1;

        int actualDays = daysToMakeBouquet.calculateMinimumDaysToMakeBouquet(bloomDay, bouquetCount, flowers);

        assertEquals(expectedDays, actualDays);
    }

    @Test
    void calculateMinimumDaysToMakeBouquetExample() {
        DaysToMakeBouquet daysToMakeBouquet = new DaysToMakeBouquet();
        List<Integer> bloomDay = Arrays.asList(1, 10, 3, 10, 2);
        int bouquetCount = 3;
        int flowers = 1;
        int expectedDays = 3;

        int actualDays = daysToMakeBouquet.calculateMinimumDaysToMakeBouquetExample(bloomDay, bouquetCount, flowers);

        assertEquals(expectedDays, actualDays);
    }

    @Test
    void impossibleBouquetExample() {
        DaysToMakeBouquet daysToMakeBouquet = new DaysToMakeBouquet();
        List<Integer> bloomDay = Arrays.asList(1, 10, 3, 10, 2);
        int bouquetCount = 3;
        int flowers = 2;
        int expectedDays = -1;

        int actualDays = daysToMakeBouquet.calculateMinimumDaysToMakeBouquetExample(bloomDay, bouquetCount, flowers );

        assertEquals(expectedDays, actualDays);
    }
}