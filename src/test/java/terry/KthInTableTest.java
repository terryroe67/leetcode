package terry;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KthInTableTest {

    @Test
    void findKthInTableTest() {
        KthInTable kthInTable = new KthInTable();
        int rows = 3;
        int columns = 3;
        int k = 5;
        int expectedNumber = 3;

        int actualNumber = kthInTable.findKthInTable(rows, columns, k);

        assertEquals(expectedNumber, actualNumber);
    }

    @Test
    void findKthInTableAltTest() {
        KthInTable kthInTable = new KthInTable();
        int rows = 3;
        int columns = 3;
        int k = 5;
        int expectedNumber = 3;

        int actualNumber = kthInTable.findKthInTableAlt(rows, columns, k);

        assertEquals(expectedNumber, actualNumber);
    }
}