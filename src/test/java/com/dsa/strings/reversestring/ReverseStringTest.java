package com.dsa.strings.reversestring;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ReverseStringTest {

    @Test
    public void testBruteForceApproach() {
        ReverseStringStrategy strategy = new BruteForceApproach();
        char[] s = {'h', 'e', 'l', 'l', 'o'};
        strategy.reverseString(s);
        assertArrayEquals(new char[]{'o', 'l', 'l', 'e', 'h'}, s);
    }

    @Test
    public void testTwoPointerApproach() {
        ReverseStringStrategy strategy = new TwoPointerApproach();
        char[] s = {'h', 'e', 'l', 'l', 'o'};
        strategy.reverseString(s);
        assertArrayEquals(new char[]{'o', 'l', 'l', 'e', 'h'}, s);
    }
} 