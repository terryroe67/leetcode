package terry;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FirstBadVersionTest {

    private final FirstBadVersion calculate = new FirstBadVersion();

    @Test
    void firstBadVersionTest() {
        List<Integer> versions = Arrays.asList(1, 3, 4, 5, 7, 8);
        int firstBadVersion = 4;
        int expectedFirstBadVersion = 4;

        int actualFirstBadVersion = calculate.firstBadVersion(versions, firstBadVersion);

        assertEquals(expectedFirstBadVersion, actualFirstBadVersion);
    }
}