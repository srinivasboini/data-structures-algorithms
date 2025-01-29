package com.dsa.strings.validpalindromeii;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class ValidPalindromeIITest {

    @Test
    public void testBruteForceApproach() {
        ValidPalindromeIIStrategy strategy = new BruteForceApproach();
        assertTrue(strategy.validPalindrome("ramamasr"));
        assertFalse(strategy.validPalindrome("abc"));
    }

    @Test
    public void testTwoPointerApproach() {
        ValidPalindromeIIStrategy strategy = new TwoPointerApproach();
        assertTrue(strategy.validPalindrome("ramamasr"));
        assertFalse(strategy.validPalindrome("abc"));
    }

    @Test
    public void testRecursiveApproach() {
        ValidPalindromeIIStrategy strategy = new RecursiveApproach();
        assertTrue(strategy.validPalindrome("ramamasr"));
        assertFalse(strategy.validPalindrome("abc"));
    }
} 