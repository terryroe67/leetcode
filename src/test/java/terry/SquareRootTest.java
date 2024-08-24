package terry;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SquareRootTest {

    private final SquareRoot calculate = new SquareRoot();

    @Test
    void sqrtTest() {
        int[][] results = {{0, 0}, {1, 1}, {2, 1}, {3, 1}, {4, 2}, {5, 2}, {6, 2}, {7, 2}, {8, 2}, {9, 3}};

        for (int[] result : results) {
            int actualSqrt = calculate.sqrt(result[0]);

            assertEquals(result[1], actualSqrt);
        }
    }
}