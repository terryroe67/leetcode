package terry;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class KokoEatingBananasTest {

    private final KokoEatingBananas calculate = new KokoEatingBananas();

    @Test
    void minEatingSpeedExample1() {
        List<Integer> piles = Arrays.asList(3, 6, 7, 11);
        int hours = 8;
        int expectedBananasPerHour = 4;

        int bananasPerHour = calculate.minEatingSpeed(piles, hours);

        assertEquals(expectedBananasPerHour, bananasPerHour);
    }

    @Test
    void minEatingSpeedExample2() {
        KokoEatingBananas calculate = new KokoEatingBananas();
        List<Integer> piles = Arrays.asList(30, 11, 23, 4, 20);
        int hours = 5;
        int expectedBananasPerHour = 30;

        int bananasPerHour = calculate.minEatingSpeed(piles, hours);

        assertEquals(expectedBananasPerHour, bananasPerHour);
    }

    @Test
    void minEatingSpeedExample3() {
        KokoEatingBananas calculate = new KokoEatingBananas();
        List<Integer> piles = Arrays.asList(30, 11, 23, 4, 20);
        int hours = 6;
        int expectedBananasPerHour = 23;

        int bananasPerHour = calculate.minEatingSpeed(piles, hours);

        assertEquals(expectedBananasPerHour, bananasPerHour);
    }
}