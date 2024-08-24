package terry;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ReverseIntegerTest {

    ReverseInteger test = new ReverseInteger();

    @Test
    void reverseTest123() {
        assertEquals(123, test.reverse(321));
    }
    @Test
    void reverseTest321() {
        assertEquals(321, test.reverse(123));
    }
    @Test
    void reverseTestNegative123() {
        assertEquals(-123, test.reverse(-321));
    }
    @Test
    void reverseTest120() {
        assertEquals(21, test.reverse(120));
    }
}