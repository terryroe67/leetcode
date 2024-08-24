package terry;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringToIntegerTest {

    @Test
    void myAtoiTest0() {
        StringToInteger sut = new StringToInteger();
        String input = "42";
        int expected = 42;

        int actual = sut.myAtoi(input);

        assertEquals(expected, actual);
    }

    @Test
    void myAtoiTest1() {
        StringToInteger sut = new StringToInteger();
        String input = "-42";
        int expected = -42;

        int actual = sut.myAtoi(input);

        assertEquals(expected, actual);
    }

    @Test
    void myAtoiTest2() {
        StringToInteger sut = new StringToInteger();
        String input = "4193 with words";
        int expected = 4193;

        int actual = sut.myAtoi(input);

        assertEquals(expected, actual);
    }

    @Test
    void myAtoiTest3() {
        StringToInteger sut = new StringToInteger();
        String input = "9223372036854775808";
        int expected = 2147483647;

        int actual = sut.myAtoi(input);

        assertEquals(expected, actual);
    }

    @Test
    void myAtoiTest4() {
        StringToInteger sut = new StringToInteger();
        String input = "-91283472332";
        int expected = -2147483648;

        int actual = sut.myAtoi(input);

        assertEquals(expected, actual);
    }
}