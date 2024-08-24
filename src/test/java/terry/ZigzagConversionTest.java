package terry;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
/**
 * Zigzag Conversion [Medium]
 * The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)
 * <p>
 * P   A   H   N
 * A P L S I I G
 * Y   I   R
 * And then read line by line: "PAHNAPLSIIGYIR"
 * <p>
 * row = 5
 * 0         8          16
 * 1      7  9       15
 * 2    6   10    14
 * 3  5     11 13
 * 4        12
 * <p>
 * 0 8 16 1 7 9 15 2 6i 10 14 3 5 11 13 4 12
 * <p>
 * Write the code that will take a string and make this conversion given a number of rows
 * <p>
 * row = 4
 * 0     6       12
 * 1   5 7    11 13
 * 2 4   8 10    14
 * 3     9       15
 * <p>
 * 0 6 12 1 5 7 11 13 2 4 8 10 14 3 9 15
 * <p>
 * row = 3
 * 0   4   8
 * 1 3 5 7 9
 * 2   6   10
 * <p>
 * 0 4 8 1 3 5 7 9 2 6 10
 * <p>
 * row = 2
 * 0 2 4
 * 1 3 5
 * <p>
 * 0 2 4 1 3 5
 * <p>
 */
class ZigzagConversionTest {

    ZigzagConversion test = new ZigzagConversion();

    @Test
    void convertA() {
        assertEquals("A", test.convert("A", 1));
    }

    @Test
    void convertPAYPALISHIRING1() {
        assertEquals("PAYPALISHIRING", test.convert("PAYPALISHIRING", 1));
    }

    @Test
    void convertPAYPALISHIRING2() {
        assertEquals("PYAIHRNAPLSIIG", test.convert("PAYPALISHIRING", 2));
    }

    @Test
    void convertPAYPALISHIRING3() {
        assertEquals("PAHNAPLSIIGYIR", test.convert("PAYPALISHIRING", 3));
    }

    @Test
    void convertPAYPALISHIRING4() {
        assertEquals("PINALSIGYAHRPI", test.convert("PAYPALISHIRING", 4));
    }

    @Test
    void convertPAYPALISHIRING7() {
        assertEquals("PNAIGYRPIAHLSI", test.convert("PAYPALISHIRING", 7));
    }

    @Test
    void convertPAYPALISHIRINGALT4() {
        assertEquals("PINALSIGYAHRATPIL", test.convert("PAYPALISHIRINGALT", 4));
    }

    @Test
    void convertPAYPALISHIRINGALTE4() {
        assertEquals("PINALSIGEYAHRATPIL", test.convert("PAYPALISHIRINGALTE", 4));
    }

    @Test
    void convertPAYPALISHIRINGALTER4() {
        assertEquals("PINRALSIGEYAHRATPIL", test.convert("PAYPALISHIRINGALTER", 4));
    }

    @Test
    void convertPAYPALISHIRINGALTERN4() {
        assertEquals("PINRALSIGENYAHRATPIL", test.convert("PAYPALISHIRINGALTERN", 4));
    }
}