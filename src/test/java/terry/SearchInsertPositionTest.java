package terry;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SearchInsertPositionTest {

    private final SearchInsertPosition calculate = new SearchInsertPosition();

    @Test
    void searchInsertPositionTest0() {
        int[] values = {1, 3, 5, 6};
        int input = 5;
        int expectedPosition = 2;

        int actualPosition = calculate.searchInsertPosition(values, input);

        assertEquals(expectedPosition, actualPosition);
    }

    @Test
    void searchInsertPositionTest1() {
        int[] values = {1, 3, 5, 6};
        int input = 2;
        int expectedPosition = 1;

        int actualPosition = calculate.searchInsertPosition(values, input);

        assertEquals(expectedPosition, actualPosition);
    }
}