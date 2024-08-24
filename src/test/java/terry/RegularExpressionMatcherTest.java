package terry;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class RegularExpressionMatcherTest {

    @Test
    void isMatchTest1() {
        RegularExpressionMatcher sut = new RegularExpressionMatcher();
        String s = "aa";
        String p = "a";

        boolean actual = sut.isMatch(s, p);

        assertFalse(actual);
    }

    @Test
    void isMatchTest2() {
        RegularExpressionMatcher sut = new RegularExpressionMatcher();
        String s = "aa";
        String p = "a*";

        boolean actual = sut.isMatch(s, p);

        assertTrue(actual);
    }

    @Test
    void isMatchTest3() {
        RegularExpressionMatcher sut = new RegularExpressionMatcher();
        String s = "ab";
        String p = ".*";

        boolean actual = sut.isMatch(s, p);

        assertTrue(actual);
    }

    @Test
    void isMatchTest4() {
        RegularExpressionMatcher sut = new RegularExpressionMatcher();
        String s = "terry";
        String p = "terry";

        boolean actual = sut.isMatch(s, p);

        assertTrue(actual);
    }

    @Test
    void isMatchTest5() {
        RegularExpressionMatcher sut = new RegularExpressionMatcher();
        String s = "terry";
        String p = "terryroe";

        boolean actual = sut.isMatch(s, p);

        assertFalse(actual);
    }

    @Test
    void isMatchTest6() {
        RegularExpressionMatcher sut = new RegularExpressionMatcher();
        String s = "aab";
        String p = "c*a*b";

        boolean actual = sut.isMatch(s, p);

        assertTrue(actual);
    }

    @Test
    void isMatchTest7() {
        RegularExpressionMatcher sut = new RegularExpressionMatcher();
        String s = "aab";
        String p = "c*a*bc";

        boolean actual = sut.isMatch(s, p);

        assertFalse(actual);
    }

    @Test
    void isMatchTest8() {
        RegularExpressionMatcher sut = new RegularExpressionMatcher();
        String s = "aaa";
        String p = "a*a";

        boolean actual = sut.isMatch(s, p);

        assertTrue(actual);
    }

    @Test
    void isMatchTest9() {
        RegularExpressionMatcher sut = new RegularExpressionMatcher();
        String s = "aaa";
        String p = "a*ab*c*";

        boolean actual = sut.isMatch(s, p);

        assertTrue(actual);
    }

    @Test
    void isMatchTest10() {
        RegularExpressionMatcher sut = new RegularExpressionMatcher();
        String s = "aaa";
        String p = "ab*a*c*a";

        boolean actual = sut.isMatch(s, p);

        assertTrue(actual);
    }

    @Test
    void isMatchTest11() {
        RegularExpressionMatcher sut = new RegularExpressionMatcher();
        String s = "aaa";
        String p = "ab*aa*c*a";

        boolean actual = sut.isMatch(s, p);

        assertTrue(actual);
    }

    @Test
    void isMatchTest12() {
        RegularExpressionMatcher sut = new RegularExpressionMatcher();
        String s = "aaa";
        String p = "a*aaa";

        boolean actual = sut.isMatch(s, p);

        assertTrue(actual);
    }

    @Test
    void isMatchTest13() {
        RegularExpressionMatcher sut = new RegularExpressionMatcher();
        String s = "aaa";
        String p = "ab*b*a*aa*b*b*b*a";

        boolean actual = sut.isMatch(s, p);

        assertTrue(actual);
    }
}