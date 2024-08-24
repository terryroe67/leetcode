package terry;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class UglyNumber3Test {

    @Test
    void nthUglyNumberTest0() {
        UglyNumber3 calculate = new UglyNumber3();
        int nth = 3;
        int[] divisors = {2, 3, 5};
        int expectedValue = 4;

        int actualValue = calculate.nthUglyNumber(nth, divisors);

        assertEquals(expectedValue, actualValue);
    }

    @Test
    void nthUglyNumberTest1() {
        UglyNumber3 calculator = new UglyNumber3();
        int nth = 4;
        int[] divisors = {2, 3, 4};
        int expectedValue = 6;

        int actualValue = calculator.nthUglyNumber(nth, divisors);

        assertEquals(expectedValue, actualValue);
    }

    @Test
    void nthUglyNumberLoopTest0() {
        UglyNumber3 calculate = new UglyNumber3();
        int nth = 3;
        int[] divisors = {2, 3, 5};
        int expectedValue = 4;

        int actualValue = calculate.nthUglyNumberLoop(nth, divisors);

        assertEquals(expectedValue, actualValue);
    }

    @Test
    void nthUglyNumberLoopTest1() {
        UglyNumber3 calculator = new UglyNumber3();
        int nth = 4;
        int[] divisors = {2, 3, 4};
        int expectedValue = 6;

        int actualValue = calculator.nthUglyNumberLoop(nth, divisors);

        assertEquals(expectedValue, actualValue);
    }

    @Test
    void gcdTest() {
        assertEquals(1, UglyNumber3.gcd(2, 3));
        assertEquals(2, UglyNumber3.gcd(2, 4));
        assertEquals(1, UglyNumber3.gcd(3, 4));
        assertEquals(2, UglyNumber3.gcd(2, 12));
    }
}