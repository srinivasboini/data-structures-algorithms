package com.dsa.strings.validpalindrome;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class ValidPalindromeTest {

    @Test
    public void testBruteForceApproach() {
        ValidPalindromeStrategy strategy = new BruteForceApproach();
        assertTrue(strategy.isPalindrome("A man, a plan, a canal: Panama"));
        assertFalse(strategy.isPalindrome("race a car"));
    }

    @Test
    public void testTwoPointerApproach() {
        ValidPalindromeStrategy strategy = new TwoPointerApproach();
        assertTrue(strategy.isPalindrome("A man, a plan, a canal: Panama"));
        assertFalse(strategy.isPalindrome("race a car"));
    }
} 