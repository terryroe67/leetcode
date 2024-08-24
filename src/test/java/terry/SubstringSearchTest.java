package terry;

import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;
import static terry.SubstringSearch.findSubstrings;
import static terry.SubstringSearch.findSubstrings0;

class SubstringSearchTest {

    @Test
    void abac() {
        int expected = 8;
        int actual = findSubstrings("abac");
        assertEquals(expected, actual);
    }

    @Test
    void bcada() {
        int expected = 12;
        int actual = findSubstrings("bcada");
        assertEquals(expected, actual);
    }

    @Test
    void abcd() {
        int expected = 10;
        int actual = findSubstrings("abcd");
        assertEquals(expected, actual);
    }

    @Test
    void random() {
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < 4000; ++i) {
            sb.append(((char)'a' + random.nextInt() % 26));
        }
        String s = sb.toString();
        int expected = findSubstrings(s);
        int actual = findSubstrings0(s);
        assertEquals(expected, actual);
    }

}